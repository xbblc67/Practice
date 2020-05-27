package JavaPracticeNaveen;

public class CountingDigits {

	public static void main(String[] args) {
		int num = 1235; int sum = 0; int i =0;
		
		while(num != 0) {
	//		sum = num%10; // 
			num = num/10; // this loop is use to set while counter and also to reduce the digits
			i ++;
		}
		System.out.println(i);
		System.out.println(sum);
		

	}

}
