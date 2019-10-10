package fr.dauphine.ja.wormsamir.shapes;

import java.util.LinkedList;

public class BrokenLineModern {

	private LinkedList<Point> points;
	
	public void add(Point point) {
		points.add(point);
	}
	
	public int nbPoints() {
		return points.size();
	}
	
	public boolean contains(Point point) {
		return points.contains(point);
	}
	
}
