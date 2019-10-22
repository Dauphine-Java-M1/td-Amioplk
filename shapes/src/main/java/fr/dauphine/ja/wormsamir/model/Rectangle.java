package fr.dauphine.ja.wormsamir.model;

public class Rectangle extends Parallelogram {

	private double verticalLength;
	private double horizontalLength;

	public Rectangle() {
		this(new Point(0, 0), 0, 0);
	}

	public Rectangle(Point p, double v, double h) {
		upperLeftCorner = p;
		horizontalLength = h;
		verticalLength = v;

		d = new ParrallelogramDrawer();
	}

	public Point getUpperLeftCorner() {
		return upperLeftCorner;
	}

	public double getHorizontalLength() {
		return horizontalLength;
	}

	public double getVerticalLength() {
		return verticalLength;
	}

	@Override
	public boolean contains(Point p) {
		return (p.getX() > upperLeftCorner.getX() && p.getX() < upperLeftCorner.getX() + horizontalLength 
				&&
				p.getY() > upperLeftCorner.getY() - verticalLength &&  p.getY() < upperLeftCorner.getY());
	}

}
