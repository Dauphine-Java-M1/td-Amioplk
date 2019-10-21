package fr.dauphine.ja.wormsamir.view;

import java.awt.Graphics;

import fr.dauphine.ja.wormsamir.model.Circle;
import fr.dauphine.ja.wormsamir.model.Ring;
import fr.dauphine.ja.wormsamir.model.Shape;

public class RingDrawer implements Drawer {

	private Ring shapeToDraw;
	private CircleDrawer innerCircleDrawer;
	private CircleDrawer outterCircleDrawer;
	
	public RingDrawer(Ring ring) {
		shapeToDraw = ring;
		innerCircleDrawer = new CircleDrawer(new Circle(ring.getOutsideCircle().getCenter(), ring.getInsideRadius()));
		outterCircleDrawer = new CircleDrawer(ring.getOutsideCircle());
	}

	@Override
	public Shape getShapeToDraw() {
		return shapeToDraw;
	}

	@Override
	public void draw(Graphics g) {

		innerCircleDrawer.draw(g);
		outterCircleDrawer.draw(g);
		
	}

}
