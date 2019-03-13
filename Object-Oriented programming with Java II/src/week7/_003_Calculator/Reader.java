package week7._003_Calculator;

import java.util.Scanner;

public class Reader {
	
	private final Scanner sc = new Scanner(System.in);
	
	public String readString() {
		return sc.nextLine();
	}
	
	public int readInteger() {
		return Integer.parseInt(sc.nextLine());
	}
}
