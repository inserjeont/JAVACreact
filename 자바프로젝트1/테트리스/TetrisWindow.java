
package 테트리스;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class TetrisWindow extends JFrame implements ActionListener, KeyListener {
	TetrisBoard tb;

	String[] 버튼제목 = { "게임시작", "블록교체", "블록회전", "게임종료" };
	JButton[] 명령버튼 = new JButton[4];
	// 버튼 배열
	JLabel 기록레이블;

	// 3단계
	int[] 색상;
	int[][] 테트리스맵 = new int[20][10];
	int[][][] 모든블록;
	int[][] 현재블록;
	int 블록번호, 현재블록등장위치x, 현재블록등장위치y;
	boolean 바닥인가;
	int score=0;

	//
	int minX, minY, maxX, maxY;

	public TetrisWindow() {

		this.setTitle("재원의 Tetris");// 제목
		this.setSize(500, 730);// 크기
		this.getContentPane().setBackground(new Color(0xE9BFCD));// 색
		this.setLocationRelativeTo(null);// 창의 위치
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setResizable(false);// 화면 사이즈 고정
		this.setVisible(true);// 창을 보이게 해줌

		this.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
		// Border 레이아웃을 Flow 레이아웃으로 변경
		JPanel firstPanel = new JPanel(); // 적재 배치
		firstPanel.setPreferredSize(new Dimension(500, 40));// 적재 위치
		firstPanel.setBackground(Color.GREEN);// 색
		firstPanel.setOpaque(true);// 투명도
		this.add(firstPanel);

		for (int i = 0; i < 명령버튼.length; i++)// 버튼 4개
		{
			명령버튼[i] = new JButton(버튼제목[i]);
			firstPanel.add(명령버튼[i]);
		}

		// 스코어
		기록레이블 = new JLabel("score", JLabel.CENTER);
		기록레이블.setPreferredSize(new Dimension(60, 25));
		기록레이블.setBackground(Color.PINK);
		기록레이블.setOpaque(true);
		firstPanel.add(기록레이블);

		// 명령버튼에 이벤트 처리
		for (int i = 0; i < 4; i++)
			this.명령버튼[i].addActionListener(this);

		// 화면 그래픽 갱신
		this.repaint();
		this.revalidate();

	}

	void initialize() {
		// 7개의 블록조각의 색상을 정한다.
		this.색상 = new int[] { 0x010101, 0x0000ff, 0xff0000, 0xffff00, 0x00ff00, 0xff00ff, 0x00ffff };

		// 7개 블록조각을 만든다.
		this.모든블록 = new int[][][] { { { 색상[0], 색상[0], 0, 0 }, { 색상[0], 색상[0], 0, 0 }, { 색상[0], 색상[0], 0, 0 }, { 색상[0], 색상[0], 0, 0 } },
				{ { 0, 0, 0, 0 }, { 0, 0, 0, 0 }, { 색상[1], 0, 0, 0 }, { 색상[1], 색상[1], 색상[1], 0 } },
				{ { 0, 0, 0, 0 }, { 색상[2], 0, 0, 0 }, { 색상[2], 0, 0, 0 }, { 색상[2], 색상[2], 0, 0 } },
				{ { 0, 0, 0, 0 }, { 0, 0, 0, 0 }, { 색상[3], 색상[3], 0, 0 }, { 색상[3], 색상[3], 0, 0 } },
				{ { 0, 0, 0, 0 }, { 색상[4], 0, 0, 0 }, { 색상[4], 색상[4], 0, 0 }, { 색상[4], 0, 0, 0 } },
				{ { 0, 0, 0, 0 }, { 색상[5], 0, 0, 0 }, { 색상[5], 색상[5], 0, 0 }, { 0, 색상[5], 0, 0 } },
				{ { 0, 0, 0, 0 }, { 0, 0, 0, 0 }, { 색상[6], 색상[6], 0, 0 }, { 0, 색상[6], 색상[6], 0 } }

		};

		// 테트리스 게임판을 초기화한다.
		for (int i = 0; i < 20; i++)
			for (int j = 0; j < 10; j++)
				this.테트리스맵[i][j] = 0;

		// 게임을 위한 변수를 초기화한다.
		this.블록번호 = 0;
		this.현재블록 = 모든블록[블록번호].clone();
		this.현재블록등장위치x = 0;
		this.현재블록등장위치y = 0;
	}

	void drawTetrisBoard(int 블록번호, int x, int y) {

		this.블록번호 = 블록번호;
		this.현재블록 = this.모든블록[this.블록번호].clone();
		this.현재블록등장위치x = x;
		this.현재블록등장위치y = y;

		tb.repaint();
		tb.revalidate();
	}

	void moveTetrisBlock(int x, int y) {
		this.현재블록등장위치x += x;
		this.현재블록등장위치y += y;

		// 현재블록의 내부 조각의 범위를 알아낸다.
		getMinXMinYMaxXMaxY(현재블록);

		// 현재블록이 테트리스맵의 범위를 벗어나지 않도록 한다.
		if (haveBlockTroubles(현재블록) == true) {
			this.현재블록등장위치x -= x;
			this.현재블록등장위치y -= y;
		}

		// 바닥인지 검사한다.
		this.바닥인가 = isBottom();

		tb.repaint();
		tb.revalidate();
	}

	boolean isBottom() {
		if (this.현재블록등장위치y + this.maxY >= 19)
			return true;

		for (int i = maxY; i >= minY; i--) {
			for (int j = minX; j <= maxX; j++) {
				if (현재블록[i][j] > 0) {
					if (테트리스맵[현재블록등장위치y + i + 1][현재블록등장위치x + j] > 0)
						return true;
				}
			}
		}

		return false;
	}

	boolean haveBlockTroubles(int[][] 지금블록) {
		getMinXMinYMaxXMaxY(지금블록);

		if (this.현재블록등장위치x + this.maxX > 9)
			return true;
		if (this.현재블록등장위치x < 0)
			return true;
		if (this.현재블록등장위치y + this.maxY > 19)
			return true;

		for (int i = maxY; i >= minY; i--) {
			for (int j = minX; j <= maxX; j++) {
				if (지금블록[i][j] > 0) {
					if (테트리스맵[현재블록등장위치y + i][현재블록등장위치x + j] > 0)
						return true;
				}
			}
		}

		return false;
	}

	void removeFullLines() {
		for (int i = 19; i >= 0; i--) {
			// 현재 i행의 블럭 개수를 모두 센다.
			int cnt = 0;
			for (int j = 0; j < 10; j++)
				if (테트리스맵[i][j] > 0)
					cnt++;

			if (cnt < 10)continue;
			for (int m = i; m >= 1; m--)
				for (int n = 0; n < 10; n++) {
					테트리스맵[m][n] = 테트리스맵[m - 1][n];
					테트리스맵[m - 1][n] = 0;
				}
			//점수추가
			score+=10;
			this.기록레이블.setText(score+"점");
			
			//
			i++;
		}

	}

	void rotateTetrisBlock() {
		// 현재블록을 회전
		int[][] 회전블록 = new int[4][4];

		// 회전
		for (int i = 0; i < 4; i++)
			for (int j = 0; j < 4; j++)
				회전블록[j][3 - i] = 현재블록[i][j];

		// 블록 내부 조각의 존재범위알기
		getMinXMinYMaxXMaxY(회전블록);

		// 좌측 하단으로 붙임.

		int 좌측이동칸수 = minX;
		int 하단이동칸수 = 3 - maxY;
		for (int i = maxY; i >= minY; i--) {
			for (int j = minX; j <= maxX; j++) {
				int 값 = 회전블록[i][j];
				회전블록[i][j] = 0;
				회전블록[i + 하단이동칸수][j - 좌측이동칸수] = 값;

			}
		}

		if (haveBlockTroubles(회전블록) == false)
			현재블록 = 회전블록;

		tb.repaint();
		tb.revalidate();
	}

	void getMinXMinYMaxXMaxY(int[][] 지금블록) {
		minX = minY = 999;
		maxX = maxY = 0;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if (지금블록[i][j] > 0) {
					minX = Math.min(minX, j);
					maxX = Math.max(maxX, j);
					minY = Math.min(minY, i);
					maxY = Math.max(maxY, i);
				}
			}
		}
	}

	void recordInTetrisMap() {
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if (현재블록[i][j] > 0) {
					테트리스맵[현재블록등장위치y + i][현재블록등장위치x + j] = 현재블록[i][j];
				}
			}
		}
	}

	// 버튼 이벤트
	public void actionPerformed(ActionEvent e) {
		JButton jb = (JButton) e.getSource();
		if (jb.getText().equals("게임시작")) {
			try {
				this.removeKeyListener(this);
			} catch (Exception e1) {
			}
			this.addKeyListener(this);
			this.requestFocus();

		}

		else if (jb.getText().equals("블록교체")) {
			this.블록번호 = (this.블록번호 + 1) % 7;
			drawTetrisBoard(this.블록번호, this.현재블록등장위치x, this.현재블록등장위치y);
			this.requestFocus();
			if (haveBlockTroubles(현재블록) == true) {
				this.현재블록등장위치x -= 1;
			}

		}

		else if (jb.getText().equals("블록회전")) {
			rotateTetrisBlock();
		} else if (jb.getText().equals("게임종료"))
			System.exit(0);
	}

	// 키입력의 이동
	public void keyPressed(KeyEvent key) {
		switch (key.getKeyCode()) {
		case KeyEvent.VK_LEFT:
			moveTetrisBlock(-1, 0);
			break;
		case KeyEvent.VK_RIGHT:
			moveTetrisBlock(1, 0);
			break;
		case KeyEvent.VK_UP:
			rotateTetrisBlock();
			break;
		case KeyEvent.VK_DOWN:
			moveTetrisBlock(0, 1);
			break;
		case KeyEvent.VK_SPACE:
			바닥인가 = false;
			while (바닥인가 == false) {
				moveTetrisBlock(0, 1);
			}

			// 현재블록을 테트리스 맵에 기록한다.
			recordInTetrisMap();

			// 모두 채워진 줄들을 제거한다.

			// 새로운 블록을 등장시킨다.
			drawTetrisBoard((블록번호 + 1) % 7, 0, 0);

			break;
		}
		removeFullLines();

	}

	public void keyReleased(KeyEvent arg0) {

	}

	public void keyTyped(KeyEvent arg0) {

	}
}
