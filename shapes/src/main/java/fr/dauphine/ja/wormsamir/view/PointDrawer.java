package fr.dauphine.ja.wormsamir.view;

import fr.dauphine.ja.wormsamir.model.Point;
import fr.dauphine.ja.wormsamir.model.Shape;

public class PointDrawer implements Drawer {

	private Point shapeToDraw;
	
	public PointDrawer(Point p) {
		
	}
	
	@Override
	public void draw() {
		
	}

	@Override
	public Shape getShapeToDraw() {
		return shapeToDraw;
	}

}
