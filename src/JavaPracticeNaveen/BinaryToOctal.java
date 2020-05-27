package JavaPracticeNaveen;

import java.util.ArrayList;

public class BinaryToOctal {

	public static void main(String[] args) {
		// first binary to decimal then decimal to octal no
		int num = 1111;
		int decimal = BinaryToDecimal(num);
	//	System.out.println(decimal);
	    DecimalToOctal(decimal);

	}
	public static int BinaryToDecimal(int num) {
		int decimal = 0; int remainder = 0; int i=1;
		while(num!=0) {
			remainder = num % 10;
	//		decimal = decimal + (remainder*Math.pow(2, i)); // math.pow return double as type
			decimal = decimal + remainder*i;
			i = i*2;
			num = num/10;
		
		}
		return decimal;
	}
	public static void DecimalToOctal(int num) {
		int remainder = 0;
		ArrayList<Integer> arr = new ArrayList<Integer>();
		while(num!=0) {
			remainder  = num%8;
			num = num/8;
			arr.add(remainder);
		}
		for(int i=arr.size()-1;i>=0;i--) {
			System.out.print(arr.get(i));
		}
	}

}
