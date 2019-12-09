package fr.dauphine.ja.wormsamir.threads.threads;

import java.util.ArrayList;

public class MySafeList extends ArrayList<Double> {

	public static void stressTest(int n, int m){
		
		Runnable runnable = new Runnable() {

			public void run() {
				// TODO Auto-generated method stub
				
			}
			
		};
		
	}
	
	@Override
	public boolean add(Double e) {
		return super.add(e);
	}
	
	@Override
	public int size() {
		return super.size();
	}
	
	@Override
	public Double get(int index) {
		return super.get(index);
	}
}
