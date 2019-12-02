package fr.dauphine.ja.wormsamir.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Printer {

	@SuppressWarnings("unused")
	private static <T extends CharSequence> void printCharSeq(List<T> charSeqs) {
		for(T cs : charSeqs) {
			System.out.println(cs.length());
		}
	}
	
	@SuppressWarnings("unused")
	private static <T> void print(List<T> list) {
		for(T o:list)
			System.out.println(o);
	}
	
	public static List<Integer> listLength(List<? extends CharSequence> list) {
		List<Integer> length = new ArrayList<Integer>();
		for(int i=0; i < list.size() ;i++) {
			CharSequence seq = list.get(i);
			length.add(seq.length());
		}
		return length;
	}
	
	public static void main(String[] args) {
		List<String> l = Arrays.asList("colonel", "reyel");
		System.out.println(listLength(l));
	}
	
}
