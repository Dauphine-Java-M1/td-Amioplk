package fr.dauphine.ja.wormsamir.model;

import fr.dauphine.ja.wormsamir.view.Drawer;
import fr.dauphine.ja.wormsamir.view.LineDrawer;

public class Line implements Shape {

	private Point A;
	private Point B;
	private double accuracy;
	
	public Line(Point a, Point b) {
		this.setA(a);
		this.setB(b);
		accuracy = 0.001;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Line)) return false;
		
		Line l = (Line) obj;
		return A.equals(l.getA()) && B.equals(l.getB());
	}
	
	@Override
	public boolean contains(Point p) {
		Point vectorAB = Point.getVectorAB(getA(), getB());
		Point vectorAP = Point.getVectorAB(getA(), p);
		return Math.abs(vectorAB.getX() * vectorAP.getY() - vectorAB.getY() * vectorAP.getX()) < accuracy;
	}

	public double getAccuracy() {
		return accuracy;
	}

	public void setAccuracy(double accuracy) {
		this.accuracy = accuracy;
	}

	@Override
	public Drawer getDrawer() {
		return new LineDrawer(this);
	}

	public Point getA() {
		return A;
	}

	public void setA(Point a) {
		A = a;
	}

	public Point getB() {
		return B;
	}

	public void setB(Point b) {
		B = b;
	}
	
}
