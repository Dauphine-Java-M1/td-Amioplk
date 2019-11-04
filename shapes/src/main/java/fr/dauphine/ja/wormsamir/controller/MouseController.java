package fr.dauphine.ja.wormsamir.controller;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JPanel;

import fr.dauphine.ja.wormsamir.model.Point;
import fr.dauphine.ja.wormsamir.model.Shape;
import fr.dauphine.ja.wormsamir.model.World;

public class MouseController implements MouseMotionListener {

	private World toListen;
	JPanel panel;
	
	public MouseController(World world, JPanel panel) {
		toListen = world;
		this.panel = panel;
	}
	
	@Override
	public void mouseDragged(MouseEvent e) {
		for(int i = 0 ; i < toListen.shapes.size() ; ++i) {
			
			Shape shape = toListen.shapes.get(i);
			if(shape.contains(new Point(e.getX(), e.getY()))) {
				shape.translate(e.getX(), e.getY());
				shape.getDrawer().translate(shape);
				panel.repaint();
				break;
			}
		}
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		
	}

}
