package week11._035_TwoDirectionDictionary;

import java.io.FileNotFoundException;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		
		MindfulDictionary dict = new MindfulDictionary("file.txt");
		dict.load();

		dict.add("apina", "monkey");
		dict.add("banaani", "banana");
		dict.add("ohjelmointi", "programming");

		dict.save();
	}
}
