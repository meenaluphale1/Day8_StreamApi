package com.lti.streams.terminal;

import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Collect {	

	public static void main(String[] args) {
		
		  Stream<String> stream = Stream.of("w", "o", "l", "f");
		  
		  //StringBuilder::new  -- constructor reference  StringBuilder sb= new StringBuilder();
		  //System.out::println  -- method refe 
		  
		 // Employee e= new Employee();	  

		  StringBuilder word = stream.collect(StringBuilder::new,StringBuilder::append, StringBuilder::append); 
		  System.out.println(word);
		  System.out.println("\n");		  
		
		  StringBuilder sb= new StringBuilder();
		
		 		
		stream = Stream.of("w", "o", "l","o", "f");		  
		 TreeSet set = stream.collect(Collectors.toCollection(TreeSet::new));	
		  System.out.println(set); 
		  System.out.println("\n");

		  
		  //unsorted stream = Stream.of("w", "o", "l", "f"); 
		//  Set<String> set1 = 		  stream.collect(Collectors.toSet()); 
		// System.out.println(set); // [f, w, l, o]
		 
		  System.out.println("\n"); 
		 
	}
}