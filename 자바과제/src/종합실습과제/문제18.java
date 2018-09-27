package 종합실습과제;

import java.util.Scanner;

public class 문제18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char a = sc.next().charAt(0);
		sc.close();
		for (char i = a; i <= 90; i++) {
			System.out.print(i+" ");
		}

	}

}
