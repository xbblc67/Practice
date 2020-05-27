package JavaPracticeNaveen;

public class Palindrome {

	public static void main(String[] args) {
		// 121
		int num = 1331; int rev = 0; int n; int actualno = num;
		while(num!=0) {
			n = num%10;
		    rev = rev*10 + n;
		    num = num/10;
		    
		}
		System.out.println(rev);
		if (rev== actualno) {
			System.out.println("Its a palindrome no");
		}
		else {
			System.out.println("Its not a palindrome");
		}
	}

}
