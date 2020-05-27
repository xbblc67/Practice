package JavaPracticeNaveen;

public class NoIsAdditionOfTwoPrimeNo {

	public static void main(String[] args) {
		// 34  = 31 + 3; 
		int num = 10;
		boolean flag = true;
		
		for(int i=2;i<=num/2;i++) {
			
		if (checkprime(i)) {
			
			if(checkprime(num-i)) {
				System.out.println(num + "=" + i + " + " + (num-i));
				flag = false;
			}
		}

	}
		if(flag) {
			System.out.println(num + "It can't be expressed as sum of two prime no");
		}
	}
	public static boolean checkprime(int num) {
		boolean flag = true;
		for(int i=2;i<=num/2;i++) {
			if(num%i==0) {
				flag = false;
				break;
			}
		}
		return flag ;
	}
		
	}


