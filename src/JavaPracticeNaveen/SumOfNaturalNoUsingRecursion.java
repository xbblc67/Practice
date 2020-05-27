package JavaPracticeNaveen;

public class SumOfNaturalNoUsingRecursion {

	public static void main(String[] args) {
		int num = 2;
		int sum =  add(num);
		System.out.println(sum + "sum ");
	}

	public static int add(int num) {
		if(num!=0) {
			return num + add(num-1);	// 2 + add(1) 1+ add(0)  0
			}
		else {
			return num;

		}
	}

}
