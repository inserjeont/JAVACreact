package 종합실습과제;

import java.util.Scanner;

public class 문제11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useDelimiter("\r|\n|,");
		int x1, y1, r1;
		x1 = sc.nextInt();
		y1 = sc.nextInt();
		r1 = sc.nextInt();
		sc.nextLine();

		int x2, y2, r2;
		x2 = sc.nextInt();
		y2 = sc.nextInt();
		r2 = sc.nextInt();
		sc.close();
		int d1 = (int) Math.pow(x2 - (x1), 2);
		int d2 = (int) Math.pow(y2 - (y1), 2);
		int d = d1 + d2;

		int r = (int) Math.pow(r1, 2) + (int) Math.pow(r2, 2);
		if (d >= r) {
			System.out.println("판정: 겹침");
		} else {
			System.out.println("판정: 겹치지 않음");
		}
	}
}
