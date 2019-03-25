package week10._031_FarmSimulator.farmsimulator;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Cow implements Milkable, Alive{
	
	Random rand = new Random();
	
	private String name;
	private double udderCapacity;
	private double inUdder;
	
	private static final String[] NAMES = new String[]{
	        "Anu", "Arpa", "Essi", "Heluna", "Hely",
	        "Hento", "Hilke", "Hilsu", "Hymy", "Ihq", "Ilme", "Ilo",
	        "Jaana", "Jami", "Jatta", "Laku", "Liekki",
	        "Mainikki", "Mella", "Mimmi", "Naatti",
	        "Nina", "Nyytti", "Papu", "Pullukka", "Pulu",
	        "Rima", "Soma", "Sylkki", "Valpu", "Virpi"};
	
	public Cow() {
		name = NAMES[rand.nextInt(31)];
		udderCapacity = 15 + rand.nextInt(26);
		inUdder=0;
	}
	
	public Cow(String name) {
		this.name=name;
		udderCapacity = 15 + rand.nextInt(26);
		inUdder=0;
	}
	
	public String getName() {
		return name;
	}
	
	double getCapacity() {
		return udderCapacity;
	}
	
	double getAmount() {
		return inUdder;
	}
	
	public String toString() {
		return name + " " + String.format("%.2f", inUdder) + "/" + udderCapacity;
	}

	@Override
	public void liveHour() {
		double num = ThreadLocalRandom.current().nextDouble(0.7, 2);
		if (num >= udderCapacity - inUdder) {
			inUdder=udderCapacity;
		} else {
			inUdder += num;
		}
	}

	@Override
	public double milk() {
		double bucket = inUdder;
		inUdder = 0;
		return bucket;
	}
}
