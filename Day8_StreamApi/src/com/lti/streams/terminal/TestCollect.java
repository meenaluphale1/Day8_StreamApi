package com.lti.streams.terminal;

//lazy   - 


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestCollect {
	public static void main(String[] args) {
		List<Person> persons =
			    Arrays.asList(
			        new Person("Max", 18),
			        new Person("Peter", 23),
			        new Person("Pamela", 23),
			        new Person("David", 12));
		
//		/Collect is an extremely useful terminal operation 
		//to transform the elements of the stream into a 
		//different kind of result,
		//java 8 supports various built-in collectors via the Collectors class. 
		
		List<Person> filtered =
			    persons
			        .stream()
			        .filter(p -> p.name.startsWith("P"))
			        .collect(Collectors.toList());

			System.out.println(filtered);    // [Peter, Pamela]
			
			Double averageAge = persons
				    .stream()
				    .collect(Collectors.averagingInt(p -> p.age));
				System.out.println(averageAge);  
	}

}
