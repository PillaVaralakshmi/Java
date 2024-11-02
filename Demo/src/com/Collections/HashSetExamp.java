package com.Collections;
import java.util.*;


public class HashSetExamp {	
		public static void main(String args[]) {
			HashSet<String> set= new HashSet<String>();
		     set.add("Sonu");
			set.add("Raku");
			set.add("Hari");
			set.add("Raja");
			set.add("Sonu");
			set.add("Hari");
			Iterator itr=set.iterator();
			while(itr.hasNext()){
				System.out.println(itr.next());
			}
		}
		

	}
