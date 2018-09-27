package 종합실습과제;

import java.util.Scanner;

public class 문제03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();
		System.out.printf("섭씨온도 (C):%d\n",a);
		System.out.printf("화씨온도 (F):%.2f",(float)(a*1.8)+32);
	}

}
