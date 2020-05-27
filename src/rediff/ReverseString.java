package rediff;

public class ReverseString {

	public static void main(String[] args) {
		// Reverse a string
		String S = "Selenium";
		String rev = "";
		int length  = S.length();
		for(int i = length-1; i>=0; i--) {
			rev = rev + S.charAt(i);

	}
System.out.println(rev);

// 2. Using String Buffer Class

   StringBuffer sf = new StringBuffer(S);
   System.out.println(sf.reverse());

}}

