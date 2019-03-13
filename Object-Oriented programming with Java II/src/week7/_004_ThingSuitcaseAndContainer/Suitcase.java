package week7._004_ThingSuitcaseAndContainer;

import java.util.ArrayList;

public class Suitcase {
	
	private int maxWeight;
	private ArrayList<Thing> things;
	
	public Suitcase(int maxWeight) {
		things = new ArrayList<Thing>();
		this.maxWeight = maxWeight;
	}
	
	public void addThing(Thing thing) {
		if (totalWeight() + thing.getWeight() <= maxWeight) {
			things.add(thing);
		}
	}
	
	public Thing heaviestThing() {
		
		Thing store = new Thing("Nothing", 0);
		for (Thing each:things) {
			if (each.getWeight() > store.getWeight()) {
				store = each;
			}
		}
		if (store.getWeight() == 0) {
			return null;
		} else {
			return store;
		}
	}
	
	public int totalWeight() {
		int totalWeight = 0;
		for (Thing each: things) {
			totalWeight += each.getWeight();
		}
		return totalWeight;
	}
	
	public void printThings() {
		for (Thing each:things) {
			System.out.println(each);
		}
	}
	
	public String toString() {
		if (things.size() == 0) {
			return "empty (" + totalWeight() + " kg)";
		}else if (things.size() == 1) {
			return things.size() + " thing (" + totalWeight() + " kg)";
		} else {
			return things.size() + " things (" + totalWeight() + " kg)";
		}
	}
}
