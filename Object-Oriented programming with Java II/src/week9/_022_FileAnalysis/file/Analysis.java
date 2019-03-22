package week9._022_FileAnalysis.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Analysis {
	
	private File file;
	private Scanner sc;
	
	public Analysis(File file) {
		this.file = file;
	}
	
	public int lines() throws Exception {
		sc = new Scanner(file, "UTF-8");
		int lines = 0;
		while (sc.hasNext()) {
			lines++;
			sc.nextLine();
		}
		return lines;
	}
	
	public int characters() throws Exception {
		sc = new Scanner(file, "UTF-8");
		int chars = 0;
		while (sc.hasNext()) {
			String line = sc.nextLine();
			chars += line.length() + 1;
		}
		return chars;
	}
}
