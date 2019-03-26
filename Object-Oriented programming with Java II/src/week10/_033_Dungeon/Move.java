package week10._033_Dungeon;

import java.util.ArrayList;
import java.util.Random;

public class Move{
	
	public ArrayList<Vampire> vampiresCove = new ArrayList<Vampire>();
	private Random rand = new Random();
	
	public void moveOne() {
		int move = rand.nextInt(4);
		
		for (int k = 0; k < vampiresCove.size(); k++) {
			
			while(true) {
				move = rand.nextInt(4);
				
				if (move == 0) {
					if (moveLeft(k)) {
						break;
					}
				} else if (move == 1) {
					if (moveRight(k)) {
						break;
					}
				} else if (move == 2) {
					if (moveUp(k)) {
						break;
					}
				} else {
					if (moveDown(k)) {
						break;
					}
				}
			}
		}
	}
	
	public void killVamp(int height, int length) {
		for (Vampire each: vampiresCove) {
			if (each.getRandheight() == height && each.getRandlenght() == length) {
				System.out.println("vampire slaughtered");
				vampiresCove.remove(each);
			}
		}
	}
	
	public boolean moveLeft(int k) {
		boolean check=true;
		
		for (int j = 0; j < vampiresCove.size(); j++) {
			if (vampiresCove.get(k).getRandlenght() -1 == vampiresCove.get(j).getRandlenght() &&
				vampiresCove.get(k).getRandheight() == vampiresCove.get(j).getRandheight() &&
				vampiresCove.get(k) !=	vampiresCove.get(j) || vampiresCove.get(k).getRandlenght() -1 < 0) {
				check=false;
			}
		}
		if (check) {
		System.out.println("moved left");
		vampiresCove.get(k).updatePos(vampiresCove.get(k).getRandheight(), vampiresCove.get(k).getRandlenght() -1);
		}
		return check;
	}
	
	public boolean moveRight(int k) {
		boolean check=true;
		
		for (int j = 0; j < vampiresCove.size(); j++) {
			if (vampiresCove.get(k).getRandlenght() + 1 == vampiresCove.get(j).getRandlenght() &&
				vampiresCove.get(k).getRandheight() == vampiresCove.get(j).getRandheight() &&
				vampiresCove.get(k) !=	vampiresCove.get(j) || vampiresCove.get(k).getRandlenght() + 1 > Dungeon.height - 1)  {
				check=false;
			}
		}
		if (check) {
		System.out.println("moved right");
		vampiresCove.get(k).updatePos(vampiresCove.get(k).getRandheight(), vampiresCove.get(k).getRandlenght() + 1);
		}
		return check;
	}
	
	public boolean moveUp(int k) {
		boolean check=true;
		
		for (int j = 0; j < vampiresCove.size(); j++) {
			if (vampiresCove.get(k).getRandheight() - 1 == vampiresCove.get(j).getRandheight() &&
				vampiresCove.get(k).getRandlenght() == vampiresCove.get(j).getRandlenght() &&
				vampiresCove.get(k) !=	vampiresCove.get(j) || vampiresCove.get(k).getRandheight() - 1 < 0)  {
				check=false;
			}
		}
		if (check) {
		System.out.println("moved up");
		vampiresCove.get(k).updatePos(vampiresCove.get(k).getRandheight() - 1, vampiresCove.get(k).getRandlenght());
		}
		return check;
	}
	
	public boolean moveDown(int k) {
		boolean check=true;
		
		for (int j = 0; j < vampiresCove.size(); j++) {
			if (vampiresCove.get(k).getRandheight() + 1 == vampiresCove.get(j).getRandheight() &&
				vampiresCove.get(k).getRandlenght() == vampiresCove.get(j).getRandlenght() &&
				vampiresCove.get(k) !=	vampiresCove.get(j) || vampiresCove.get(k).getRandheight() + 1 > Dungeon.height - 1)  {
				check=false;
			}
		}
		if (check) {
		System.out.println("moved down");
		vampiresCove.get(k).updatePos(vampiresCove.get(k).getRandheight() + 1, vampiresCove.get(k).getRandlenght());
		}
		return check;
	}

}
