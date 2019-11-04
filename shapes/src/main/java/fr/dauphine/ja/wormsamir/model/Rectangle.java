package fr.dauphine.ja.wormsamir.model;

import java.util.HashSet;
import java.util.Set;

public class Rectangle extends Parallelogram {

	private Point upperLeftCorner;
	private double verticalLength;
	private double horizontalLength;

	public Rectangle() {
		this(new Point(0, 0), 0, 0);
	}

	public Rectangle(Point p, double v, double h) {
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

	@Override
	public Set<Line> getSides() {
		Set<Line> sides = new HashSet<Line>();
		sides.add(new Line(upperLeftCorner, upperLeftCorner.translate((int) horizontalLength, 0)));
		sides.add(new Line(upperLeftCorner, upperLeftCorner.translate(0, (int) verticalLength)));
		sides.add(new Line(upperLeftCorner.translate(0, (int) verticalLength), upperLeftCorner.translate((int) horizontalLength, (int) verticalLength)));
		sides.add(new Line(upperLeftCorner.translate((int) horizontalLength, 0), upperLeftCorner.translate((int) horizontalLength, (int) verticalLength)));
		
		return sides;
	}

}
