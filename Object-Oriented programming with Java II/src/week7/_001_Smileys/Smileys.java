package week7._001_Smileys;

public class Smileys {

	public static void main(String[] args) {
		printWithSmileys("\\:D/");
		printWithSmileys("87.");
        printWithSmileys("Meth");
        printWithSmileys("Bee");
        printWithSmileys("123456");
        printWithSmileys("dsadsadasdsadsa");
	}
	
	private static void printWithSmileys(String characterString) {
		
		if (characterString.length() % 2 == 1) {
			printOneSmiley(characterString.length() / 2 + 4);
			System.out.println("");
			printOneSmiley(1);
			System.out.print(" " + characterString + "  ");
			printOneSmiley(1);
			System.out.println("");
			printOneSmiley(characterString.length() / 2 + 4);
			System.out.println("");

		} else {
			printOneSmiley(characterString.length() / 2 + 3);
			System.out.println("");
			printOneSmiley(1);
			System.out.print(" " + characterString + " ");
			printOneSmiley(1);
			System.out.println("");
			printOneSmiley(characterString.length() / 2 + 3);
			System.out.println("");
			}
	}
	
	public static void printOneSmiley(int number) {
		for (int i = 0; i < number; i++) {
			System.out.print(":)");
		}
	}
}
