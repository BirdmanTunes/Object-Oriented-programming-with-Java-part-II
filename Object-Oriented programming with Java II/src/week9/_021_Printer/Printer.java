package week9._021_Printer;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Printer {
	
	private File fileInput;
	
	public Printer(String fileName) throws Exception {
		fileInput=new File("src\\week9\\_021_Printer\\" +fileName);
	}
	
	public void printLinesWhichContain(String word) throws FileNotFoundException {
		Scanner sc = new Scanner(fileInput);
        
        while (sc.hasNext()) {
            String line = sc.nextLine();
            
            if (line.contains(word)) {
                System.out.println(line);
            }
        }
	}
}
