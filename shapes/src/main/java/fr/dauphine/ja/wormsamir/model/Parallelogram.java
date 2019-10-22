package fr.dauphine.ja.wormsamir.model;

public class Parallelogram extends Shape {

	protected Point upperLeftCorner;
	private Point lowerRightCorner;
	
	public Point getUpperLeftCorner() {
		return upperLeftCorner;
	}

	public Point getUpperRightCorner() {
		return upperLeftCorner;
	}

	public Point getLowerLeftCorner() {
		return upperLeftCorner;
	}

	public Point getLowerRightCorner() {
		return upperLeftCorner;
	}


	@Override
	public boolean contains(Point p) {
		return false;
	}

}
