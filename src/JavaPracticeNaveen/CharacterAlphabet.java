package JavaPracticeNaveen;

public class CharacterAlphabet {

	public static void main(String[] args) {
		char c = '1';
		if((c >= 'a' && c<='z') || (c>='A' && c<='Z')){
			System.out.println("Its an alphabet");
		}
		else {
			System.out.println("Its not an alphabet");
		}
	}

}
