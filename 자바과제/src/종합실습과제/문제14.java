package 종합실습과제;

import java.util.Scanner;

public class 문제14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();
		System.out.printf("월: %d\n",a);
		switch (a) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.printf("%d월의 마지막 날은 31일입니다.",a);
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.printf("%d월의 마지막 날은 30일입니다.",a);
		default:
			System.out.printf("%d월의 마지막 날은 28일입니다.",a);
		}
	}

}
