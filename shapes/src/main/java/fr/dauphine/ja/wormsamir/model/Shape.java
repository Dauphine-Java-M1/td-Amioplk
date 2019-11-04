package fr.dauphine.ja.wormsamir.model;

import fr.dauphine.ja.wormsamir.view.Drawer;

/**
 * @author Amioplk
 *
 *	A class of shapes that can be displayed and that contains certain points
 *
 */
public interface Shape {
	
	public Drawer getDrawer();
	public void translate(int x, int y);
	public boolean contains(Point p);
	
}
