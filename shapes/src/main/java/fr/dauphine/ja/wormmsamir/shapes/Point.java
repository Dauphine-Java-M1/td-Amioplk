package fr.dauphine.ja.wormmsamir.shapes;

/**
 * Class of a point in 2D
 */
public class Point {

	private int x;
	private int y;
	private static int nbPoints = 0;

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public Point() {
		this(0, 0);
	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
		setNbPoints(getNbPoints() + 1);
	}

	public Point(Point p) {
		this(p.getX(), p.getY());
	}

	@Override
	public String toString() {
		return "(" + Integer.toString(getX()) + "," + Integer.toString(getY()) + ")";
	}

	public static void main(String[] args) {
		Point p = new Point();
		System.out.println(p.x + " " + p.y);
		System.out.println(p);
	}

	public static int getNbPoints() {
		return nbPoints;
	}

	public static void setNbPoints(int nbPoints) {
		Point.nbPoints = nbPoints;
	}

}
