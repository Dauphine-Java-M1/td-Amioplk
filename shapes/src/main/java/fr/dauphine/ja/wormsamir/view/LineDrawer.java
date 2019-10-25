package fr.dauphine.ja.wormsamir.view;

import java.awt.Graphics;

import fr.dauphine.ja.wormsamir.model.Line;

public class LineDrawer extends Drawer {

	private Line shapeToDraw;

	public LineDrawer(Line line) {
		shapeToDraw = line;
	}

	@Override
	public void draw(Graphics g) {
		g.drawLine( (int) shapeToDraw.getA().getX(), 
					(int) shapeToDraw.getA().getY(), 
					(int) shapeToDraw.getB().getX(),
					(int) shapeToDraw.getB().getY());
	}

}
