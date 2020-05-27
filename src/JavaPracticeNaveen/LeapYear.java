package JavaPracticeNaveen;

public class LeapYear {

	public static void main(String[] args) {
		// for non century year -  leap year is divisible by 4 
		// for all century years ending with 00
		// but century year leapyear shld be divisible by 4 then check ending with 00 and then shld be perfectly divisible by 400
		// 1900 is not divisible by 400 so not a leapyear but its divisible by 4.
		// 2012 is leapyear its divisible by 400

		int year = 2016;
		boolean leap = false;

		if(year%4==0) {
			if(year%100==0) {
				if(year%400==0) {
					leap = true;
				}
				else {
					leap = false;
				}
			}
			else {
				leap = true;
			}
		}else {
			leap = false;
		}
	


	if(leap) {
		System.out.println("its a leapyear " + year);
	}
	else {
		System.out.println("not a leap year " + year);
	}


}
}

