package week8._016_SkiJumping;

import java.util.ArrayList;

public class Player implements Comparable<Player> {
	
	private String playerName;
	public int totalScore;
	private ArrayList<Integer> jumpLength;
	
	
	public Player(String playerName) {
		this.playerName=playerName;
		this.totalScore=0;
		this.jumpLength= new ArrayList<Integer>();
	}
	
	public void setScore(int jumpScore, int judgeScore) {
		totalScore += jumpScore + judgeScore;
	}
	
	public void addJump(int jump) {
		jumpLength.add(jump);
	}
	
	public int getScore() {
		return totalScore;
	}
	
	public String getName() {
		return playerName;
	}
	
	public int getJumpLength(int index) {
		return jumpLength.get(index);
	}
	
	public int jumpSize() {
		return jumpLength.size();
	}
    
    @Override
	public String toString() {
		return playerName + " (" + totalScore + " points)";
	}
	
    @Override
	public int compareTo(Player test) {
		if (this.getScore() == test.getScore())
			return 0;
		if (this.getScore() < test.getScore())
			return 1;
		else
			return -1;
	}
}
