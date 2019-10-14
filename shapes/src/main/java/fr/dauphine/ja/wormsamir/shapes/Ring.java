package fr.dauphine.ja.wormsamir.shapes;

public class Ring {

	private Circle outsideCircle;
	private double insideRadius;
	
	public Ring(Point c, double r, double ri) {
		
		if(ri > r) throw new IllegalArgumentException();
		
		this.outsideCircle = new Circle(c, r);
		this.insideRadius = ri;
	}
	
	@Override
	public boolean equals(Object o) {
		if(!(o instanceof Ring)) return false;
		Ring r = (Ring) o;
		
		return outsideCircle.equals(r.outsideCircle) && r.insideRadius == insideRadius;
	}

	@Override
	public String toString() {
		return outsideCircle + ", InsideRadius = " + insideRadius;
	}
	
	public boolean contains(Point point) {
		double sp = outsideCircle.getCenter().scalarProduct(point);
		
		return outsideCircle.contains(point) && sp >= Math.pow(insideRadius, 2);
	}
	
	public boolean contains(Point point, Ring... rings) {
		
		for(Ring r : rings) {
			if(r.contains(point)) return true;
		}
		
		return false;
	}
	
	public Circle getOutsideCircle() {
		return this.outsideCircle;
	}

	public double getInsideRadius() {
		return insideRadius;
	}

	public static void main(String[] args) {
		Ring r = new Ring(new Point(1,2), 5, 2);
		System.out.println(r);
	}
	
}
