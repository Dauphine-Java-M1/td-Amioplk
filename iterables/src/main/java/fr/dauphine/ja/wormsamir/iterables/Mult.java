package fr.dauphine.ja.wormsamir.iterables;

import java.util.AbstractList;
import java.util.AbstractSequentialList;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public class Mult {

	public static List<Integer> mult(final int n, final List<Integer> list){
		
		if(list instanceof RandomAccess) {
			
			return new AbstractList<Integer>() {

				@Override
				public Integer get(int i) {
					return list.get(i) * n;
				}

				@Override
				public int size() {
					return list.size();
				}
				
			};
			
		}
		
		else {
			return new AbstractSequentialList<Integer>() {

				@Override
				public int size() {
					return list.size();
				}

				@Override
				public ListIterator<Integer> listIterator(final int i) {
					return new ListIterator<Integer>() {

						private ListIterator<Integer> it = list.listIterator(i);
						
						@Override
						public void add(Integer arg0) {
							throw new UnsupportedOperationException("On ne peut pas modifier une vue.");
						}

						@Override
						public boolean hasNext() {
							return it.hasNext();
						}

						@Override
						public boolean hasPrevious() {
							return it.hasPrevious();
						}

						@Override
						public Integer next() {
							return it.next()*n;
						}

						@Override
						public int nextIndex() {
							return it.nextIndex();
						}

						@Override
						public Integer previous() {
							return it.previous()*n;
						}

						@Override
						public int previousIndex() {
							return it.previousIndex();
						}

						@Override
						public void remove() {
							throw new UnsupportedOperationException("On ne peut pas modifier une vue.");	
						}

						@Override
						public void set(Integer arg0) {
							throw new UnsupportedOperationException("On ne peut pas modifier une vue.");
						}

						
					};
				}
			};
			
		}
		
	}
	
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		for (int i = 0; i < 1000000; i++) {
			al.add(i);
		}
		
		long t0 = System.nanoTime();
		
		List<Integer> ret = Mult.mult(2, al);
		long sum=0;
		for(int val : ret) {
			sum+=val/2;
		}
		
		System.out.println((System.nanoTime() - t0));
		
		LinkedList<Integer> ll = new LinkedList<>();
		for (int i = 0; i < 1000000; i++) {
			ll.add(i);
		}
		
		t0 = System.nanoTime();
		sum=0;
		ret = Mult.mult(2, ll);
		for(int val : ret) {
			sum+=val/2;
		}
		
		System.out.println((System.nanoTime() - t0));
		
	}
	
}
