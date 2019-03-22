package week9._021_Printer;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URI;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) throws FileNotFoundException {
        // The file we read
		
        File file = new File("resource\\test.txt");

        Scanner reader = new Scanner(file);
        while (reader.hasNextLine()) {
            String line = reader.nextLine();
            System.out.println(line);
        }

        reader.close();
        
	}

}
