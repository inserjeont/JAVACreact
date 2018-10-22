package 종합실습과제;

import java.util.Scanner;

public class 문제25 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		System.out.println("자연수 n: "+n);
		for (int i = 1; i <= n; i++) {
			sum+=i;
			System.out.print(sum+" ");
		}
	}

}
