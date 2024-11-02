package com.Collections;

import java.util.*;

public class TestJavaCollections1 {
	public static void main(String args[]) {
		LinkedList<String> list= new LinkedList<String>();
		list.add("Sonu");
		list.add("Raku");
		list.add("Hari");
		list.add("Raja");
		list.add("Sonu");
		list.add("Hari");
		Iterator itr=list.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}
	

}
