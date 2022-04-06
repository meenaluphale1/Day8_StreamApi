package com.lti.streamex;

import java.util.stream.Stream;

public class Demo2 {
	
	public static void main(String[] args) {
		
		
		Stream<String> s= Stream.of("Apple","Banana","Mango","Banana","watermelon","Banana");
		
		s
		.filter((x)->x.startsWith("M"))
		.forEach(System.out::println);
		
		s.close();
		
		Stream<String> s1= Stream.of("Apple","Banana","Mango","Banana","watermelon","Banana");
		
		s1
		.distinct()
		.forEach(System.out::println);
		
		System.out.println(" \n ");
		
		Stream<String> s3= Stream.of("Apple","Banan","Mango","Banan","watermelon","Banan");
		
		s3
		.filter(n->n.length()==5)
		.sorted()
		.limit(5)
		.forEach(System.out::println);
		
		
		
		
		
		
	}

}
