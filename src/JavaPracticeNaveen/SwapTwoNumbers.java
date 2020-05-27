package JavaPracticeNaveen;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int temp;
		
	/*	temp = a;
		a = b;
		b = temp;
		
		System.out.println(a);
		System.out.println(b); */
		
		// without tempvariable
		
		a = a+b; // 30
		b = a-b; // 10
		a = a-b; // 20
		
		System.out.println(a);
		System.out.println(b);
		
		

	}

}
