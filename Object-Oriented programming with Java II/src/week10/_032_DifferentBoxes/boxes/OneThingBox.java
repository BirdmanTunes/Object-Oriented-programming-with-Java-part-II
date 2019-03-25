package week10._032_DifferentBoxes.boxes;

import java.util.ArrayList;
import java.util.List;

import week10._032_DifferentBoxes.Box;
import week10._032_DifferentBoxes.Thing;

public class OneThingBox extends Box{
	
	private List<Thing> things;

	public OneThingBox() {
		this.things = new ArrayList<Thing>();
	}

	@Override
	public void add(Thing thing) {
		if (things.size() > 0) {
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
