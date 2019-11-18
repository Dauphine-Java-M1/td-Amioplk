package fr.dauphine.ja.wormsamir.iterables;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;

public class Panel extends AbstractList<Integer>
{

	private int beginning;
	private int ending;
	
	public Panel(int a, int b) {
		
		if(a > b) throw new IllegalArgumentException();
		
		this.beginning = a;
		this.ending = b;
	}
	
	public Iterator<Integer> iterator() {
		return new Iterator<Integer>(){
			
			private int position = beginning;
			
			@Override
			public boolean hasNext() {
				return position <= ending;
			}

			@Override
			public Integer next() {
				return position++;
			}
			
		};
	}
	
	public static List<Integer> panel(int a, int b){
		return new Panel(a,b);
	}
	
	public static Iterator<Integer> panel1(int a, int b){
		return (new Panel(a,b)).iterator();
	}
	
	public static Iterable<Integer> panel2(int a, int b){
		return new Panel(a,b);
	}

	@Override
	public Integer get(int i) {
		if(beginning+i > ending) throw new IndexOutOfBoundsException();
		return beginning + i;
	}

	@Override
	public int size() {
		return ending - beginning + 1;
	}
	
}
