package 종합실습과제;

import java.util.Scanner;

public class 문제05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();
		System.out.printf("%02d시간%02d분%02d초",a/3600,(a%3600)/60,a%60);
	}

}
