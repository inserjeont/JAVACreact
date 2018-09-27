package 종합실습과제;

import java.util.Scanner;

public class 문제12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int s = a + b;
		sc.close();
		System.out.printf("두 과목 점수: %d,%d\n", a, b);
		if (s >= 60 && a >= 40 && b >= 40)
			System.out.println("결과: 합격");
		System.out.println("결과: 불합격(과락)");
	}
}
