package JavaPracticeNaveen;

public class BinaryToDecimal {

	public static void main(String[] args) {
		long bin = 1010;
		double num = BinaryToDecimalno(bin);
		System.out.println(num);

	}
// 1010 = 1*(2^3) + 0*(2^2) + 1*(2^1) + 0*(2^0)
	// for higher to lower divide, lower to higher multiply it.
	public static double BinaryToDecimalno(long num) {
		
		// We need to divide by 10 bcz we are need the last digits same like reversing no and all
		
		double decimalnumber = 0; int i =0;
		while(num!=0) {
			long remainder = num%10;
			num = num/10;
			decimalnumber = decimalnumber + (remainder*Math.pow(2, i));
			i++;		
		}
		return decimalnumber;
		
	}  
}
