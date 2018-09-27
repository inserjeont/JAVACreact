package 종합실습과제;

import java.util.Scanner;

public class 문제04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		sc.close();
		System.out.printf("소문자: %s\n",a);
		System.out.printf("대문자: %S",a);
	}
}
