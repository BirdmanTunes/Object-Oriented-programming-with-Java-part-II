package week8._016_SkiJumping;

import java.util.Scanner;

public class UserInterface {
	
	Scanner sc = new Scanner(System.in);
	
	//initializes the main menu
	public void start() {
		System.out.println("Kumpula ski jumping week");
		System.out.println("");
		System.out.println("Write the names of the participants one at a time; an empty string brings you to the jumping phase.");
		System.out.println("");
				
		while (true) {
			System.out.print("Participant name: ");
			String name = sc.nextLine();
			if (name.equals("")) {
				break;
			} else {
				ActionHandler.list.add(new Player(name));
			}
		}
		
		System.out.println("");
		System.out.println("The tournament begins!");
		System.out.println("");
		
		int i = 1;
		
		while (true) {
			
			System.out.print("Write 'jump' to jump; otherwise you quit: ");
			String command = sc.nextLine();
				if (command.equals("")) {
					break;
				} else if (command.equalsIgnoreCase("jump")){
					ActionHandler.round(i);
					i++;
				}
				
		}
		System.out.println("");
		System.out.println("Thanks!");
		System.out.println("");
		System.out.println("Tournament results:");
		System.out.println("Position    Name");
		ActionHandler.printFinal();
	}
}
