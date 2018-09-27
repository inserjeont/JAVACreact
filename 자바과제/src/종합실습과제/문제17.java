package 종합실습과제;

import java.util.Scanner;

public class 문제17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		sc.close();
		for (int i = n; m <= i; i--) {
			System.out.print(i+" ");
		}
	}

}
