package week11._040_Calculator.calculatorlogic;

public class Calculator {
	
	private int input;
	private int output;
	
	public Calculator() {
		input = 0;
		output = 0;
	}

	public int getOutput() {
		return output;
	}

	public void addToSum(int input) {
		output += input;
	}
	
	public void subtractFromSum(int input) {
		output -= input;
	}
	
	public void reset() {
		input = 0;
		output = 0;
	}

}
