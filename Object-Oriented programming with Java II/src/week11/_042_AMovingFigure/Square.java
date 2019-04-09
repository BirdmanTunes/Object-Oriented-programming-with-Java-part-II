package week11._042_AMovingFigure;

import java.awt.Graphics;

public class Square extends Figure {
	
	private int side;

	public Square(int x, int y, int side) {
		super(x, y);
		this.side=side;
	}

	@Override
	public void draw(Graphics graphics) {
		graphics.fillRect(this.getX(), this.getY(), side, side);
	}
	
}