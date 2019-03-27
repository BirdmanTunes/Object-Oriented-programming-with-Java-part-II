package week11._034_FileManager;

import java.io.FileWriter;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws Exception {
		FileManager f = new FileManager();
		
		ArrayList<String> wordlist = new ArrayList<String>();
		
		wordlist.add("fourth");
		wordlist.add("fifth");
		wordlist.add("sixth");
		
		f.save("file.txt", "");

		f.save("file.txt", "first\nsecond\nthird");
		
		for (String line : f.read("file.txt"))
		{
			System.out.println(line);
		}
		
		f.save("file.txt", wordlist);
		
		for (String line : f.read("file.txt"))
		{
			System.out.println(line);
		}
	}
}
