package fr.dauphine.ja.wormsamir.model;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Square extends ConvexPolygon {

	private Point upperLeftCorner;
	private double size;
	
	public Square(Point p, double s) {
		super(Arrays.asList(p, new Point(p.getX() + s, p.getY()), new Point(p.getX() + s, p.getY() - s), new Point(p.getX(), p.getY() - s)));
		
		upperLeftCorner = p;
		size = s;		
	}

	public Point getUpperLeftCorner() {
		return upperLeftCorner;
	}

	public Point getUpperRightCorner() {
		return new Point(upperLeftCorner.getX() + size, upperLeftCorner.getY());
	}

	public Point getLowerRightCorner() {
		return new Point(upperLeftCorner.getX() + size, upperLeftCorner.getY() - size);
	}

	public Point getLowerLeftCorner() {
		return new Point(upperLeftCorner.getX(), upperLeftCorner.getY() - size);
	}

	
	public double getSize() {
		return size;
	}

	@Override
	public Set<Line> getSides() {
		Set<Line> sides = new HashSet<Line>();
		sides.add(new Line(upperLeftCorner, getUpperRightCorner()));
		sides.add(new Line(upperLeftCorner, getLowerLeftCorner()));
		sides.add(new Line(getLowerLeftCorner(), getLowerRightCorner()));
		sides.add(new Line(getUpperRightCorner(), getLowerRightCorner()));

		return sides;
	}

}
