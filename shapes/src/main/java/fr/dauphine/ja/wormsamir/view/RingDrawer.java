package fr.dauphine.ja.wormsamir.view;

import java.awt.Graphics;

import fr.dauphine.ja.wormsamir.model.Circle;
import fr.dauphine.ja.wormsamir.model.Ring;

public class RingDrawer extends Drawer {

	private CircleDrawer innerCircleDrawer;
	private CircleDrawer outterCircleDrawer;
	
	public RingDrawer(Ring ring) {
		shapeToDraw = ring;
		innerCircleDrawer = new CircleDrawer(new Circle(ring.getOutsideCircle().getCenter(), ring.getInsideRadius()));
		outterCircleDrawer = new CircleDrawer(ring.getOutsideCircle());
	}

	@Override
	public void draw(Graphics g) {

		innerCircleDrawer.draw(g);
		outterCircleDrawer.draw(g);
		
	}

}
