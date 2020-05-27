package JavaPracticeNaveen;

public class FibonaciSeries {

	public static void main(String[] args) {
		// 0 1 1 2 3 5 8 13 
		// 1 1 2 // t1 t2 Sum
		// 1 2 3 // t1 t2 sum
		// 2 3 5
		
		int t1 = 0; int sum  =0;
		int t2 = 1;
		for(int i =1; i<= 15; i++) {
		System.out.println(t1); // 1
		sum = t1+t2; // 0 + 1 = 1, 
		t1 = t2; // t1  = 1
		t2 = sum; // t2 = 1
	}

}
}
