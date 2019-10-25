package fr.dauphine.ja.wormsamir.model;

import java.util.Set;

import fr.dauphine.ja.wormsamir.view.Drawer;
import fr.dauphine.ja.wormsamir.view.PolygonDrawer;

public interface Polygon extends Shape {
	
	int getDimensions();
	// boolean isIn();
	Set<Line> getSides();
	
	@Override
	public default boolean contains(Point p) {
		
		boolean contained = false;
		for(Line l : getSides()) {
			if(l.contains(p)) return true;
		}
		
		return contained;
	}
	
	@Override
	public default Drawer getDrawer() {
		return new PolygonDrawer(this);
	}
	
}
