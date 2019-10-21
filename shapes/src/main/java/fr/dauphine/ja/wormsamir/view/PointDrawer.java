package fr.dauphine.ja.wormsamir.view;

import java.awt.Graphics;

import fr.dauphine.ja.wormsamir.model.Point;
import fr.dauphine.ja.wormsamir.model.Shape;

public class PointDrawer implements Drawer {

	private Point shapeToDraw;

	public PointDrawer(Point p) {
		shapeToDraw = p;
	}

	@Override
	public void draw(Graphics g) {
		g.drawLine(shapeToDraw.getX(), shapeToDraw.getY()
					, shapeToDraw.getX(), shapeToDraw.getY());
	}

	@Override
	public Shape getShapeToDraw() {
		return shapeToDraw;
	}

}
