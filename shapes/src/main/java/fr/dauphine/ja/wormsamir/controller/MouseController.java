package fr.dauphine.ja.wormsamir.controller;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import fr.dauphine.ja.wormsamir.model.Point;
import fr.dauphine.ja.wormsamir.model.Shape;
import fr.dauphine.ja.wormsamir.model.World;

public class MouseController implements MouseMotionListener {

	private World toListen;
	
	public MouseController(World world) {
		toListen = world;
	}
	
	@Override
	public void mouseDragged(MouseEvent e) {
		for(int i = 0 ; i < toListen.shapes.size() ; ++i) {
			
			Shape shape = toListen.shapes.get(i);
			if(shape.contains(new Point(e.getX(), e.getY()))) {
				shape.translate(e.getX(), e.getY());
				toListen.shapes.set(i, shape);
			}
		}
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		
	}

}
