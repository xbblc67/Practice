package JavaPracticeNaveen;

import java.util.Scanner;

public class VowelandConsonant {

	public static void main(String[] args) {
       char ch = 'a';
		
		if (ch == 'a' || ch=='e'  || ch=='i' || ch=='o'|| ch=='u') {
			System.out.println("its a vowel");
		}
		else {
			System.out.println("Its a consonant");
		}
		
		// By swichcase

		switch(ch){
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				System.out.println("Its a vowel " + ch);
				break;
				default:
					System.out.println("Its a consonant");
					break;
			
		}
	}

}
