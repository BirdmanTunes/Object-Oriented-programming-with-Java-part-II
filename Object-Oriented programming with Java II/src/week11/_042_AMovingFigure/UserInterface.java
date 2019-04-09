package week11._042_AMovingFigure;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class UserInterface implements Runnable {

	private Figure figure;
	private JFrame frame;
	private DrawingBoard board;

	public UserInterface(Figure figure) {
		this.figure = figure;

	}

	@Override
	public void run() {
		frame = new JFrame("Drawing Board");
		frame.setPreferredSize(new Dimension(400, 400));
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

		createComponents(frame.getContentPane());

		frame.pack();
		frame.setVisible(true);
	}

	private void createComponents(Container container) {
        board = new DrawingBoard(figure);
        container.add(board);
        frame.addKeyListener(new KeyboardListener(figure, board));
    }

}
