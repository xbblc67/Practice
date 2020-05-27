package JavaPracticeNaveen;

import java.util.ArrayList;

// 78/8 = 9 rem 6
// 9/8 = 1 rem 1
// 1/8 = 0 rem 1
public class DecimalToOctal {

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		int num = 78;
		while(num!=0) {  // Divide by 8 and Store all the remainders and then reverse it.
			int rem = num%8;
			arr.add(rem);
			num = num/8;	
		}

		for(int i =arr.size()-1; i>=0;i--) {		
			System.out.print(arr.get(i));
		} 
		

	}

}
