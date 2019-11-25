package fr.dauphine.ja.wormsamir.model;

import java.util.Arrays;

public class Parallelogram extends ConvexPolygon {

	protected Point upperLeftCorner;
	private Point upperRightCorner;
	private Point lowerRightCorner;
	private Point lowerLeftCorner;
	
	public Parallelogram() {
		this(new Point(), new Point(), new Point(), new Point());
	}
	
	public Parallelogram(Point ur, Point ul, Point lr, Point ll) {
		super((Arrays.asList(ul, ur, lr, ll)));

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

}
