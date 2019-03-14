package week7._007_Dictionary;

import java.util.Scanner;

public class TextUserInterface {
	
	private Scanner reader;
	private Dictionary dictionary;

	public TextUserInterface(Scanner reader, Dictionary dictionary) {
		this.reader = reader;
		this.dictionary = new Dictionary();
	}
	
	public void start() {
        System.out.println("Statements:");
        System.out.println("  add - adds a word pair to the dictionary");
        System.out.println("  translate - asks a word and prints its translation");
        System.out.println("  quit - quit the text user interface");
        System.out.println("");
        
		while (true) {
			System.out.print("Statement: ");
			String sc = reader.nextLine();
			
			if (sc.equals("quit")){
				System.out.println("Cheers!");
				break;
			} else if (sc.equals("add")){
				addTest();
			} else if (sc.equals("translate")) {
				translate();
			} else {
				System.out.println("Unknown command.");
				System.out.println("");
			}
		}
	}
	
	private void addTest() {
		System.out.print("In Finnish: ");
		String word = reader.nextLine();
		System.out.print("Translation: ");
		String translation = reader.nextLine();
		System.out.println("");
		dictionary.add(word, translation);
	}
	
	private void translate() {
		System.out.print("Give a word: ");
		String word = reader.nextLine();
		if (dictionary.keySetTest(word)){
			System.out.println("Translation: " + dictionary.translate(word));
			System.out.println("");
		} else {
			System.out.println("Unknown word!");
			System.out.println("");
		}
	}
}
