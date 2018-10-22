package 종합실습과제;

public class 문제24 {

	public static void main(String[] args) {
		for(int i=32;i<=127;i++) {
			System.out.print(i+" "+(char)i+" ");
			int c=i;
			if(c%10==1) {
				System.out.println();
			}
				
		}
	}
}
