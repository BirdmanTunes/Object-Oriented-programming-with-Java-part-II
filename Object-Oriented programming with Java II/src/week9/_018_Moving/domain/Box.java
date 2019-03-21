package week9._018_Moving.domain;

import java.util.ArrayList;

public class Box implements Thing{
	
	private int maximumCapacity;
	private int volumeInside;
	private ArrayList<Thing> list;
	
	public Box(int maximumCapacity) {
		this.maximumCapacity=maximumCapacity;
		this.volumeInside = 0;
		list = new ArrayList<Thing>();
	}
	
    public boolean addThing(Thing thing) {
        if (this.getVolume() + thing.getVolume() > maximumCapacity) {
            return false;
        }
        list.add(thing);
        volumeInside += thing.getVolume();
        
        return true;
    }
	
	public int getVolume() {
		return volumeInside;
	}
	
	public int getMax() {
		return maximumCapacity;
	}
}
