package JavaPracticeNaveen;

import java.util.ArrayList;
//25/2 = 12 rem 1
//12/2 = 6 rem 0
//6/2 = 3 rem 0
//3/2 = 1 rem 1

// Binary digits are stored in long

public class DecimalToBinary {

	public static void main(String[] args) {
		ArrayList<Long> arr = new ArrayList<Long>();
		int num = 78;
		while(num!=0) {  // Store all the remainders and then reverse it.
			long rem = num%2;
			arr.add(rem);
			num = num/2;	
		}
		for(int i =arr.size()-1; i>=0;i--) {		
			System.out.print(arr.get(i));
		}
		

	}

}
