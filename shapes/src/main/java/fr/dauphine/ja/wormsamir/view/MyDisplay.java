package fr.dauphine.ja.wormsamir.view;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseMotionListener;
import java.util.LinkedList;

import javax.swing.JFrame;
import javax.swing.JPanel;

import fr.dauphine.ja.wormsamir.controller.MouseController;
import fr.dauphine.ja.wormsamir.model.BrokenLineModern;
import fr.dauphine.ja.wormsamir.model.Circle;
import fr.dauphine.ja.wormsamir.model.Line;
import fr.dauphine.ja.wormsamir.model.Parallelogram;
import fr.dauphine.ja.wormsamir.model.Point;
import fr.dauphine.ja.wormsamir.model.Rectangle;
import fr.dauphine.ja.wormsamir.model.Ring;
import fr.dauphine.ja.wormsamir.model.Shape;
import fr.dauphine.ja.wormsamir.model.Square;
import fr.dauphine.ja.wormsamir.model.Triangle;
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
			s.getDrawer().draw(arg0);
		}
		
	}
	
	public static void main(String[] args) {
		
		World w = new World();
		w.shapes.add(new Point(400, 100));
		w.shapes.add(new Circle(new Point(400, 100), 100));
		/*LinkedList<Point> l = new LinkedList<>();
		l.add(new Point(0,0));
		l.add(new Point(100,100));
		l.add(new Point(200,300));
		w.shapes.add(new BrokenLineModern(l));
		w.shapes.add(new Ring(new Point(200,300), 100, 50));
		w.shapes.add(new Parallelogram(new Point(50, 50), new Point(50,150), new Point(250,150), new Point(250,250)));
		w.shapes.add(new Rectangle(new Point(300,300), 75, 300));
		Triangle t = new Triangle(new Point(100, 500), new Point(200, 400), new Point(450, 500));
		System.out.println(t.covers(new Point(200, 450)));
		w.shapes.add(t);
		w.shapes.add(new Square(new Point(600, 100), 50));
		Line line = new Line(new Point(1,1), new Point(4,9));
		w.shapes.add(line);*/
		
		JFrame frame = new JFrame("Java Avancé - Graphic Display");
		frame.setSize(new Dimension(1000, 1000));
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		MouseController mc = new MouseController(w);
		frame.addMouseMotionListener(mc);
		
		MyDisplay d = new MyDisplay(w);
		frame.add(d);
	}
	
}
