package week10._031_FarmSimulator.farmsimulator;

import java.util.Collection;
import java.util.LinkedList;

public class Farm implements Alive {
	
	private Barn barn;
	private String owner;
	private Collection<Cow> cows;
	
	public Farm(String owner, Barn barn) {
		this.owner=owner;
		this.barn=barn;
		this.cows = new LinkedList<Cow>();
	}
	
	public void addCow(Cow cow) {
		cows.add(cow);
	}
	
	public void installMilkingRobot(MilkingRobot robot) {
		barn.installMilkingRobot(robot);
	}
	
	public String getOwner() {
		return owner;
	}
	
	public void manageCows() {
		barn.takeCareOf(cows);
	}

	@Override
	public void liveHour() {
		for (Cow each: cows) {
			each.liveHour();
		}
	}
	
	public void farmInfo() {
		System.out.println("Farm owner: " + owner);
		System.out.println("Barn bulk tank: " + barn.toString());
		if (cows.size() == 0) {
			System.out.println("No cows.");
		} else {
			System.out.println("Animals: ");
			for (Cow each: cows) {
				System.out.println("        " + each);
			}
		}
	}
}
