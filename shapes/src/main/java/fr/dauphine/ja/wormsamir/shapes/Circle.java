package fr.dauphine.ja.wormsamir.shapes;

public class Circle {

	private Point center;
	private double radius;

	public Circle(Point c, double r) {
		this.center = new Point(c);
		this.radius = r;
	}

	public double surface() {
		return Math.PI * getRadius() * getRadius();
	}

	public boolean contains(Point point) {
		return center.scalarProduct(point) <= Math.pow(getRadius(), 2);
	}
	
	public static boolean contains(Point point, Circle... circles) {
		
		for(Circle c : circles) {
			if(c.contains(point)) return true;
		}
		
		return false;
	}

	public Circle translate(int dx, int dy) {
		return new Circle(getCenter().translate(dx, dy), getRadius());
	}

	@Override
	public String toString() {
		return "( x - " + center.getX() + " )� + ( y - " + center.getY() + " )� = " + (getRadius() * getRadius())
				+ " Surface : " + surface();
	}

	public Point getCenter() {
		return center;
	}
	
	public double getRadius() {
		return radius;
	}

}
