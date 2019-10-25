package fr.dauphine.ja.wormsamir.view;

import java.awt.Graphics;

import fr.dauphine.ja.wormsamir.model.Circle;

public class CircleDrawer extends Drawer {

	private Circle shapeToDraw;

	public CircleDrawer(Circle c) {
		shapeToDraw = c;
	}

	@Override
	public void draw(Graphics g) {
		
		int x = (int)shapeToDraw.getCenter().getX();
		int y = (int)shapeToDraw.getCenter().getY();
		double r = shapeToDraw.getRadius();
		g.drawOval((int) (x - r) , (int) (y - r), (int) r*2, (int) r*2);
	}

}
