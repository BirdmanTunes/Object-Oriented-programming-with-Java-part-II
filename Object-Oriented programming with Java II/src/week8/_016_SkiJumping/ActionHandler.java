package week8._016_SkiJumping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class ActionHandler {
	
	private static Random rand = new Random();
	public static ArrayList<Player> list = new ArrayList<Player>();
	
	// starts a new round of jumps for the players
	public static void round(int counter) {
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
			System.out.println("    length: " + jump + " m");
			System.out.print("    judge votes: ");
			printElegantly(scores);
			list.get(j).addJump(jump);
			list.get(j).setScore(jump, scoreTotal(scores));
		}
		System.out.println("");
	}
	
	// creates a random jump length between 60-120
	public static int generateJump(){
		int jumps = rand.nextInt(61) + 60;
		return jumps;
	}
	
	// generates 5 judge grades between 10-20
	public static int[] generateScores() {
		int[] grades = new int[5];
		
		for (int i = 0; i < 5; i++) {
			int judgeScore = rand.nextInt(11) + 10;
			grades[i] = judgeScore;
		}
		return grades;
	}
	
	// returns the score of the middle 3 scores from the judges
	public static int scoreTotal(int[] array) {
		Arrays.sort(array);
		return array[1] + array[2] + array[3];
	}
	
	
	//prints the judge scores elegantly
    public static void printElegantly(int[] array) {
    	System.out.print("[");
        for (int i = 0; i < array.length - 1; i++) {
        	System.out.print(array[i] + ", ");
        }
        System.out.print(array[array.length - 1]);
        System.out.println("]");
    }
    
    // prints all the players
	public static void printAll() {
		for (Player each: list ) {
			System.out.println("  " + (list.indexOf(each) + 1)  + ". " + each);
		}
	}
	
	// prints final tournament scores
    public static void printFinal() {
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
