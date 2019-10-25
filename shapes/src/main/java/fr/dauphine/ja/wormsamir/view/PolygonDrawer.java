package fr.dauphine.ja.wormsamir.view;

import java.awt.Graphics;

import fr.dauphine.ja.wormsamir.model.Line;
import fr.dauphine.ja.wormsamir.model.Polygon;

public class PolygonDrawer extends Drawer {

	private Polygon shapeToDraw;
	
	public PolygonDrawer(Polygon polygon) {
		shapeToDraw = polygon;
	}

	@Override
	public void draw(Graphics g) {
		for(Line l : shapeToDraw.getSides()) {
			l.getDrawer().draw(g);
		}
	}

}
