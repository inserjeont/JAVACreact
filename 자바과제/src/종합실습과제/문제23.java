package 종합실습과제;

public class 문제23 {

	public static void main(String[] args) {
		int g = 0;
		int s = 0;
		for (int i = 1; i <= 1000; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				s+=i;
				g++;
			}
		}
		System.out.println("갯수: "+g);
		System.out.println("합계: "+s);
	}
}
