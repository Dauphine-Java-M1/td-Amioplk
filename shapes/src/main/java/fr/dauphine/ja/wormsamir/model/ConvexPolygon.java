package fr.dauphine.ja.wormsamir.model;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class ConvexPolygon implements Polygon {

	public final BrokenLineModern points;
	
	public ConvexPolygon() {
		points = null;
	}
	
	public ConvexPolygon(Collection<Point> points) {
		
		if(points.size() <= 1) throw new IllegalArgumentException();
		
		this.points = new BrokenLineModern(points);
	}
	
	@Override
	public int getDimensions() {
		return points.nbPoints();
	}

	@Override
	public Set<Line> getSides() {
		Set<Line> sides = new HashSet<Line>();
	
		boolean firstPoint = true;
		Point leftPoint = null;
		Point rightPoint = null;
		for(Point p : points.getPoints()) {
			
			leftPoint = rightPoint;
			rightPoint = p;
			
			if(!firstPoint) sides.add(new Line(leftPoint, rightPoint));
			firstPoint = false;
		}
		
		return sides;
	
	}

	public boolean isConvex() {
	
		Set<Line> sides = this.getSides();
		
		for(Line line : sides) {

			boolean above = true;
			boolean under = true;
			for(Point p : points.getPoints()) {
				above = above && line.isAbove(p);
				under = under && line.isUnder(p);
			}
			
			if(!above && !under) return false;
		}
		
		return true;
	}
	
	@Override
	public boolean covers(Point point) {
		
		Set<Line> sides = this.getSides();
		
		for(Line line : sides) {

			boolean above = true;
			boolean under = true;
			for(Point p : points.getPoints()) {
				above = above && line.isAbove(p);
				under = under && line.isUnder(p);
			}
			
			if(above ? !line.isAbove(point) : !line.isUnder(point)) return false;
		}
			
		return true;
	
		
	}

}
