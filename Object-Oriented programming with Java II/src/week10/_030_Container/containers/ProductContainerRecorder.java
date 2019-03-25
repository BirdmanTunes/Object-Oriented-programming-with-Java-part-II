package week10._030_Container.containers;

public class ProductContainerRecorder extends ProductContainer{
	
	private ContainerHistory historic;
	
	public ProductContainerRecorder(String productName, double capacity, double initialVolume) {
		super(productName, capacity);
		super.addToTheContainer(initialVolume);
		this.historic= new ContainerHistory();
		this.historic.add(initialVolume);
	}
	
	public String history() {
		return historic.toString();
	}
	
	public void addToTheContainer(double amount) {
		super.addToTheContainer(amount);
		historic.add(super.getVolume());
	}
	
	public double takeFromTheContainer(double amount) {
		super.takeFromTheContainer(amount);
		historic.add(super.getVolume());
		return super.getVolume();
	}
	
	public void printAnalysis() {
		System.out.println("Product: " + super.getName());
		System.out.println("History: " + history());
		System.out.println("Greatest product amount: " + historic.maxValue());
		System.out.println("Smallest product amount: " + historic.minValue());
		System.out.println("Average: " + historic.average());
		System.out.println("Greatest change: " + historic.greatestFluctuation());
		System.out.println("Product: " + historic.variance());
	}
}
