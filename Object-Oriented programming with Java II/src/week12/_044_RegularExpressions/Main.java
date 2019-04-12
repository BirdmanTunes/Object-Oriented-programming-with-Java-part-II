package week12._044_RegularExpressions;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		
		System.out.println(clockTime(input));
	}
	
	public static boolean isAWeekDay(String string) {
		return string.matches("mon|tue|wed|thu|fri|sat|sun");
	}
	
	public static boolean allVowels(String string) {
		return string.matches("[aeiou]+");
	}
	
	public static boolean clockTime(String string) {
		return string.matches("[0-2][0-9]:[0-5][0-9]:[0-5][0-9]");
	}

}
