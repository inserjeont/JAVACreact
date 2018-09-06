package 제03차시;

public class 실습05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[];
		a=new int[5];
		a[0]=10;
		a[1]=15;
		a[2]=20;
		a[3]=23;
		a[4]=35;
		
		int b[][]= {
						{1,2,3},
						{4,5,6},
						{7,8,9},
						{10,11,12},
						{13,14}
					};
		
		System.out.println("배열 a[]의 크기: "+ a.length);
		System.out.println("배열 b[][]의 크기: "+ b.length);
		System.out.println("배열 b[1]의 크기: "+b[1].length);
		System.out.println("배열 b[4]의 크기: "+b[4].length);
	}

}
