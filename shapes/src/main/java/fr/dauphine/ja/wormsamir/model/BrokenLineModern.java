package fr.dauphine.ja.wormsamir.model;

import java.util.List;
import com.google.common.collect.ImmutableList;
import fr.dauphine.ja.wormsamir.view.BrokenLineDrawer;
import fr.dauphine.ja.wormsamir.view.Drawer;

public class BrokenLineModern implements Shape {

	private final ImmutableList<Point> points;
	
	public BrokenLineModern(List<Point> l) {
		points = ImmutableList.copyOf(l);
	}
	
	public int nbPoints() {
		return points.size();
	}
	
	public boolean contains(Point point) {
		return points.contains(point);
	}
	
	public ImmutableList<Point> getPoints() {
		return points;
	}

	@Override
	public Drawer getDrawer() {
		return new BrokenLineDrawer(this);
	}

	@Override
	public BrokenLineModern translate(int x, int y) {
		Point firstPoint = points.get(0);
	}
	
}
