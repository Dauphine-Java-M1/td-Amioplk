package fr.dauphine.ja.wormsamir.model;

import java.util.LinkedList;

import fr.dauphine.ja.wormsamir.view.BrokenLineDrawer;
import fr.dauphine.ja.wormsamir.view.Drawer;

public class BrokenLineModern implements Shape {

	private LinkedList<Point> points;
	
	public BrokenLineModern(LinkedList<Point> l) {
		points = l;
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

	@Override
	public Drawer getDrawer() {
		return new BrokenLineDrawer(this);
	}
	
}
