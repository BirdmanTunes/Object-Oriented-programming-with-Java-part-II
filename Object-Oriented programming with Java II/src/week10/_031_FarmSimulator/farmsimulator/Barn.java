package week10._031_FarmSimulator.farmsimulator;

import java.util.Collection;

public class Barn {

	BulkTank tank;
	MilkingRobot robot;

	public Barn(BulkTank tank) {
		this.tank = tank;
		this.robot = null;
	}

	public BulkTank getBulkTank() {
		return tank;
	}

	public void installMilkingRobot(MilkingRobot milkingRobot) {
		this.robot = milkingRobot;
		this.robot.setBulkTank(tank);
	}

	public void takeCareOf(Cow cow) {
		try {
			this.robot.milk(cow);
		} catch (Exception e) {
			throw new IllegalStateException();
		}
	}

	public void takeCareOf(Collection<Cow> cows) {
		for (Cow each : cows)
		{
			takeCareOf(each);
		}
	}
	
	public String toString() {
		return tank.toString();
	}
}
