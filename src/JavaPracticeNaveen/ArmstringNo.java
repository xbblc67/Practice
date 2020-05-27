package JavaPracticeNaveen;

import java.util.Scanner;

public class ArmstringNo {

	public static void main(String[] args) {
		// 153 = 1*1*1 + 5*5*5 + 3*3*3 = 153
		// 1634 its armstrong no
		
		Scanner sc = new Scanner(System.in);
		System.out.print("please enter the starting no ");
		int num = sc.nextInt();
		System.out.print("please enter the ending no ");
		int limit = sc.nextInt();		
		range(limit,num);
		

	}
	
	public static void range(int limit, int num) {
		for(int i = num;i<=limit;i++) {
			int power = count(num);
			int actualno = i; 
			armstrong(power,i,actualno);
		}

	}


	// count for the power
	public static int count(int num) { 
		int i = 0;
		while(num!=0) {
			num = num/10;
			i++;
		}
		return i;
		
	}

	// final addition
	public static void armstrong (int power, int num, int actualno) {
		int expo = 0; int r = 1;
		while(num!=0) {
			r = num%10;
			expo = expo + res(power,r); // not using inbuilt function
			num = num/10;			
		}
		if (expo==actualno) {
			System.out.println("Its armstrong " + expo);
		}
		
		else {
			System.out.println("Its not an armstrong " + expo);
		}
	}

	// multiply 1*1*1 
	public static int res(int power, int num) {
		int res = 1;
		while(power!=0) {
			res = res*num;
			power--;
		}
		return res;

	}

}
