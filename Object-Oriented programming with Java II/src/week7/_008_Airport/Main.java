package week7._008_Airport;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		String fastTest = "1\n" + "HA-LOL\n" + "42\n" + 
				"1\n" + "G-OWAC\n" + "101\n" + 
				"2\n" + "G-OWAC\n" + "JFK\n" + "BAL\n" +
				"2\n" + "HA-LOL\n" + "BAL\n" + "HEL\n" +
				"x\n" + "1\n" + "2\n" + "3\n" + "HA-LOL\n" + "x\n";
		
		Scanner sc = new Scanner(fastTest);
//		Scanner sc = new Scanner(System.in);

		TextUserInterface ui = new TextUserInterface(sc);
		ui.start();
	}
}
