package fr.dauphine.ja.wormsamir.view;

import java.awt.Graphics;

import fr.dauphine.ja.wormsamir.model.BrokenLineModern;
import fr.dauphine.ja.wormsamir.model.Point;
import fr.dauphine.ja.wormsamir.model.Shape;

public class BrokenLineDrawer implements Drawer {

	private BrokenLineModern shapeToDraw;
	
	public BrokenLineDrawer(BrokenLineModern bl) {
		shapeToDraw = bl;
	}
	
	@Override
	public Shape getShapeToDraw() {

		return shapeToDraw;
	}

	@Override
	public void draw(Graphics g) {
		
		boolean firstPoint = true;
		Point leftPoint = null;
		Point rightPoint = null;
		for(Point p : shapeToDraw.getPoints()) {
			
			leftPoint = rightPoint;
			rightPoint = p;
			
			if(!firstPoint) g.drawLine(leftPoint.getX(), leftPoint.getY(), rightPoint.getX(), rightPoint.getY());
			firstPoint = false;
		}
		
	}

}
