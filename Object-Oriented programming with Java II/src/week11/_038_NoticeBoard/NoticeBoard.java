package week11._038_NoticeBoard;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.util.GregorianCalendar;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.WindowConstants;

public class NoticeBoard {
	
	JFrame frame;
	
	public void run() {
		frame = new JFrame();
		
		frame.setPreferredSize(new Dimension(400,200));
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		createComponents(frame.getContentPane());
		
		frame.pack();
		frame.setVisible(true);
	}
	
	public void createComponents(Container container) {
		GridLayout grid = new GridLayout(3, 1);
		container.setLayout(grid);
		
		JTextArea original = new JTextArea("I was copied here from JTextArea.");
		
		JButton copyButton = new JButton("Copy!");
		JTextArea destination = new JTextArea();
		
		copyButton.addActionListener(new ActionEventListener(original, destination));
		container.add(original);
		container.add(copyButton);
		container.add(destination);
	}
}
