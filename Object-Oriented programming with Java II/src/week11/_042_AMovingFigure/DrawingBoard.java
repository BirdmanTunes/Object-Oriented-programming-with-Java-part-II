package week11._042_AMovingFigure;

import java.awt.Graphics;

import javax.swing.JPanel;

public class DrawingBoard extends JPanel {
	
	private Figure figure;
	
	
	public DrawingBoard(Figure figure) {
		this.figure=figure;
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		figure.draw(g);
		
	}

}
