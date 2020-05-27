package JavaPracticeNaveen;

import java.util.ArrayList;

public class FactorsOfNo {

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		int num =10;
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				arr.add(i);
			}
		}
      System.out.println("factors are" + arr);
	}

}
