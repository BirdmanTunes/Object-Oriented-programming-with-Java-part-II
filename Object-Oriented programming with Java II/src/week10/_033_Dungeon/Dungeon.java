package week10._033_Dungeon;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Dungeon extends Move{
	
	private MapGenerator map;
	
	public static int height;
	private int length;
	private int moves;
	private int vampires;
	
	public void run() {
		generateVampires(vampires);
//		moveOne();
		addVampires();
		killVamp(2, 2);
		printVamps();
		map.printMap();
	}
	
	public Dungeon(int height, int length,  int vampires, int moves, boolean vampiresMove) {
		Dungeon.height=height;
		this.length=length;
		this.moves=moves;
		this.vampires=vampires;
		map = new MapGenerator(height, length);
		vampiresCove = new ArrayList<Vampire>();
	}
	
	public void generateVampires(int vampires) {
		while (vampiresCove.size() < vampires) {
			vampiresCove.add(new Vampire(height, length));
			removeDoubles();
		}
	}
	
	public void addVampires() {
		for (Vampire each: vampiresCove) {
			map.updateCoords(each.getRandheight(), each.getRandlenght());
		}
	}
	
	public void removeDoubles() {
		ArrayList<Vampire> uniques = new ArrayList<Vampire>();
		for (Vampire element : vampiresCove) {
		  if (!uniques.contains(element)) {
		    uniques.add(element);
		  }
		}
		
		vampiresCove=uniques;
	}

	public void printVamps() {
		for (Vampire each: vampiresCove) {
			System.out.print("H: " + each.getRandheight());
			System.out.println(" L: " + each.getRandlenght());
		}
	}
}
