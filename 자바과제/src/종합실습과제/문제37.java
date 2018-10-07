import java.util.Scanner;

public class 문제37 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("자연수: ");
		int a = sc.nextInt();
		System.out.print("우박수열: 22");
		while (a > 1) {
			if (a % 2 == 0) {
				a = a / 2;
				System.out.print(" " + a);
			} else if (a % 2 == 1) {
				a = a * 3 + 1;
				System.out.print(" " + a);
			}
		}
	}
}