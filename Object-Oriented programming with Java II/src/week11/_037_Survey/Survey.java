package week11._037_Survey;

import java.awt.Container;
import java.awt.Dimension;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.WindowConstants;

public class Survey implements Runnable{
	
	private JFrame frame;
	
	public void run() {
		frame = new JFrame();
		
		frame.setPreferredSize(new Dimension(200, 300));
		
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		frame.pack();
		
		createComponents(frame.getContentPane());
		frame.setVisible(true);
	}
	
	
	public void createComponents(Container container) {
		BoxLayout layout = new BoxLayout(container, BoxLayout.Y_AXIS);
		container.setLayout(layout);
		
		container.add(new JLabel("Are you?"));
		
		container.add(new JCheckBox("Yes!"));
		container.add(new JCheckBox("No!"));
		
		container.add(new JLabel("Why?"));
		
		JRadioButton choice1 = new JRadioButton("No reason.");
		JRadioButton choice2 = new JRadioButton("Because it's fun!");
		
		ButtonGroup whyReason = new ButtonGroup();
		
		whyReason.add(choice1);
		whyReason.add(choice2);
		
		container.add(choice1);
		container.add(choice2);
	}
	
	public JFrame getFrame() {
		return frame;
	}
}
