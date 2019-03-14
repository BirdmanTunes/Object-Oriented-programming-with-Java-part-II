package week7._008_Airport;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//		Planes first = new Planes("test", 40, "JFK", "HEL");
//		Planes second = new Planes("test2", 100, "BAL", "HEL");
		
		PlaneList list = new PlaneList();
		
//		list.addPlane(first);
//		list.addPlane(second);
//		list.printPlanesFull();
//		System.out.println("");
//		list.printPlanes();
//		list.printPlane("test");
		
		String fastTest = "1\n" + "HA-LOL\n" + "42\n" + 
				"1\n" + "G-OWAC\n" + "101\n" + 
				"2\n" + "G-OWAC\n" + "HEL\n" + "BAL\n" +
				"2\n" + "HA-LOL\n" + "BAL\n" + "HEL\n" +
				"x\n" + "1\n" + "2\n" + "3\n" + "HA-LOL\n" + "x\n";
		
		String fastTest2 = "1\n";
		
//		Scanner sc = new Scanner(fastTest2);
		Scanner sc = new Scanner(System.in);

		TextUserInterface ui = new TextUserInterface(sc, list);
		ui.start();
	}
}
