package 종합실습과제;

public class 문제19 {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				i = i * -1;
				System.out.print(i);
				sum += i;
				i=i*-1;
			} else if(i==1){
				System.out.print(i);
				sum += i;
			}
			else {
				System.out.print("+"+i);
				sum += i;
			}
		}
		System.out.print("= " + sum);
	}

}
