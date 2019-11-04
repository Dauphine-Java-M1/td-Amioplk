package fr.dauphine.ja.wormsamir.model;

import java.util.HashSet;
import java.util.Set;

public class Square extends Rectangle {

	private Point upperLeftCorner;
	private double size;
	
	public Square(Point p, double s) {
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
