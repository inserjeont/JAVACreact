package 자바코드업;

import java.util.Scanner;

public class Main1019 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String su = sc.next();
		char[] ch = su.toCharArray();
		while(true) {
			if(ch.equals(".")) {
				System.out.println("%04d.");
			}
		}


	}
}

