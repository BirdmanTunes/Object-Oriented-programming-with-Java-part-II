package week10._030_Container;

import week10._030_Container.containers.ProductContainerRecorder;

public class Main {

	public static void main(String[] args) {

		ProductContainerRecorder juice = new ProductContainerRecorder("Juice", 1000.0, 1000.0);
		juice.takeFromTheContainer(11.3);
		juice.addToTheContainer(1.0);

		juice.printAnalysis();
	}
}
