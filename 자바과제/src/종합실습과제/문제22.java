package 종합실습과제;

import java.util.Scanner;

public class 문제22 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int c = 0;
		System.out.println("자연수 n: " + n);
		System.out.println("약수 :");
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				System.out.printf(i + " ");
				c++;
			}
		}
		System.out.print("\n");
		System.out.println("약수의 갯수: " + c);
	}
}
