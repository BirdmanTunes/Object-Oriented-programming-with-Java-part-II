package week11._042_DrawingBoard;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class DrawingBoard extends JPanel {
	
    public DrawingBoard() {
        super.setBackground(Color.WHITE);
    }
    
    @Override
    protected void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);

        graphics.fillRect(90, 40, 50, 50);
        graphics.fillRect(240, 40, 50, 50);
        graphics.fillRect(50, 200, 50, 50);
        graphics.fillRect(100, 250, 170, 50);
        graphics.fillRect(270, 200, 50, 50);
    }
}
