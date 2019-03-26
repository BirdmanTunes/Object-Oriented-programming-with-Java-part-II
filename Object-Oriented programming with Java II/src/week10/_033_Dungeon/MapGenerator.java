package week10._033_Dungeon;

import java.util.ArrayList;

public class MapGenerator {
	
	ArrayList<LineGenerator> full;
	
	public MapGenerator(int height, int length) {
		full = new ArrayList<LineGenerator>();
		for (int i = 0; i < height; i++) {
			full.add(new LineGenerator(length));
		}
	}
	
	public void updateCoords(int height, int length) {
		full.get(height).setNew(length,"V");
	}
	
	public void printMap() {
		for (LineGenerator each: full) {
			each.printLine();
		}
	}
}
