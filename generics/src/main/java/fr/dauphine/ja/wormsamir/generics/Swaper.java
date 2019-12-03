package fr.dauphine.ja.wormsamir.generics;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Swaper {

	public static <T> void swap(List<T> list, int i, int j) {
		
		T tmp = list.get(i);
		list.set(i, list.get(j));
		list.set(j, tmp);
		
	}
	
	public static <T> void mix(List<T> list) {
		
			Collections.shuffle(list);
		
	}
	
	public static void main(String[] args) {
		List<String> strings = new LinkedList<String>();
		strings.add("aba");
		strings.add("bab");
		strings.add("abb");
		strings.add("bbb");
		strings.add("aaa");
		
		System.out.println(strings);
		Swaper.swap(strings, 0, 2);
		System.out.println(strings);
		Swaper.mix(strings);
		System.out.println(strings);
	
	}
	
}
