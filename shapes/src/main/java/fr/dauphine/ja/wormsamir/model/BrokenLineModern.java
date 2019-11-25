package fr.dauphine.ja.wormsamir.model;

import java.util.LinkedList;
import java.util.List;
import com.google.common.collect.ImmutableList;
import fr.dauphine.ja.wormsamir.view.BrokenLineDrawer;
import fr.dauphine.ja.wormsamir.view.Drawer;

public class BrokenLineModern implements Shape {

	private BrokenLineDrawer drawer;
	private ImmutableList<Point> points;
	
	public BrokenLineModern(List<Point> l) {
		points = ImmutableList.copyOf(l);
		drawer = new BrokenLineDrawer(this);
	}
	
	public int nbPoints() {
		return points.size();
	}
	
	public boolean contains(Point point) {
		
		for(Point p : points) {
			if((new Circle(p, 40)).contains(point)) return true;
		}

		return false;
	}
	
	public ImmutableList<Point> getPoints() {
		return points;
	}

	@Override
	public Drawer getDrawer() {
		return drawer;
	}

	@Override
	public void translate(int x, int y) {
		
		List<Point> newPoints = new LinkedList<Point>();
		Point newPoint = new Point(x, y);
		
		Point firstPoint = points.get(0);
		for(Point point : points) {
			if(point.norm2(newPoint) < firstPoint.norm2(newPoint)) firstPoint = point;
		}
		
		double dx = firstPoint.getX() - x; 
		double dy = firstPoint.getY() - y;
		
		for(Point point : points) {
			if(point.equals(firstPoint)) {
				newPoints.add(newPoint);
			}
			else {
				newPoints.add(new Point(point.getX() - dx, point.getY() - dy));
			}
		}
		
		points = ImmutableList.copyOf(newPoints);
	}
	
}
