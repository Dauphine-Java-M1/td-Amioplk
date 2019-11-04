package fr.dauphine.ja.wormsamir.model;

import java.util.Set;

public interface Polygon extends Shape {
	
	int getDimensions();
	Set<Line> getSides();
	
}
