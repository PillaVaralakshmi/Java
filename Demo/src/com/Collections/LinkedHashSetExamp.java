package com.Collections;

import java.util.*;  
class LinkedHashSetExamp{  
 public static void main(String args[]){  
 //Creating HashSet and adding elements  
        LinkedHashSet<String> set=new LinkedHashSet<String>();  
               set.add("One");    
               set.add("Two");    
               set.add("Three");   
               set.add("Four");  
               set.add("Five");  
               Iterator<String> itr=set.iterator();  
               while(itr.hasNext())  
               {  
               System.out.println(itr.next());  
               }  
 }  
}  
