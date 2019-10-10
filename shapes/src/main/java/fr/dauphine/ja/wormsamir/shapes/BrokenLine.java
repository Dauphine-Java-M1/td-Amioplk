package fr.dauphine.ja.wormsamir.shapes;

import java.util.Objects;

public class BrokenLine {
	
	private Point [] points;
	
	public BrokenLine(int n) {
		
		if(n <= 0) throw new IllegalArgumentException();
		
		this.points = new Point [n];
	}
	
	/**
	 * @param point the Point to be added in the BrokenLine
	 */
	public void add(Point point) {
		
		int i = 0;
		for(Point p : points) {
			if(p != null) {
				points[i] = point;
				return;
			}
			i++;
		}

	}
	
	/**
	 * @param point must not be null
	 * @return true if this broken line contains point
	 */
	public boolean contains(Point point) {
	
		Objects.requireNonNull(point);
		for(Point p : points) {
			if(point.equals(p)) return true;
		}
		
		return false;
	}
	
	/**
	 * @return the number of points maximum that could be added to this BrokenLine
	 */
	private int pointCapacity() {
		return points.length;
	}
	
	private int nbPoints() {
		
		int s = 0;
		for(Point p : points) {
			if(p == null) return s;
			s++;
		}
		
		return pointCapacity();
	}
	
	public static void main(String[] args) {
		BrokenLine bl = new BrokenLine(1);
		System.out.println(bl.points[0]);
		System.out.println(bl.contains(new Point(1,1)));
	}
}
