package week10._033_Dungeon;

import java.util.ArrayList;
import java.util.Random;

public class Move{
	
	public ArrayList<Vampire> vampiresCove = new ArrayList<Vampire>();
	public Player me = new Player();
	private Random rand = new Random();
	
	//moves all the vampires one position if the position is available
	public void moveOne() {
		int move = rand.nextInt(4);
		
		for (int k = 0; k < vampiresCove.size(); k++) {
		
			move = rand.nextInt(4);
			if (move == 0) {
				if (moveLeft(k)) {
				}
			} else if (move == 1) {
				if (moveRight(k)) {
				}
			} else if (move == 2) {
				if (moveUp(k)) {
				}
			} else {
				if (moveDown(k)) {
				}
			}
		}
	}
	
	//moves vampire left if position is available
	public boolean moveLeft(int k) {
		boolean check=true;
		
		for (int j = 0; j < vampiresCove.size(); j++) {
			if (vampiresCove.get(k).getRandlenght() -1 == vampiresCove.get(j).getRandlenght() &&
				vampiresCove.get(k).getRandheight() == vampiresCove.get(j).getRandheight()) {
				check=false;
			}
		}
		if (vampiresCove.get(k).getRandlenght() - 1 == me.getLength() && 
			vampiresCove.get(k).getRandheight() == me.getHeight()) {
			check=false;
		}
		if (vampiresCove.get(k).getRandlenght() -1 < 0){
			check=false;
		}
		if (check) {
		vampiresCove.get(k).updatePos(vampiresCove.get(k).getRandheight(), vampiresCove.get(k).getRandlenght() -1);
		}
		return check;
	}
	
	//moves vampire right if position is available
	public boolean moveRight(int k) {
		boolean check=true;
		
		for (int j = 0; j < vampiresCove.size(); j++) {
			if (vampiresCove.get(k).getRandlenght() + 1 == vampiresCove.get(j).getRandlenght() &&
				vampiresCove.get(k).getRandheight() == vampiresCove.get(j).getRandheight()) {
				check=false;
			}
		}
		if (vampiresCove.get(k).getRandlenght() + 1 == me.getLength() && 
			vampiresCove.get(k).getRandheight() == me.getHeight()) {
			check=false;
			
		}
		if (vampiresCove.get(k).getRandlenght() + 1 > Dungeon.height - 1) {
			check=false;
			
		}
		if (check) {
		vampiresCove.get(k).updatePos(vampiresCove.get(k).getRandheight(), vampiresCove.get(k).getRandlenght() + 1);
		}
		return check;
	}
	
	//moves vampire up if position is available
	public boolean moveUp(int k) {
		boolean check=true;
		
		for (int j = 0; j < vampiresCove.size(); j++) {
			if (vampiresCove.get(k).getRandheight() - 1 == vampiresCove.get(j).getRandheight() &&
				vampiresCove.get(k).getRandlenght() == vampiresCove.get(j).getRandlenght())  {
				check=false;
			}
		}
		if(vampiresCove.get(k).getRandlenght() == me.getLength() && 
		   vampiresCove.get(k).getRandheight() - 1 == me.getHeight()) {
			check=false;
		}
		if(vampiresCove.get(k).getRandheight() - 1 < 0){
			check=false;
		}
		
		if (check) {
		vampiresCove.get(k).updatePos(vampiresCove.get(k).getRandheight() - 1, vampiresCove.get(k).getRandlenght());
		}
		return check;
	}
	
	//moves vampire down if position is available
	public boolean moveDown(int k) {
		boolean check=true;
		
		for (int j = 0; j < vampiresCove.size(); j++) {
			if (vampiresCove.get(k).getRandheight() + 1 == vampiresCove.get(j).getRandheight() &&
				vampiresCove.get(k).getRandlenght() == vampiresCove.get(j).getRandlenght())  {
				check=false;
			}
		}
		if (vampiresCove.get(k).getRandlenght() == me.getLength() && 
			vampiresCove.get(k).getRandheight() + 1 == me.getHeight()) {
			check=false;
		}
		if (vampiresCove.get(k).getRandheight() + 1 > Dungeon.height - 1) {
			check=false;
		}
		if (check ) {
		vampiresCove.get(k).updatePos(vampiresCove.get(k).getRandheight() + 1, vampiresCove.get(k).getRandlenght());
		}
		return check;
	}
}
