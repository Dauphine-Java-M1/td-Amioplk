package fr.dauphine.ja.wormsamir.model;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Triangle extends ConvexPolygon {

	private Point A;
	private Point B;
	private Point C;
	
	public Triangle(Point a, Point b, Point c) {
		super((Arrays.asList(a, b, c)));

		this.A = a;
		this.B = b;
		this.C = c;
	}
	
	public boolean isRectangle(){
		return A.scalarProduct(B) == 0
				|| 
			   A.scalarProduct(C) == 0
			    ||
			   B.scalarProduct(C) == 0;
	}
	
	@Override
	public int getDimensions() {
		return 3;
	}

	@Override
	public Set<Line> getSides() {
		Set<Line> sides = new HashSet<Line>();
		sides.add(new Line(A, B));
		sides.add(new Line(A, C));
		sides.add(new Line(C, B));
		
		return sides;
	}

	
	
}
