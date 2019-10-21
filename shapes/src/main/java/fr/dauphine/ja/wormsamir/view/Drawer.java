package fr.dauphine.ja.wormsamir.view;

import java.awt.Graphics;

import fr.dauphine.ja.wormsamir.model.Shape;

public abstract class Drawer {

	Shape shapeToDraw;
	public abstract void draw(Graphics g);
	
}
