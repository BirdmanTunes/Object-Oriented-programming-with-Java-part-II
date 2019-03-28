package week11._040_Calculator.ui;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

import week11._040_Calculator.calculatorlogic.Calculator;

public class MenuButtons extends JPanel {
	
	private JTextField input;
	private JTextField output;

	
	public MenuButtons(JTextField input, JTextField output) {
		super(new GridLayout(1, 3));
		this.input=input;
		this.output=output;
		createComponents();
	}
	
	public void createComponents() {
		JButton plus = new JButton("+");
		JButton minus = new JButton("-");
		JButton reset = new JButton("Z");
		reset.setEnabled(false);
		ButtonActionListener listener = new ButtonActionListener(plus, minus, reset, input, output);
		add(plus);
		plus.addActionListener(listener);
		add(minus);
		minus.addActionListener(listener);
		add(reset);
		reset.addActionListener(listener);
	}

}
