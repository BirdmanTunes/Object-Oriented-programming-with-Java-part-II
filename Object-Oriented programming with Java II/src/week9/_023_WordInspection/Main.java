package week9._023_WordInspection;

import java.io.File;
import java.util.Scanner;

import week9._023_WordInspection.wordinspection.WordInspection;

public class Main {
	
	public static void main(String[] args) throws Exception {
		
		File file = new File("src/week9/_023_WordInspection/shortList.txt");
		
		WordInspection inspector = new WordInspection(file);
		
		System.out.println("Wordcount is: " + inspector.wordCount());
		System.out.println("Words with z: " + inspector.wordsWithZ());
		System.out.println("words ending in l: " +inspector.wordsEndingInL());
		System.out.println("Palindromes: " + inspector.palindromes());
		System.out.println("WOrds with all vowels: " + inspector.wordsWhichContainAllVowels());
	}
}


