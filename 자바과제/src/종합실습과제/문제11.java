package 종합실습과제;

import java.util.Scanner;

public class 문제11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useDelimiter("\r|\n|,");

		System.out.printf("원(x1,y1,r1): ");
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		int r1 = sc.nextInt();
		

		System.out.printf("원(x2,y2,r2): ");
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		int r2 = sc.nextInt();
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
