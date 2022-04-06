package com.lti.streams.terminal;

import java.util.Arrays;
import java.util.List;

public class TestReduce {
	public static void main(String[] args) {
		
		List<Person> persons =
			    Arrays.asList(
			        new Person("Max", 18),
			        new Person("Peter", 50),
			        new Person("Pamela", 60),
			        new Person("David", 12));		
		persons
	    .stream()
	    .reduce((p1, p2) -> p1.age > p2.age ? p1 : p2)
	    .ifPresent(System.out::println);    // Pamela // name of a person with max age is displayed 
		
		//The second reduce method accepts both an identity value 
		//and a BinaryOperator accumulator.
		//This method can be utilized to construct a new Person 
		//with the aggregated names and ages from all other persons in the stream:

			Person result =
			    persons
			        .stream()
			        .reduce(new Person("", 0), (p1, p2) -> {
			            p1.age += p2.age;
			            p1.name += p2.name;
			            return p1;
			        });

			System.out.format("name=%s; age=%s", result.name, result.age);

		
		
	}
	
	
}
