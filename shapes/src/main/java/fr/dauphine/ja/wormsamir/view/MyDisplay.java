package fr.dauphine.ja.wormsamir.view;

import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

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
	
	public static void main(String[] args) {
		JFrame frame = new JFrame("Java Avancé - Graphic Display");
		frame.setSize(new Dimension(500, 500));
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		MyDisplay d = new MyDisplay(new World());
		frame.add(d);
	}
	
}
