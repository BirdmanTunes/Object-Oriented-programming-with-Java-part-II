package week7._008_Airport;

public class Planes {
	
	private String name;
	private int capacity;
	private String departure;
	private String destination;
	
	public Planes (String name, int capacity) {
		this.name=name;
		this.capacity=capacity;
		this.departure="";
		this.destination="";
	}
	
	public Planes (String name, int capacity, String departure, String destination) {
		this.name=name;
		this.capacity=capacity;
		this.departure=departure;
		this.destination=destination;
	}
	
	public String getName() {
		return name;
	}
	
	public void setCapacity(int newCapacity) {
		capacity=newCapacity;
	}
	
	public void setFlights(String newDeparture, String newDestination) {
		departure=newDeparture;
		destination=newDestination;
	}
	
	public String printPlane() {
		return name + " (" + capacity + " ppl)";
	}
	
	public String toString() {
		return name + " (" + capacity + " ppl) (" + departure + "-" + destination + ")";
	}
}
