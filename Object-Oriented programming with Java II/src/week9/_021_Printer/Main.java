package week9._021_Printer;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URI;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {

		Printer printer = new Printer("textfile.txt");

		printer.printLinesWhichContain("Väinämöinen");
		System.out.println("-----");
		printer.printLinesWhichContain("Frank Zappa");
		System.out.println("-----");
		printer.printLinesWhichContain("");
		System.out.println("-----");
	}
}
