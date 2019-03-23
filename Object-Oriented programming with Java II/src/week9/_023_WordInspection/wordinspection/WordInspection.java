package week9._023_WordInspection.wordinspection;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WordInspection {
	
	private File file;
	
	public WordInspection(File file) throws FileNotFoundException {
		this.file=file;
	}
	
	public int wordCount() throws FileNotFoundException {
		Scanner sc= new Scanner(file, "UTF-8");
		int words = 0;
		
		while(sc.hasNext()) {
			words++;
			String word = sc.next();
		}
		sc.close();
		return words;
	}

	public int wordsWithZ() throws FileNotFoundException {
		Scanner sc= new Scanner(file, "UTF-8");
		int wordswithZ = 0;
		
		while(sc.hasNext()) {
			if (sc.next().contains("z")) {
				wordswithZ++;
			}
		}
		return wordswithZ;
	}
	
	public List<String> wordsEndingInL() throws FileNotFoundException {
		Scanner sc= new Scanner(file, "UTF-8");
		List<String> list = new ArrayList<String>();
		
		while (sc.hasNext()) {
			String wordEndInL = sc.next();
			
			if (wordEndInL.endsWith("l")) {
				list.add(wordEndInL);
			}
		}
		return list;
	}
	
	public List<String> palindromes() throws FileNotFoundException {
		Scanner sc= new Scanner(file, "UTF-8");
		List<String> list = new ArrayList<String>();
		
		while(sc.hasNext()) {
			String word = sc.next();
			String reverse = reverse(word);
			if (word.equalsIgnoreCase(reverse)) {
				list.add(word);
			}
		}
		return list;
	}
	
	public List<String> wordsWhichContainAllVowels() throws FileNotFoundException {
		Scanner sc= new Scanner(file, "UTF-8");
		List<String> list = new ArrayList<String>();
		char[] vowels = "aeiouyäö".toCharArray();
		
		while(sc.hasNext()) {
			String word = sc.next();
			boolean hasAll = true;
			
			for (char each: vowels) {
				if (!word.contains("" + each)) {
					hasAll = false;
				}
			}
			if (hasAll) {
				list.add(word);
			}
		}
		return list;
	}
	
	public static String reverse(String word) {
		String reversed= "";
		
		for (int i = word.length() - 1; i >= 0; i--) {
			reversed += word.charAt(i);
		}
		return reversed;
	}
}