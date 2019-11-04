package fr.dauphine.ja.wormsamir.model;

import fr.dauphine.ja.wormsamir.view.CircleDrawer;
import fr.dauphine.ja.wormsamir.view.Drawer;

public class Circle implements Shape {

	private Point center;
	private double radius;

	public Circle(Point c, double r) {
		this.center = new Point(c);
		this.radius = r;
	}

	public double surface() {
		return Math.PI * getRadius() * getRadius();
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
		System.out.println("Je translate*");
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
		return new CircleDrawer(this);
	}

}
