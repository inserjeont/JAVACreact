package 종합실습과제;

import java.util.Scanner;

public class 문제09 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int a =sc.nextInt();
		sc.close();
		if(a<=6 || a>=70) {
			System.out.println("무료입장");
		}
		else {
			System.out.println("유료입장");
		}
	}

}
