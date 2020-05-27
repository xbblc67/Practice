package JavaPracticeNaveen;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		System.out.println("please enter a number");
		
		int num = reader.nextInt();
		
		if (num%2==0) {
			System.out.println("Its a even no");
		}
		else {
			System.out.println("Its odd");
		}
				

	}

}
