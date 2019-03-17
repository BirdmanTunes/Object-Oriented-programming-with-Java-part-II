package week7._011_BoxesAndThings;

import java.util.ArrayList;

public class Box implements ToBeStored{
	
	private double maxWeight;
	private double weight;
	private ArrayList<ToBeStored> boxy;
	private int thingsInside;
	
	
	public Box(double maxWeight) {
		this.maxWeight=maxWeight;
		this.boxy = new ArrayList<ToBeStored>();
		this.weight=0;
		this.thingsInside=0;
	}
	
	public double weight() {
		//commented out because it prevents boxes from being stored into boxes
//		double totalWeight = 0;
//		for (ToBeStored each: boxy) {
//			totalWeight += each.weight();
//		}
//		return totalWeight;
		return weight;
	}
	
	public void add(ToBeStored stuff) {
		
		if (weight + stuff.weight() <= maxWeight) {
			boxy.add(stuff);
			weight += stuff.weight();
			thingsInside++;
		}
	}
	
	public String toString() {
		if (thingsInside > 1)
			return "Box: " + thingsInside + " things, total weight " + weight + " kg";
		else {
			return "Box: " + thingsInside + " thing, total weight " + weight + " kg";
		}
	}
}
