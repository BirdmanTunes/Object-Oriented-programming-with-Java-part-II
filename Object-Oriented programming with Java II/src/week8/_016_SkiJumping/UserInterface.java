package week8._016_SkiJumping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class UserInterface {
	
	Scanner sc = new Scanner(System.in);
	Random rand = new Random();
	private ArrayList<Player> list = new ArrayList<Player>();
	
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
				list.add(new Player(name));
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
					round(i);
					i++;
				}
				
		}
		System.out.println("");
		System.out.println("Thanks!");
		System.out.println("");
		System.out.println("Tournament results:");
		System.out.println("Position    Name");
		printFinal();
	}
	
	public void round(int counter) {
		System.out.println("");
		System.out.println("Round " + counter);
		System.out.println("");
		System.out.println("Jumping order: ");
		Collections.sort(list);
		printAll();
		System.out.println("");
		System.out.println("Results of round " + counter);
		
		for (int j=0; j < list.size(); j++) {
			int[] scores = generateScores();
			int jump = generateJump();
			System.out.println("  " + list.get(j).getName());
			System.out.println("    length: " + jump);
			System.out.print("    judge votes: ");
			printElegantly(scores);
			list.get(j).addJump(jump);
			list.get(j).setScore(jump, scoreTotal(scores));
		}
		System.out.println("");
	}
	
	public int generateJump(){
		int jumps = rand.nextInt(61) + 60;
		return jumps;
	}
	
	public int[] generateScores() {
		int[] grades = new int[5];
		
		for (int i = 0; i < 5; i++) {
			int judgeScore = rand.nextInt(11) + 10;
			grades[i] = judgeScore;
		}
		return grades;
	}
	
	public static int scoreTotal(int[] array) {
		Arrays.sort(array);
		return array[1] + array[2] + array[3];
	}
	
    public static void printElegantly(int[] array) {
    	System.out.print("[");
        for (int i = 0; i < array.length - 1; i++) {
        	System.out.print(array[i] + ", ");
        }
        System.out.print(array[array.length - 1]);
        System.out.println("]");
    }
    
	public void printAll() {
		for (Player each: list ) {
			System.out.println("  " + (list.indexOf(each) + 1)  + ". " + each);
		}
	}
	
    public void printFinal() {
    	for (Player each: list) {
    		System.out.println((list.indexOf(each) + 1) + "           " + each);
    		System.out.print("            jump lengths: ");
    		for (int i =0; i < each.jumpSize() - 1; i++) {
    			System.out.print(each.getJumpLength(i));
    			System.out.print(" m, ");
    		}
    		System.out.println(each.getJumpLength(each.jumpSize() - 1) + " m");
    	}
    }
}
