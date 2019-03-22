package week9._022_FileAnalysis;

import java.io.File;

import week9._022_FileAnalysis.file.Analysis;

public class Main {

	public static void main(String[] args) throws Exception{
	    File file = new File("src\\week9\\_022_FileAnalysis\\file\\testfile.txt");
	    Analysis analysis = new Analysis(file);
	    System.out.println("Lines: " + analysis.lines());
	    System.out.println("Characters: " + analysis.characters());
	}
}
