package week10._033_Dungeon;

import java.util.Random;

public class Vampire{
	
	Random rand = new Random();
	
	private int randheight;
	private int randlenght;
	
	public Vampire(int height, int length) {
		randheight = rand.nextInt(height);
		randlenght = rand.nextInt(length);
		while (randheight == 0 && randlenght == 0) {
			randheight = rand.nextInt(height);
			randlenght = rand.nextInt(length);
		}
	}
	
	public int getRandheight() {
		return randheight;
	}

	public int getRandlenght() {
		return randlenght;
	}
	
	public void updatePos(int height, int length) {
		randheight = height;
		randlenght = length;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vampire other = (Vampire) obj;
		if (randheight == other.randheight && randlenght == other.randlenght) {
			return true;
		}
		return false;
	}
	
	public String toString() {
		return "V H:" + randheight + " L:" + randheight;
	}
}
