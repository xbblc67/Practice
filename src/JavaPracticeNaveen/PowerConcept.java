package JavaPracticeNaveen;

public class PowerConcept {

	public static void main(String[] args) {
		int base = 2; int result = 1;
		int exponent = 3;
		while(exponent != 0) {
			result = result * base; // 1* 2, 2*2, 4*2, 8*2
			exponent--;
		}
		System.out.println(result); 
		
//		System.out.println(Math.pow(base, exponent));

	}

}
