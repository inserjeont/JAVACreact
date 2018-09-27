package 종합실습과제;

import java.util.Scanner;

public class 문제10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		sc.close();
		System.out.printf("주민등록번호: %s\n", a);
		if (a.charAt(7)==3) {
			System.out.printf("남자");
		}
		System.out.printf("여자");
	}
}
