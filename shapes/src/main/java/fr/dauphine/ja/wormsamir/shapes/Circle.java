package fr.dauphine.ja.wormsamir.shapes;

public class Circle {

	private Point center;
	private int radius;

	public Circle(Point c, int r) {
		this.center = new Point(c);
		this.setRadius(r);
	}

	public double surface() {
		return 2 * Math.PI * getRadius();
	}

	public boolean contains(Point point) {
		return (point.getX() - center.getX()) * (point.getX() - center.getX())
				+ (point.getY() - center.getY()) * (point.getY() - center.getY()) 
					>= getRadius() * getRadius();
	}
	
	public boolean contains(Point point) {
		
	}

	public void translate(int dx, int dy) {
		this.center = new Point(dx, dy);
	}

	@Override
	public String toString() {
		return "( x - " + center.getX() + " )² + ( y - " + center.getY() + " )² = " + (getRadius() * getRadius())
				+ " Surface : " + surface();
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

}
