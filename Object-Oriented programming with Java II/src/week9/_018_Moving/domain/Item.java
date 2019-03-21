package week9._018_Moving.domain;
import week9._018_Moving.domain.Thing;

public class Item implements Thing, Comparable<Item>{
	
	private final String name;
	private final int volume;
	
	public Item(String name, int volume) {
		this.name=name;
		this.volume=volume;
	}
	
	public String getName() {
		return name;
	}
	
	public int getVolume(){
		return volume;
	}
	
	
	public String toString() {
		return name + " (" + volume + " dm^3)";
	}
	
	public int compareTo(Item item) {
		return this.volume - item.volume;
	}
}
