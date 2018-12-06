package 테트리스;

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

		// 테트리스맵을 게임판에 나타내기
		for (int i = 0; i < 20; i++) {
			for (int j = 0; j < 10; j++) {
				if (tw.테트리스맵[i][j] > 0) {
					g.setColor(new Color(tw.테트리스맵[i][j]));// 판의 색깔
					g.fillRect(100 + j * 30, 10 + i * 30, 30, 30);// 바둑판 모양
				}
				g.setColor(Color.BLACK);
				g.drawRect(100 + j * 30, 10 + i * 30, 30, 30);
			}
		}

		// 게임판위에 블록조각 얹히기
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if (tw.현재블록[i][j]>0) {
					g.setColor(new Color(tw.현재블록[i][j]));// 판의 색깔
					g.fillRect(100 + (tw.현재블록등장위치x+j) * 30, 10 + (tw.현재블록등장위치y+i) * 30, 30, 30);// 바둑판 모양
				}

			}
		}
	}

}

