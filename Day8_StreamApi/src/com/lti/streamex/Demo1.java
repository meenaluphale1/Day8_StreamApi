package com.lti.streamex;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Demo1 {
	
	public static void main(String[] args) {
		
		//ways to create streams 
		
		Stream<String> emptyStream= Stream.empty();
		
		// using - method of() 
		Stream<Integer> Stream1= Stream.of(1,2,3);
		System.out.println(Stream1);
		
		//List 
		//using method stream()  
		
		List<String> myList= Arrays.asList("a","b","c");
		
		Stream<String>	myStream  = myList.stream();
		
		Stream<String>	pStream  = myList.parallelStream();
		
		//infinite stream 
		
		Stream<Double> numStream= Stream.generate(Math::random);
		
		numStream.forEach(System.out::println);
		
		
		
		
		
		
		
	}

}
