package week11._043_GameOfLife.gameoflife;


import java.util.Random;

import gameoflife.GameOfLifeBoard;



public class PersonalBoard extends GameOfLifeBoard {

	public PersonalBoard(int width, int height) {
		super(width, height);
		
	}

	@Override
	public void turnToLiving(int x, int y) {
		if (!(getWidth() > x) || !(x < 0) || !(getHeight() > y) || !(y < 0)) 
			getBoard()[y][x] = true;
	}

	@Override
	public void turnToDead(int x, int y) {
		if (!(getWidth() < x) || !(x < 0) || !(getHeight() > y) || !(y < 0)) 
			getBoard()[y][x] = false;
	}

	@Override
	public boolean isAlive(int x, int y) {
		return getBoard()[y][x];
	}

	@Override
	public void initiateRandomCells(double probabilityForEachCell) {
		Random rand = new Random();
		double cell= 0;
		for (int i = 0; i < getBoard().length; i++) {
			for (int j = 0; j < getBoard()[i].length; j++) {
				cell = rand.nextDouble();
				if (cell < probabilityForEachCell) {
					getBoard()[i][j] = true;
				}
			}
		}
	}

	@Override
	public int getNumberOfLivingNeighbours(int x, int y) {
		int counter = 0;
		// upper left corner
		if (!(x == 0) && !(y == 0)) {
			if (isAlive(x-1, y-1)) {
				counter++;
			}
		}
		// lower left corner
		if (!(x == getWidth() - 1) && !(y == 0)) {
			if (isAlive(x+1, y-1)) {
				counter++;
			}
		}
		// upper right corner
		if (!(x == 0) && !(y == getWidth()- 1)) {
			if (isAlive(x-1, y+1)) {
				counter++;
			}
		}
		// lower right corner
		if (!(x == getHeight() -1 ) && !(y == getWidth() -1)) {
			if (isAlive(x+1, y+1)) {
				counter++;
			}
		}
		// left side
		if (!(y == 0)){
			if (isAlive(x, y -1))
				counter++;
		}
		// right side
		if (!(y == getWidth() -1)){
			if (isAlive(x, y +1))
				counter++;
		}
		// up side
		if (!(x == 0)){
			if (isAlive(x - 1, y))
				counter++;
		}
		// down side
		if (!(x == getHeight()-1)){
			if (isAlive(x + 1, y))
				counter++;
		}
		

		return counter;
	}

	@Override
	public void manageCell(int x, int y, int livingNeighbours) {
		if (isAlive(x, y) && livingNeighbours < 2) turnToDead(x, y);
		if (isAlive(x, y) && livingNeighbours > 3) turnToDead(x, y);
		if (!isAlive(x, y) && livingNeighbours == 3) turnToLiving(x, y);
		
	}
	
	
}
