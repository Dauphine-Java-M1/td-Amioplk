package fr.dauphine.ja.wormsamir.view;

import java.awt.Graphics;

import fr.dauphine.ja.wormsamir.model.Point;

public class PointDrawer extends Drawer {

	private Point shapeToDraw;

	public PointDrawer(Point p) {
		shapeToDraw = p;
	}

	@Override
	public void draw(Graphics g) {
		g.drawLine((int)shapeToDraw.getX(), (int)shapeToDraw.getY()
					, (int)shapeToDraw.getX(), (int)shapeToDraw.getY());
	}

}
