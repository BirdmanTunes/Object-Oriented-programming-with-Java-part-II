package week10._032_DifferentBoxes.boxes;

import java.util.ArrayList;
import java.util.List;

import week10._032_DifferentBoxes.Box;
import week10._032_DifferentBoxes.Thing;

public class MaxWeightBox extends Box {
	
	private int weight;
	private List<Thing> things;
	
	public MaxWeightBox(int weight) {
		this.weight = weight;
		things = new ArrayList<Thing>();
	}

	@Override
	public void add(Thing thing) {
		int total=0;
		
		for (Thing each: things) {
			total += each.getWeight();
		}
		if (total + thing.getWeight() > weight) {
			System.out.println("Not enough room!");
		} else {
			things.add(thing);
		}
	}

	@Override
	public boolean isInTheBox(Thing thing) {
		return things.contains(thing);
	}

}
