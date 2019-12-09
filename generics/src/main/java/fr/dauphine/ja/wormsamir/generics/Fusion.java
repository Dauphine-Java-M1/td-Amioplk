package fr.dauphine.ja.wormsamir.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Fusion {

	public static void main(String[] args) {
	
		List<String> l1 = Arrays.asList("C", "rc");
		List<StringBuilder> l2 = Arrays.asList(new StringBuilder("a ma"), new StringBuilder("he!"));
		List<? extends CharSequence> r1 = fusion(l1,l2);
		List<?> r2 = fusion(l1,l2);
		List<Integer> l3 = Arrays.asList(1,2);
		List<Integer> l4 = Arrays.asList(10,20);
		List<Integer> r3 = fusion(l3,l4);
		List<?> r4 = fusion(l1,l3);
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		System.out.println(r4);
	}
	
	private static <T> List<T> fusion(List<? extends T> l1, List<? extends T> l2) {
		
		List<T> fusion = new ArrayList<T>();
		
		Iterator<? extends T> it1 = l1.iterator();
		Iterator<? extends T> it2 = l2.iterator();
		
		while(it1.hasNext() || it2.hasNext()) {
			if(it1.hasNext()) fusion.add(it1.next());
			if(it2.hasNext()) fusion.add(it2.next());
		}
		
		return fusion;
	}
	
}
