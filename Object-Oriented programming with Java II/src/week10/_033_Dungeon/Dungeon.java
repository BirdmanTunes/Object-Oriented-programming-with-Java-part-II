package week10._033_Dungeon;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Dungeon extends Move{
	
	private MapGenerator map;
	
	private Scanner sc = new Scanner(System.in);
	public static int height;
	public static int length;
	private int moves;
	private int vampires;
	private boolean vampiresMove;
	
	//starts the game
	public void run() {
		generateVampires(vampires);
		spawnPlayer();
		spawnVampires();
//		printVamps();
		while (true) {
			remainingTurns();
			remaningVamps();
			map.printMap();
			clearOldPlayerPosition();
			askCommand();
			spawnPlayer();
			killVampIfThere();
			clearOldVampPosition();
			if (vampiresMove) {
				moveOne();
			}
			spawnVampires();
			moves--;
//			printVamps();
			if (moves == 0 || vampiresCove.size() == 0) {
				break;
			}
		}
		endGame();
	}
	
	public Dungeon(int height, int length,  int vampires, int moves, boolean vampiresMove) {
		Dungeon.height=height;
		Dungeon.length=length;
		this.moves=moves;
		this.vampires=vampires;
		this.vampiresMove=vampiresMove;
		map = new MapGenerator(height, length);
		vampiresCove = new ArrayList<Vampire>();
	}
	
	//asks a command from the user and updates player position based on those commands
	public void askCommand() {
		System.out.println("");
		System.out.print("Input steps(max 4): ");
		String commands = sc.nextLine();
		
		int commandLength = 0;
		if (commands.length() > 4) {
			commandLength = 4;
		} else {
			commandLength = commands.length();
		}
		
		for (int i = 0; i < commandLength; i++) {
			if (commands.charAt(i) == 'w' ) {
				me.moveUp();
			} else if (commands.charAt(i) == 's' ) {
				me.moveDown();
			} else if (commands.charAt(i) == 'a' ) {
				me.moveLeft();
			} else if (commands.charAt(i) == 'd' ) {
				me.moveRight();
			}
		}
		System.out.println("");
	}
	
	//prints the endgame text depending if the player lost or won
	public void endGame() {
		if (vampiresCove.size() == 0) {
			System.out.println("Congratulations, all vampires are dead. You won!");
		} else if (moves == 0){
			System.out.println("As the torchlight burns out, the vampires rip you to shreds.");
		}
	}
	
	//spawns the player at current player coordonates
	public void spawnPlayer() {
		map.updateCoords(me.getHeight(), me.getLength(), "@");
	}
	
	//clears the map of the old player position
	public void clearOldPlayerPosition() {
		map.updateCoords(me.getHeight(), me.getLength(), ".");
	}
	
	//clears the map of the old vampires position
	public void clearOldVampPosition() {
		for (Vampire each: vampiresCove) {
				map.updateCoords(each.getRandheight(), each.getRandlenght(), ".");
		}
	}
	
	//checks if the current player position is equal to a vampire and kills it if true
	public void killVampIfThere() {
		boolean check = false;
		for (Vampire each: vampiresCove) {
			if (each.getRandheight() == me.getHeight() && each.getRandlenght() == me.getLength()) {
				check = true;
			}
		}
		if (check) {
			ArrayList<Vampire> toBeRemoved = new ArrayList<Vampire>();
			for (Vampire each: vampiresCove) {
				if (each.getRandheight() == me.getHeight() && each.getRandlenght() == me.getLength()) {
					System.out.println("");
					System.out.println("Vampire Slaughtered!");
					System.out.println("");
					toBeRemoved.add(each);
				} 
			}
			vampiresCove.removeAll(toBeRemoved);
		}
		
		
	}
	
	//prints out the player remaining turns
	public void remainingTurns() {
		System.out.println("Remaining turns: " + (moves -1 ));
	}
	
	//prints out the remaining vampires
	public void remaningVamps() {
		System.out.println("Vampires remanining:" + vampiresCove.size());
		System.out.println("");
	}
	
	//creates a certain number of vampires and adds them to the list based on random positions
	public void generateVampires(int vampires) {
		while (vampiresCove.size() < vampires) {
			vampiresCove.add(new Vampire(height, length));
			removeDoubles();
		}
	}

	//spawns vampires on the map
	public void spawnVampires() {
		for (Vampire each: vampiresCove) {
			map.updateCoords(each.getRandheight(), each.getRandlenght(), "V");
		}
	}
	
	//remove vampires at same coordonates from the list
	public void removeDoubles() {
		ArrayList<Vampire> uniques = new ArrayList<Vampire>();
		for (Vampire element : vampiresCove) {
		  if (!uniques.contains(element)) {
		    uniques.add(element);
		  }
		}
		
		vampiresCove=uniques;
	}
	
	//prints out vampire coordonates
	public void printVamps() {
		for (Vampire each: vampiresCove) {
			System.out.print("H: " + each.getRandheight());
			System.out.println(" L: " + each.getRandlenght());
		}
	}
	
	//prints out player position
	public void printPlayerPos() {
		System.out.println("Player: H: " + me.getHeight() + " L: " + me.getLength());
	}
}
