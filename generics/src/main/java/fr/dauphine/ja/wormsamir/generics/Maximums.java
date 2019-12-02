package fr.dauphine.ja.wormsamir.generics;

public class Maximums{
	
	
    public static <T extends Comparable<T>> T myMax(T i0, T...args)
    {
    
    	T max = i0;
    	for(T c : args) {
    		if(c.compareTo(max) > 0) max = c;
    	}
    	
    	return max;
    }

	public static void main(String[] args) {
		System.out.println(myMax(8.6,16.64));
		System.out.println(myMax("baa", "aba"));
	}
}
