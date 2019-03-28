package week11._040_Calculator.ui;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

import week11._040_Calculator.calculatorlogic.Calculator;


public class GraphicCalculator implements Runnable {
	
	JFrame frame;
	
	public GraphicCalculator() {
	}
	
	public void run() {
		frame = new JFrame();
		frame.setPreferredSize(new Dimension(400, 200));
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		createComponents(frame.getContentPane());
		frame.pack();
		frame.setVisible(true);
	}
	
	public void createComponents(Container container) {
		GridLayout theGrid = new GridLayout(3, 1);
		container.setLayout(theGrid);
		JTextField output = new JTextField("0");
		output.setEnabled(false);
		JTextField input = new JTextField();
		
		container.add(output);
		container.add(input);
		container.add(new MenuButtons(input, output));
	}
	
	public JFrame getFrame() {
		return frame;
	}

}
