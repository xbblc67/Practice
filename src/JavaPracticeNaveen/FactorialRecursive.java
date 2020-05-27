package JavaPracticeNaveen;

public class FactorialRecursive {
	
	// we can call via static as well

	public static void main(String[] args) {
		FactorialRecursive r  =new FactorialRecursive();
		int rec =  r.recursive(3);
		System.out.println(rec);

	}
	
	public int recursive(int num) {
		if (num!=0) {
			return num*recursive(num-1); // It will return when the no is 0, once the entire loop ends.		
		}
		else {
			return 1;
		}
	}

}
