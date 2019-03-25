package week10._031_FarmSimulator.farmsimulator;

public class MilkingRobot {
	
	BulkTank tank;
	
	public MilkingRobot() {
		tank = null;
	}
	
	public BulkTank getBulkTank() {
		return tank;
	}
	
	public void setBulkTank(BulkTank tank) {
		this.tank = tank;
	}
	
	public void milk(Milkable milkable) {
		try {
		tank.addToTank(milkable.milk());
		} catch (Exception e) {
			System.out.println("The MilkingRobot hasn't been installed!");
		}
	}

}
