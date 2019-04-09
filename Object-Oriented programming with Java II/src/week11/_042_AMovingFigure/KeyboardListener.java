package week11._042_AMovingFigure;

import java.awt.Component;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyboardListener implements KeyListener {
	
	private Figure figure;
	private Component component;
	
	public KeyboardListener(Figure figure, Component component) {
		this.figure=figure;
		this.component=component;
	}

	@Override
	public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
        	figure.move(-5, 0);
        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
        	figure.move(5, 0);
        } else if (e.getKeyCode() == KeyEvent.VK_UP) {
        	figure.move(0, -5);
        } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
        	figure.move(0, 5);
        }
        
        component.repaint();
	}

	@Override
	public void keyReleased(KeyEvent e) {
	}

	@Override
	public void keyTyped(KeyEvent e) {
	}

}
