package fr.dauphine.ja.wormsamir.model;

import java.util.HashSet;
import java.util.Set;

public class Parallelogram implements Shape, Polygon {

	protected Point upperLeftCorner;
	private Point upperRightCorner;
	private Point lowerRightCorner;
	private Point lowerLeftCorner;
	
	public Parallelogram() {
		this(new Point(), new Point(), new Point(), new Point());
	}
	
	public Parallelogram(Point ur, Point ul, Point lr, Point ll) {
	
		upperRightCorner = ur;
		upperLeftCorner = ul;
		lowerRightCorner = lr;
		lowerLeftCorner = ll;
	}
	
	public Point getUpperLeftCorner() {
		return upperLeftCorner;
	}

	public Point getUpperRightCorner() {
		return upperRightCorner;
	}
	
	public Point getLowerRightCorner() {
		return lowerRightCorner;
	}
	
	public Point getLowerLeftCorner() {
		return lowerLeftCorner;
	}
	
	@Override
	public int getDimensions() {
		return 4;
	}

	@Override
	public Set<Line> getSides() {
		Set<Line> sides = new HashSet<Line>();
		sides.add(new Line(upperLeftCorner, upperRightCorner));
		sides.add(new Line(upperLeftCorner, lowerLeftCorner));
		sides.add(new Line(upperRightCorner, lowerRightCorner));
		sides.add(new Line(lowerLeftCorner, lowerRightCorner));
		
		return sides;
	}

}
