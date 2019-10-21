package fr.dauphine.ja.wormsamir.model;

import java.util.LinkedList;

import fr.dauphine.ja.wormsamir.view.BrokenLineDrawer;

public class BrokenLineModern extends Shape {

	private LinkedList<Point> points;
	
	public BrokenLineModern(LinkedList<Point> l) {
		points = l;
		d = new BrokenLineDrawer(this);
	}
	
	public void add(Point point) {
		points.add(point);
	}
	
	public int nbPoints() {
		return points.size();
	}
	
	public boolean contains(Point point) {
		return points.contains(point);
	}
	
	public LinkedList<Point> getPoints() {
		return points;
	}
	
}
