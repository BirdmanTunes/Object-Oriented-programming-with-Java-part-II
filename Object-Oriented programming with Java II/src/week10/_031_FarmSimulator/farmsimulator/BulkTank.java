package week10._031_FarmSimulator.farmsimulator;

public class BulkTank {
	
	private double capacity;
	private double volume;
	
	
	public BulkTank() {
		capacity=2000;
		volume=0;
	}
	
	public BulkTank(double capacity) {
		this.capacity=capacity;
		volume=0;
	}
	
	public double getCapacity() {
		return capacity;
	}
	
	public double getVolume() {
		return volume;
	}
	
	public double howMuchFreeSpace() {
		return capacity-volume;
	}
	
	public void addToTank(double amount) {
		if (amount < 0) {
		} else if (volume + amount >= capacity) {
			volume = capacity;
		} else {
			volume += amount;
		}
	}
	
	public double getFromTank(double amount) {
		if (amount < 0) {
			return 0;
		} else if (amount > volume) {
			return volume = 0;
		} else {
			return volume -= amount ;
		}
	}
	
	@Override
	public String toString() {
		return String.format("%.2f", volume) + "/" + capacity;
	}


}
