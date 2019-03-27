package week11._36_Greeter;

import javax.swing.SwingUtilities;

public class Main {
	
	public static void main(String[] args) {
		
		UserInterface ui = new UserInterface();
		SwingUtilities.invokeLater(ui);
	}

}
