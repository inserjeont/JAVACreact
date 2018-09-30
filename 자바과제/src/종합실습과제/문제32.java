import java.util.Scanner;

public class M32 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		sc.close();
		int sum = 0;
		char p[] = n.toCharArray();
		for (int i = 0; i < p.length; i++) {
			System.out.println(sum);
			sum = sum + (p[i]-'0');
			
		}
		System.out.print("결과: " + sum);
	}
}
