package week10._033_Dungeon;

import java.util.ArrayList;

public class LineGenerator {
	
	ArrayList<String> line;
	
	private int length;
	
	public LineGenerator(int length) {
		line = new ArrayList<String>();
		for (int i = 0; i < length; i++) {
			line.add(".");
		}
	}
	
	public void printLine() {
		for (int i=0; i < line.size() -1; i++) {
			System.out.print(line.get(i));
		}
		System.out.println(line.get(line.size() - 1));
	}
	
	public void setNew(int index, String vampire) {
		line.set(index, vampire);
	}
}
