package fr.dauphine.ja.wormsamir.generics;

import java.util.Arrays;
import java.util.List;

public class Maximums
{
    public static void myMax(int i0, Integer...integers)
    {
    	List<Integer> ints = Arrays.asList(integers);
    	ints.add(i0);
    	
    	return ints.stream().max((x,y) -> Integer.compare(x, y));
    }
}
