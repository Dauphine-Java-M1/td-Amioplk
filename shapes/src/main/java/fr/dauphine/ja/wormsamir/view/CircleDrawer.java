package fr.dauphine.ja.wormsamir.view;

import java.awt.Graphics;

import fr.dauphine.ja.wormsamir.model.Circle;
import fr.dauphine.ja.wormsamir.model.Shape;

public class CircleDrawer implements Drawer {

	private Circle shapeToDraw;

	public CircleDrawer(Circle c) {
		shapeToDraw = c;
	}

	@Override
	public Shape getShapeToDraw() {
		return shapeToDraw;
	}

	@Override
	public void draw(Graphics g) {
		
		int x = shapeToDraw.getCenter().getX();
		int y = shapeToDraw.getCenter().getY();
		double r = shapeToDraw.getRadius();
		g.drawOval((int) (x - r) , (int) (y - r), (int) r*2, (int) r*2);
	}

}
