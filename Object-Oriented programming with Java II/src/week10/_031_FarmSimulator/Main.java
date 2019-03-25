package week10._031_FarmSimulator;

import week10._031_FarmSimulator.farmsimulator.Barn;
import week10._031_FarmSimulator.farmsimulator.BulkTank;
import week10._031_FarmSimulator.farmsimulator.Cow;
import week10._031_FarmSimulator.farmsimulator.Farm;
import week10._031_FarmSimulator.farmsimulator.MilkingRobot;

public class Main {
	
	public static void main(String[] args) {
		
		Farm farm = new Farm("Esko", new Barn(new BulkTank()));
		MilkingRobot robot = new MilkingRobot();
		farm.installMilkingRobot(robot);

		farm.addCow(new Cow());
		farm.addCow(new Cow());
		farm.addCow(new Cow());

		farm.liveHour();
		farm.liveHour();

		farm.manageCows();
		
		farm.farmInfo();
	}
}
