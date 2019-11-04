package fr.dauphine.ja.wormsamir.model;

import fr.dauphine.ja.wormsamir.view.CircleDrawer;
import fr.dauphine.ja.wormsamir.view.Drawer;

public class Circle implements Shape {
	
	private CircleDrawer drawer;
	private Point center;
	private double radius;

	public Circle(Point c, double r) {
		this.center = new Point(c);
		this.radius = r;
		this.drawer = new CircleDrawer(this);
	}

	public double surface() {
		return Math.PI * Math.pow(getRadius(), 2);
	}

	public boolean contains(Point point) {
		return center.norm2(point) <= Math.pow(getRadius(), 2);
	}
	
	public static boolean contains(Point point, Circle... circles) {
		
		for(Circle c : circles) {
			if(c.contains(point)) return true;
		}
		
		return false;
	}

	public void translate(int x, int y) {
		center.translate(x, y);
	}

	@Override
	public String toString() {
		return "( x - " + center.getX() + " )� + ( y - " + center.getY() + " )� = " + (getRadius() * getRadius())
				+ " Surface : " + surface();
	}

	public Point getCenter() {
		return center;
	}
	
	public double getRadius() {
		return radius;
	}

	@Override
	public Drawer getDrawer() {
		return drawer;
	}

}
