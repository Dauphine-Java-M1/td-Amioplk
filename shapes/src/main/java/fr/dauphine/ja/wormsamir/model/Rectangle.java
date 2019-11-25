package fr.dauphine.ja.wormsamir.model;

import java.util.Arrays;

public class Rectangle extends ConvexPolygon {

	private Point upperLeftCorner;
	private double verticalLength;
	private double horizontalLength;

	public Rectangle() {
		this(new Point(0, 0), 0, 0);
	}

	public Rectangle(Point p, double v, double h) {
		super(Arrays.asList(p, new Point(p.getX() + h, p.getY()), new Point(p.getX() + h, p.getY() - v), new Point(p.getX(), p.getY() - v)));
		
		upperLeftCorner = p;
		horizontalLength = h;
		verticalLength = v;
	}

	public Point getUpperLeftCorner() {
		return upperLeftCorner;
	}

	public Point getUpperRightCorner() {
		return new Point(upperLeftCorner.getX() + horizontalLength, upperLeftCorner.getY());
	}

	public Point getLowerRightCorner() {
		return new Point(upperLeftCorner.getX() + horizontalLength, upperLeftCorner.getY() - verticalLength);
	}

	public Point getLowerLeftCorner() {
		return new Point(upperLeftCorner.getX(), upperLeftCorner.getY() - verticalLength);
	}

	public double getHorizontalLength() {
		return horizontalLength;
	}

	public double getVerticalLength() {
		return verticalLength;
	}
	
}
