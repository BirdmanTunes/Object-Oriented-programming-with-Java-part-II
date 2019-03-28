package week11._039_AxeClickEffect.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import week11._039_AxeClickEffect.applicationlogic.PersonalCalculator;
import week11._039_AxeClickEffect.applicationlogic.Calculator;;

public class ClickListener implements ActionListener{
	
	JLabel counter;
	Calculator calc;
	
	public ClickListener(JLabel counter) {
		calc = new PersonalCalculator();
		this.counter=counter;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		counter.setText("" + calc.giveValue());
		calc.increase();
	}

}
