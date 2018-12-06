package 테트리스
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.JPanel;

public class TetrisBoard extends JPanel {
	TetrisWindow tw;

	public TetrisBoard() {
		this.setPreferredSize(new Dimension(500, 650));
		this.setBackground(Color.ORANGE);

	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		// 테트리스게임판을 표시한다.
		for (int i = 0; i < 20; i++) {
			for (int j = 0; j < 10; j++) {
				if (tw.테트리스맵[i][j] > 0) {
					g.setColor(new Color(tw.�뀒�듃由ъ뒪留�[i][j]));// �뙋�쓽 �깋源�
					g.fillRect(100 + j * 30, 10 + i * 30, 30, 30);// 諛붾몣�뙋 紐⑥뼇
				}
				g.setColor(Color.BLACK);
				g.drawRect(100 + j * 30, 10 + i * 30, 30, 30);
			}
		}

		//현재블록을 게임판 위에 얹힌다.
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if (tw.�쁽�옱釉붾줉[i][j]>0) {
					g.setColor(new Color(tw.현재블록[i][j]));// �뙋�쓽 �깋源�
					g.fillRect(100 + (tw.현재블록등장위치+j) * 30, 10 + (tw.현재블록등장위치+i) * 30, 30, 30);// 諛붾몣�뙋 紐⑥뼇
				}

			}
		}
	}

}

