package JavaPracticeNaveen;

public class LCM {
	// first find the greatest of two no then use increment until it is dividied by both n1 & n2.

	public static void main(String[] args) {
		int n1 = 2; int n2 = 3; int n3 = 0;
		// n3  = (n1>n2)?n1:n2
		if(n1>n2) {
			n3 = n1;
		}
		else {
			n3 = n2;
		}
		while(true) {
			if((n3 % n1==0) && (n3 % n2==0)) {
				break;
			}
			else {
				n3++;
			}
		}
		System.out.println("LCM of " + n1 + "and " + n2 +"is " + n3);
	}
}
