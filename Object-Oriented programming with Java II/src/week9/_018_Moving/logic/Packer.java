package week9._018_Moving.logic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import week9._018_Moving.domain.Box;
import week9._018_Moving.domain.Thing;

public class Packer {

    private int maximumCapacity;

    public Packer(int maximumCapacity) {
        this.maximumCapacity = maximumCapacity;
    }

    public List<Box> packThings(List<Thing> things) {
       
    	List<Box> ofstuff = new ArrayList<Box>();
    	
    	Box ofThings = new Box(maximumCapacity);
    	
    	for (Thing each: things) {
    		
    		if (each.getVolume() > ofThings.getMax() - ofThings.getVolume()) {
    			ofstuff.add(ofThings);
    			ofThings = new Box(maximumCapacity);
    			ofThings.addThing(each);
    			System.out.println("test1");
    		} else {
    			ofThings.addThing(each);
    			System.out.println("test2");
    		}
    	}
    	ofstuff.add(ofThings);
    	return ofstuff;
    }
}
