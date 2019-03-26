package week10._033_Dungeon;

import java.util.ArrayList;

public class LineGenerator {
	
	ArrayList<String> line;
	
	private int length;
	
	//creates a line of dots of the specified length
	public LineGenerator(int length) {
		line = new ArrayList<String>();
		for (int i = 0; i < length; i++) {
			line.add(".");
		}
	}
	
	//prints the line based on how long the length is
	public void printLine() {
		for (int i=0; i < line.size() -1; i++) {
			System.out.print(line.get(i));
		}
		System.out.println(line.get(line.size() - 1));
	}
	
	//updates the line symbol bales on the given index
	public void setNew(int index, String vampire) {
		line.set(index, vampire);
	}
}
