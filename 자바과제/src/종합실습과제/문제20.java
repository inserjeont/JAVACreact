package 종합실습과제;

import java.util.Scanner;

public class 문제20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String jumin = sc.next();
		char pn[] =jumin.toCharArray();
		int x = 2;
		int s = 0;
		int t = 0;
		for (int i = 0; i < 12; i++) {
			pn[i]-='0';
			s+=pn[i]*x;
			System.out.println(s);
			x++;
			if (x == 9)
				x = 2;
		}
		t = s % 11;
		System.out.println(s);
		System.out.println(t);
		System.out.println((11 - t) % 10);
	}
}
