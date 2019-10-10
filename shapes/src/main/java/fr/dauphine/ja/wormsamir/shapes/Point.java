package fr.dauphine.ja.wormsamir.shapes;

import java.util.ArrayList;

/**
 * Class of a point in 2D
 */
public class Point {

	private int x;
	private int y;
	private static int nbPoints = 0;

	public Point() {
		this(0, 0);
	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
		setNbPoints(getNbPoints() + 1);
	}

	public Point(Point p) {
		this(p.getX(), p.getY());
	}
	
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	private void setX(int dx) {
		this.x = dx;
	}
	
	private void setY(int dy) {
		this.y = dy;
	}
	
	@Override
	public boolean equals(Object o) {
		if(! (o instanceof Point)) return false;
		
		Point p = (Point) o;
		
		return this.getX() == p.getX() && this.getY() == p.getY();
	}
	
	@Override
	public String toString() {
		return "(" + Integer.toString(getX()) + "," + Integer.toString(getY()) + ")";
	}
	
	public void translate(int dx, int dy) {
		this.setX(dx);
		this.setY(dy);
	}
	
	public void translate(Point p) {
		
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

}
