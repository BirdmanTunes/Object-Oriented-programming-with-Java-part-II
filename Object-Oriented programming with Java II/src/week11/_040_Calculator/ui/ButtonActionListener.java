package week11._040_Calculator.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextField;

import week11._040_Calculator.calculatorlogic.Calculator;

public class ButtonActionListener implements ActionListener{

	private JTextField input;
	private JTextField output;
	private Calculator calc = new Calculator();
	private JButton plus;
	private JButton minus;
	private JButton Z;
	
	public ButtonActionListener(JButton plus, JButton minus, JButton Z, JTextField input, JTextField output) {
		this.input=input;
		this.output=output;
		this.plus=plus;
		this.minus=minus;
		this.Z=Z;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==plus) {
			if (!input.getText().equals("")) {
				try {
					calc.addToSum(Integer.parseInt(input.getText()));
				} catch (Exception ex) {
				}
			}
		} else if (e.getSource()==minus) {
			if (!input.getText().equals("")) {
				try {
					calc.subtractFromSum(Integer.parseInt(input.getText()));
				} catch (Exception ex){
				}
			}
		} else {
			calc.reset();
		}
		output.setText(Integer.toString(calc.getOutput()));
		input.setText("");
		resetZ();
	}
	
	public void resetZ() {
        if (calc.getOutput() == 0) {
            Z.setEnabled(false);
        } else {
            Z.setEnabled(true);
        }
	}
}
