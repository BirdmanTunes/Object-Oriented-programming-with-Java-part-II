package week11._038_NoticeBoard;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.print.attribute.standard.Destination;
import javax.swing.JTextArea;

public class ActionEventListener implements ActionListener {
	
	JTextArea origin;
	JTextArea destination;
	
	
	public ActionEventListener(JTextArea origin, JTextArea destination) {
		this.origin=origin;
		this.destination=destination;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		final String savedText = "I was copied here from JTextArea.";
		if (origin.getText().equals("")) {
			origin.setText(savedText);
			destination.setText("");
		} else {
			destination.setText(savedText);
			origin.setText("");
		}
	}
}
