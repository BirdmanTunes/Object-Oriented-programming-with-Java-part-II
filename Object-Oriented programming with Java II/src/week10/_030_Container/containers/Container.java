package week10._030_Container.containers;

import java.text.DecimalFormat;

public class Container {
	
	DecimalFormat df = new DecimalFormat("#.##");
	private double capacity;
	private double volume;
	private double originalCapacity;
	
	public Container(double capacity) {
		if (capacity < 0) {
			this.capacity=0;
		} else {
			this.capacity=capacity;
		}
		volume=0;
		originalCapacity=capacity;
	}
	
	public double getVolume() {
		return volume;
	}
	
	public double getOriginalCapacity() {
		return originalCapacity;
	}
	
	public double getCurrentCapacity() {
		return capacity;
	}
	
	public void addToTheContainer(double amount) {
		if (amount < 0) {
		} else if (volume + amount >= capacity) {
			volume = capacity;
		} else {
			volume += amount;
		}
	}
	
	public double takeFromTheContainer(double amount) {
		if (amount < 0) {
			return 0;
		} else if (amount > volume) {
			return volume = 0;
		} else {
			return volume -= amount ;
		}
	}
	
	public String toString() {
		return "volume = " + df.format(volume) + ", free space " + df.format((capacity - volume));
	}

}
