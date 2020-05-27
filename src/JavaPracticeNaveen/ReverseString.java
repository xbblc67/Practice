package JavaPracticeNaveen;

public class ReverseString {

	public static void main(String[] args) {
		String str = "Priya"; String rev ="";
	//char c [10]= charAt(Str);
		int len = str.length();
		for(int i=len-1; i>=0; i--) {
		rev = rev + str.charAt(i);

	}
	System.out.println(rev);
	}

}
