package fr.dauphine.ja.wormmsamir.shapes;

public class BrokenLine {
	
	private Point [] points;
	
	public BrokenLine(int n) {
		this.points = new Point [n];
	}
	
	public void add(Point point) {
		int i = 0;
		for(Point p : points) {
			if(p != null) points[i] = point;
			i++;
		}

	}
	
	private int pointCapacity() {
		return points.length;
	}
}
