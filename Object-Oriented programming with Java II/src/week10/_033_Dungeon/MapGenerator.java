package week10._033_Dungeon;

import java.util.ArrayList;

public class MapGenerator {
	
	ArrayList<LineGenerator> fillWithLines;
	
	//adds all the lines to the map and creates it
	public MapGenerator(int height, int length) {
		fillWithLines = new ArrayList<LineGenerator>();
		for (int i = 0; i < height; i++) {
			fillWithLines.add(new LineGenerator(length));
		}
	}
	
	//updates the graphic on the map at those coordonates
	public void updateCoords(int height, int length, String symbol) {
		fillWithLines.get(height).setNew(length, symbol);
	}
	
	//prints the map
	public void printMap() {
		for (LineGenerator eachLine: fillWithLines) {
			eachLine.printLine();
		}
	}
}
