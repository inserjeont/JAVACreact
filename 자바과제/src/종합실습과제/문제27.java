
public class M27 {
	public static void main(String[] args) {
		for(int i =1;i<=30;i++) {
			if(Integer.toString(i).contains("3")) {
				System.out.println(i+": 짝");
			}
			else if(Integer.toString(i).contains("6")) {
				System.out.println(i+": 짝");
			}
			else if(Integer.toString(i).contains("9")) {
				System.out.println(i+": 짝");
			}
			else {
				System.out.println(i);
			}
		}
	}
}
