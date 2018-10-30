package 종합실습과제;

import java.util.Scanner;

public class 문제08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();
		System.out.printf("정수: %d\n",a);
		System.out.printf("절대값: %d",a<0?-a:a);
	}
}