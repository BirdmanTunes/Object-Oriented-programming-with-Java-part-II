package week7._003_Calculator;

import java.util.Scanner;

public class Calculator {
	
	private Reader sc;
	private int counter;
	private int[] values;
	
	public Calculator() {
		this.sc = new Reader();
		this.counter = 0;
	}
	
    public void start() {
        while (true) {
            System.out.print("command: ");
            String command = sc.readString();
            if (command.equals("end")) {
                break;
            }
            if (command.equals("sum")) {
                sum();
            } else if (command.equals("difference")) {
                difference();
            } else if (command.equals("product")) {
                product();
            }
        }
        statistics();
        
        
    }
    
    private void sum() {
    	counter++;
    	getInput();
    	
    	System.out.println("sum of the values: " + (values[0] + values[1]));
    }
    
    private void difference() {
    	counter++;
    	getInput();
    	
    	if (values[0] > values[1]) {
    		System.out.println("difference is: " + (values[0] - values[1]));
    	} else if (values[0] < values[1]) {
    		System.out.println("difference is: " + (values[1] - values[0]));
    	} else {
    		System.out.println("They are equal!");
    	}
    }
    
    private void product() {
    	counter++;
    	getInput();
    	
    	System.out.println("product of the values: " + (values[0] * values[1]));
    }
    
    public void statistics() {
    	System.out.println("Calculations done:" + counter);
    }
    
    public void getInput() {
    	
    	values = new int[2];
    	System.out.print("value1: ");
    	int val1 = sc.readInteger();
    	System.out.print("value2: ");
    	int val2 =sc.readInteger();
    	values[0] = val1;
    	values[1] = val2;
    }
}
