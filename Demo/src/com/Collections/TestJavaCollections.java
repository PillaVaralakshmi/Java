package com.Collections;

import java.util.*;

public class TestJavaCollections {
	public static void main(String args[]) {
		ArrayList<String> list= new ArrayList<String>();
		list.add("Sonu");
		list.add("Raku");
		list.add("Hari");
		list.add("Raja");
		Iterator itr=list.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}
	

}
