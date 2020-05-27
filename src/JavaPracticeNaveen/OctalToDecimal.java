package JavaPracticeNaveen;

public class OctalToDecimal {

	// 37 = 3*8^1 + 7*8^0
	public static void main(String[] args) {
		int bin = 37;
		double num = OctalToDecimalno(bin);
		System.out.println(num);

	}

	public static double OctalToDecimalno(int num) {
		
		double decimalnumber = 0; int i =0;
		while(num!=0) {
			int remainder = num%10;
			num = num/10;
			decimalnumber = decimalnumber + (remainder*Math.pow(8, i));
			i++;	
		}
		return decimalnumber;
		
	}
}
