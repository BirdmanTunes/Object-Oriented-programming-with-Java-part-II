package week11._036_Greeter;

import javax.swing.SwingUtilities;

public class Main {
	
	public static void main(String[] args) {
		
		UserInterface ui = new UserInterface();
		SwingUtilities.invokeLater(ui);
	}

}
