package week7._004_ThingSuitcaseAndContainer;

import java.util.ArrayList;

public class Container {
	
	private int maxWeight;
	private ArrayList<Suitcase> suitcases;
	
	public Container(int maxWeight) {
		suitcases = new ArrayList<Suitcase>();
		this.maxWeight = maxWeight;
	}
	
	public void addSuitcase(Suitcase suit) {
		if (totalWeight() + suit.totalWeight() <= maxWeight) {
			suitcases.add(suit);
		}
	}
	
	public int totalWeight() {
		int totalWeight = 0;
		for (Suitcase each: suitcases) {
			totalWeight += each.totalWeight();
		}
		return totalWeight;
	}
	
	public String toString() {
		return suitcases.size() + " suitcases (" + totalWeight() + " kg)";
	}
	
	public void printThings() {
		for (Suitcase each: suitcases) {
			each.printThings();
		}
	}
}
