package fr.dauphine.ja.wormsamir.model;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Square extends ConvexPolygon {

	private Point upperLeftCorner;
	private double size;
	
	public Square(Point p, double s) {
		super(Arrays.asList(p, p.translate((int) s, 0), p.translate((int) s, (int) s), p.translate(0, (int) s)));
		
		upperLeftCorner = p;
		size = s;		
	}

	public double getSize() {
		return size;
	}

	@Override
	public Set<Line> getSides() {
		Set<Line> sides = new HashSet<Line>();
		sides.add(new Line(upperLeftCorner, upperLeftCorner.translate((int) size, 0)));
		sides.add(new Line(upperLeftCorner, upperLeftCorner.translate(0, (int) size)));
		sides.add(new Line(upperLeftCorner.translate(0, (int) size), upperLeftCorner.translate((int) size, (int) size)));
		sides.add(new Line(upperLeftCorner.translate((int) size, 0), upperLeftCorner.translate((int) size, (int) size)));
		
		return sides;
	}

}
