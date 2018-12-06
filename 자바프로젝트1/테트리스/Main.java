package 테트리스;

public class Main{

	public static void main(String[] args) {
		TetrisWindow tw = new TetrisWindow();
		TetrisBoard tb = new TetrisBoard(); //JPanel만들어짐
		tw.add(tb); //테트리스 윈도우 판에 JPanel추가함
		
		tw.tb = tb;
		tb.tw = tw;
		
		tw.initialize();
		tw.drawTetrisBoard(0, 0, 0);
	}
	
}