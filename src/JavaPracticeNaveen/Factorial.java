package JavaPracticeNaveen;

public class Factorial {

	public static void main(String[] args) {
		int n = 5;
		int fact =1;
		// !0 =1
		for(int i= 1; i<=n; i++) {
			fact = fact*i; // 1*1, 1*2, 2*3, 6*4, 24*5 
		}
		System.out.println(fact);

	}

}
