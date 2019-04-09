package week11._042_AMovingFigure;

import java.awt.Graphics;
import java.util.ArrayList;

public class CompoundFigure extends Figure{
	
	ArrayList<Figure> list;
	
	
	public CompoundFigure() {
		super(0, 0);
		list = new ArrayList<Figure>();
	}
	
	
	public void add(Figure figure) {
		list.add(figure);
	}


	@Override
	public void draw(Graphics graphics) {
		for (Figure each: list) {
			each.draw(graphics);
		}
	}
	
	public void move(int dx, int dy) {
        for(Figure each: list) {
            each.move(dx, dy);
        }
	}
}
