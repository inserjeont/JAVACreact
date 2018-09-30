import java.util.Scanner;

public class 문제33 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		char p[] = n.toCharArray();
		int i, j;
		for (i = 0; i <= (p.length-1)/2; i++) {
			for (j =p.length; j >= (p.length-1)-i; j--) {
				System.out.println("tet");
				if (p[i]==p[j]) {
					System.out.println("대칭수");

				}
				/*if (p[i] != p[j]) {
					System.out.print("비대칭수");
					break;
				}*/
			}
		}
		System.out.println("tt");
	}
}
//(p.length - 1) / 2
//p.length - 1