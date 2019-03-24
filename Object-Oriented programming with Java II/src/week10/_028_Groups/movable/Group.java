package week10._028_Groups.movable;

import java.util.ArrayList;

public class Group implements Movable{
	
	private ArrayList<Movable> organisms;
	
	public Group() {
		this.organisms = new ArrayList<Movable>(); 
	}
	
	public void addToGroup(Movable movable) {
		organisms.add(movable);
	}
	
	@Override
	public void move(int dx, int dy) {
		
	}
	
	@Override
	public String toString() {
		String output = "";
		
		for (Movable organ : organisms) {
			output += organ + "\n";
		}
		return output;
	}

}
