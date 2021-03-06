package fr.dauphine.ja.wormsamir.model;

import java.util.ArrayList;
import fr.dauphine.ja.wormsamir.view.Drawer;
import fr.dauphine.ja.wormsamir.view.PointDrawer;

/**
 * Class of a point in 2D
 */
public class Point implements Shape {

	private PointDrawer drawer;
	private double x;
	private double y;
	private static int nbPoints = 0;

	public Point() {
		this(0, 0);
	}

	public Point(double x, double y) {
		this.x = x;
		this.y = y;
		this.drawer = new PointDrawer(this);
		nbPoints = nbPoints + 1;
	}

	public Point(Point p) {
		this(p.getX(), p.getY());
	}
	
	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	@Override
	public boolean equals(Object o) {
		if(! (o instanceof Point)) return false;
		
		Point p = (Point) o;
		
		return this.getX() == p.getX() && this.getY() == p.getY();
	}
	
	@Override
	public String toString() {
		return "(" + Double.toString(getX()) + "," + Double.toString(getY()) + ")";
	}
	
	public void translate(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public double norm2(Point point) {
		return Math.pow(point.getX() - getX(), 2) + Math.pow(point.getY() - getY(), 2);
	}
	
	public double scalarProduct(Point point) {
		return x * point.getX() + y * point.getY(); 
	}
	
	static public Point getVectorAB(Point a, Point b) {
		return new Point(b.x - a.x ,b.y - a.y);
	}

	public static void main(String[] args) {
		Point p = new Point();
		System.out.println(p.x + " " + p.y);
		System.out.println(p);
		
		Point p1 = new Point(1, 2);
		Point p2 = p1;
		Point p3 = new Point(1, 2);
		
		ArrayList<Point> list = new ArrayList<>();
		list.add(p1);
		System.out.println(p1 == p2);
		System.out.println(p1 == p3);
		System.out.println(list.indexOf(p2));
		System.out.println(list.indexOf(p3));
	}

	public static int getNbPoints() {
		return nbPoints;
	}

	public static void setNbPoints(int nbPoints) {
		Point.nbPoints = nbPoints;
	}

	@Override
	public boolean contains(Point p) {
		return this.equals(p);
	}

	@Override
	public Drawer getDrawer() {
		return drawer;
	}

}
