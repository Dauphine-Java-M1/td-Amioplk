package fr.dauphine.ja.wormsamir.iterables;

import java.util.List;

public class Main {

	
	public static void main(String[] args) {
	
		List<Integer> l = Panel.panel(3,6);
		
		for(int i:l) {
			System.out.println(i);//affiche 3 4 5 6
			}
			
			System.out.println(l.get(1)); //affiche 4
		}
		
}
