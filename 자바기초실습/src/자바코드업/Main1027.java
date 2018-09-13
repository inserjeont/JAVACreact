package 자바코드업;

import java.util.Scanner;

public class Main1027 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int y,m,d;
		sc.useDelimiter("\r|\t|\\.");
		y = sc.nextInt();
		m = sc.nextInt();
		d = sc.nextInt();
		sc.close();
		System.out.printf("%02d-%02d-%04d",d,m,y);
	}
}
