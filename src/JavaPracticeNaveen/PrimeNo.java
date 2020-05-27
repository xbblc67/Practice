package JavaPracticeNaveen;

public class PrimeNo {

	public static void main(String[] args) {
		range(10);
		
		

	}
	
	public static void range(int num) {
		for(int i = 2; i<=num; i++) {
			prime(i);
		}
	}


	public static boolean prime(int num) {
		boolean flag = true;
		if (num ==1) {
			flag = false;
		}
		
		for(int i=2; i<=num/2; i++) {
			if(num%i==0) {
				flag = false;
				break;
			}
		}
		if(flag) {
			System.out.println(num+ " Its a prime no");
		}
		else {
			System.out.println(num + " Its not a prime no");
		}
		return flag;
	}
	
}




