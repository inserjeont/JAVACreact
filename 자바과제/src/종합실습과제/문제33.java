import java.util.Scanner;

public class 문제33 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String su = sc.next();
		char d[] = su.toCharArray();
		int c = 0;
		int j = d.length - 1;
		for (int i = 0; i < d.length / 2; i++) {

			if (d[i] == d[j - i]) {
				c++;
			}
			if (d[i] != d[j - i]) {
				System.out.print("비대칭수");
				break;
			}
		}
		if (c == j / 2) {
			System.out.print("대칭수");
		}
	}
}
