package fr.dauphine.ja.wormsamir.view;

import fr.dauphine.ja.wormsamir.model.Shape;

public interface Drawer {

	public Shape getShapeToDraw();
	public void draw();
	
}
