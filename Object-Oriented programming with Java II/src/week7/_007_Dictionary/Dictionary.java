package week7._007_Dictionary;

import java.util.ArrayList;
import java.util.HashMap;

public class Dictionary {
	
	private HashMap<String, String> words;
	private int amount;
	
	public Dictionary() {
		words = new HashMap<String, String>();
	}
	
	public void add(String word, String translation) {
		words.put(word, translation);
		amount++;
	}
	
	public String translate(String word) {
		if (words.containsKey(word)) {
			return words.get(word);
		}
		return null;
	}
	
	public int amountOfWords() {
		return amount;
	}
	
	public ArrayList<String> translationList(){
		
		ArrayList<String> theList = new ArrayList<String>();
	
		for (String key : words.keySet()) {
			theList.add(key + " = " +translate(key));
		}
		return theList;
	}
	
	public boolean keySetTest(String word) {
		return words.containsKey(word);
	}
}
