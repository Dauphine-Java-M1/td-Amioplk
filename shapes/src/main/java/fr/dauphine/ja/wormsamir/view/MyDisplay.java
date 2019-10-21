package fr.dauphine.ja.wormsamir.view;

import java.awt.Dimension;
import java.awt.Graphics;
import java.util.LinkedList;

import javax.swing.JFrame;
import javax.swing.JPanel;

import com.sun.tools.javac.util.List;

import fr.dauphine.ja.wormsamir.model.BrokenLineModern;
import fr.dauphine.ja.wormsamir.model.Circle;
import fr.dauphine.ja.wormsamir.model.Point;
import fr.dauphine.ja.wormsamir.model.Ring;
import fr.dauphine.ja.wormsamir.model.Shape;
import fr.dauphine.ja.wormsamir.model.World;

public class MyDisplay extends JPanel {

	private static final long serialVersionUID = 1L;
	World world;

	public MyDisplay(World w) {
		world = w;
	}
	
	@Override
	protected void paintComponent(Graphics arg0) {
	
		for(Shape s : world.shapes) {
			s.d.draw(arg0);
		}
		
	}
	
	@SuppressWarnings({ "restriction", "restriction" })
	public static void main(String[] args) {
		
		World w = new World();
		w.shapes.add(new Point(400, 100));
		w.shapes.add(new Circle(new Point(400, 100), 100));
		w.shapes.add(new BrokenLineModern(new LinkedList<Point>(List.of(new Point(0,0), new Point(100,100), new Point(200,300)))));
		w.shapes.add(new Ring(new Point(200,300), 100, 50));
		
		JFrame frame = new JFrame("Java Avancé - Graphic Display");
		frame.setSize(new Dimension(500, 500));
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		MyDisplay d = new MyDisplay(w);
		frame.add(d);
	}
	
}
