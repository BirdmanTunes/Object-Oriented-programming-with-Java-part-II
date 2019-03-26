package week10._033_Dungeon;

public class Player {
	
	private int height;
	private int length;
	
	public Player() {
		height = 0;
		length = 0;
	}
	
	public int getHeight() {
		return height;
	}
	
	public int getLength() {
		return length;
	}
	
	public void movePlayer(int height, int length) {
		this.height=height;
		this.length=length;
	}
	
	//moves player left if wall not there
	public void moveLeft() {
		if (length - 1 < 0) {
		} else {
			length -= 1;
		}
	}
	
	//moves player right if wall not there
	public void moveRight() {
		if (length+1 > Dungeon.height -1) {
		} else {
			length += 1;
		}
	}
	
	//moves player up if wall not there
	public void moveUp() {
		if (height-1 < 0) {
		} else {
			height -= 1;
		}
	}
	
	//moves player down if wall not there
	public void moveDown() {
		if (height+1 > Dungeon.height -1) {
		} else {
			height += 1;
		}
	}

}
