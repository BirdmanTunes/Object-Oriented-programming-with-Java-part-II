package week11._039_AxeClickEffect.ui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

public class UserInterface {
	
	JFrame frame;
	
	public void run() {
		frame = new JFrame();
		frame.setPreferredSize(new Dimension(300,200));
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		createComponents(frame.getContentPane());
		
		frame.pack();
		frame.setVisible(true);
	}
	
	public void createComponents(Container container) {
		BorderLayout clickLayout = new BorderLayout();
		container.setLayout(clickLayout);
		
		JLabel counter = new JLabel("0");
		JButton clickButton = new JButton("Click!");
		
		clickButton.addActionListener(new ClickListener(counter));
		
		container.add((counter), BorderLayout.WEST);
		container.add((clickButton), BorderLayout.SOUTH);
	}
	
    public JFrame getFrame() {
        return frame;
    }

}
