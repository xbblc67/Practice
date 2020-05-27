package JavaPracticeNaveen;

public class ArmstrogNo {

	public static void main(String[] args) {
		int rem = 0; double exp = 0; int num = 153; 
		int actualno = num; int low = 15;
		int high =154;
		
		
		int power = count(num);
		while(num!=0) {
			rem = num%10;
			exp = exp + res(power, rem);
			num = num/10;
		}
		if(exp == actualno) {
			System.out.println("its armstrong" + exp);
		}
		else {
			System.out.println("its not armstrong" + exp);
		}
		
	

	}
	
	public static int count(int num) { 
		int i = 0;
		while(num!=0) {
			num = num/10;
			i++;
		}
		return i;
		
	}
	public static int res(int power, int num) {
		int res = 1;
		while(power!=0) {
			res = res*num;
			power--;
		}
		return res;

	}

}
