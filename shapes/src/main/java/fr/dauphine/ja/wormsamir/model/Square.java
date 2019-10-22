package fr.dauphine.ja.wormsamir.model;

public class Square extends Rectangle {

	private double size;
	
	public Square(Point p, double s) {
		
		upperLeftCorner = p;
		size = s;
		
		d = new Parallelogram(this);
	}
	
	@Override
	public boolean contains(Point p) {
		return (p.getX() > upperLeftCorner.getX() && p.getX() < upperLeftCorner.getX() + size
				&&
				p.getY() > upperLeftCorner.getY() - size &&  p.getY() < upperLeftCorner.getY());
	}

	public double getSize() {
		return size;
	}

}
