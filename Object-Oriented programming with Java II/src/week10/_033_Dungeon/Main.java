package week10._033_Dungeon;

import java.util.ArrayList;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Random rand = new Random();
		Dungeon game = new Dungeon(3, 3, 4, 15, true);
		System.out.println("");
		game.run();
	}
}
