package fr.dauphine.ja.wormsamir.model;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import fr.dauphine.ja.wormsamir.view.Drawer;
import fr.dauphine.ja.wormsamir.view.PolygonDrawer;

public class ConvexPolygon implements Polygon {

	protected PolygonDrawer drawer;
	public final BrokenLineModern points;
	
	public ConvexPolygon() {
		points = null;
		drawer = new PolygonDrawer(this);
	}
	
	public ConvexPolygon(List<Point> points) {
		
		if(points.size() <= 1) throw new IllegalArgumentException();
		
		this.points = new BrokenLineModern(points);
		drawer = new PolygonDrawer(this);
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
		sides.add(new Line(rightPoint, points.getPoints().get(0)));
		
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
	public boolean contains(Point point) {
		
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

	@Override
	public void translate(int x, int y) {
		points.translate(x, y);
	}
	
	@Override
	public Drawer getDrawer() {
		return drawer;
	}

}
