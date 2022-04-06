package com.lti.streamop.interm;

/**
 * we wanted to get the first two names alphabetically that are four characters
 * long.
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Streams allow you to use chaining and express what you want to accomplish rather than 
//how to do so.
public class Pipeline {
	

	
	public static void main(String[] args) {
		// Java 7
		
		/*
		 * List<String> list = Arrays.asList("Toby", "Anna", "Leroy", "Alex");
		 * List<String> filtered = new ArrayList<>();
		 * 
		 * for (String name : list) { if(name.length() == 4) { filtered.add(name); } }
		 * Collections.sort(filtered); Iterator<String> iter = filtered.iterator();
		 * 
		 * while (iter.hasNext()) { System.out.println(iter.next()); }
		 */
		 

	//	System.out.println(" java 8");
		// Java 8
		List<String> list = Arrays.asList("Toby", "Anna", "Leroy", "Alex");
		
		/*list.stream().filter(n -> n.length() == 4)// Toby, Anna, Alex
				.sorted() // Alex, Anna, Tobby
				.limit(2) // Alex, Anna
				.forEach(System.out::println);*/
		
		
		
		/*  Stream.generate( () -> "Elsa")
		  .filter(n -> n.length() == 4)
		  .limit(2)
		  .forEach(System.out::println);*/
		 
					
		  Stream.generate(() -> "Elsa")
		  .filter(n -> n.length() == 4)
		  .sorted()  // Elsa Elsa Elsa Elsa // can't sort array of infinite elelments 
		  .limit(2)		 
		  .forEach(System.out::println);
		  

		/**
		 * //It hangs
		 * 
		 * <pre>
		 * Stream.generate(() -> "Olaf Lazisson").filter(n -> n.length() == 4).limit(2).sorted()
		 * 		.forEach(System.out::println);
		 * </pre>
		 */

		
		/*
		 * long count = Stream.of("goldfish", "finch") .filter(s -> s.length() > 5)
		 * .collect(Collectors.toList()) .stream() .count(); System.out.println(count);
		 */
		  // 1
		 
		// or

		/*
		 * List<String> helper = Stream.of("goldfish", "finch") .filter(s -> s.length()
		 * > 5) .collect(Collectors.toList()); count = helper.stream() .count();
		 * System.out.println(count);//1 System.out.println("\n");
		 * 
		 * Stream<Integer> infinite = Stream.iterate(1, x -> x + 1); infinite.limit(5)
		 * .filter(x -> x % 2 == 1) .forEach(System.out::print); // 135
		 * System.out.println("\n");
		 */

		/*
		 * infinite = Stream.iterate(1, x -> x + 1); 
		 * infinite.limit(5)
		 * .peek(System.out::print) .filter(x -> x % 2 == 1)
		 * .forEach(System.out::print);//11233455 System.out.println("\n");
		 */
		/*
		 * infinite = Stream.iterate(1, x -> x + 1); infinite.filter(x -> x % 2 == 1)
		 * .limit(5) .forEach(System.out::print); // 13579 System.out.println("\n");
		 */

		/*
		 * infinite = Stream.iterate(1, x -> x + 1); infinite.filter(x -> x % 2 == 1)
		 * .peek(System.out::print) .limit(5) .forEach(System.out::print);//1133557799
		 */ 
		  
	}
}
