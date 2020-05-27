package JavaPracticeNaveen;

public class HCF {

	public static void main(String[] args) {
		int n1= 3; int n2 = 15; int n3=1;
			n3  = (n1>n2)?n1:n2;
		while(true) {
			if(n1%n3==0 && n2%n3==0) {
				break;
			}
			else {
				n3--;
			}
		}
		System.out.println(n3);
	}
}
