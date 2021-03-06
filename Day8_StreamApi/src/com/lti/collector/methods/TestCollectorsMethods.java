package com.lti.collector.methods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestCollectorsMethods {
	
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(10, 20, 30, 11,20 , 33, 4, 44, 55, 20); 
		
		// 1. Collectors.toSet() Example 
		//o collect the result of a Stream into Set, - ddupliactes removed // insertion order not maintained 

		Set<Integer> numbersWithoutDups = numbers.stream().collect(Collectors.toSet());
		System.out.println("original list: " + numbers); 
		System.out.println("1. Set generated by Collectors: " + numbersWithoutDups +"\n");
		
		 Stream<String> animals = Stream.of("lions", "tigers", "bears","tommy", "tigers");
        HashSet<String> result1 = animals
                                    .filter(s -> s.startsWith("t"))
                                    .collect(Collectors.toCollection(HashSet::new));
        System.out.println(result1);
		
		
		// 2. Collectors.toList() Example // duplicates allowed , inserrtion order maintained 
		List<Integer> numbersWithDups = numbers.stream().collect(Collectors.toList()); 		
		System.out.println("\n2. List generated by Collectors: " + numbersWithDups); 
		
		
		// 3. Collectors.toCollection() Example
		//to convert a Stream into any Collection class, e.g. ArrayList, HashSet, TreeSet, LinkedHashSet, Vector, PriorityQueue, etc.
		//This method accepts a Supplier, // just provide a constructor reference for the class you want to use to collect elements of Stream.

		
		ArrayList<Integer> anArrayList = numbers.stream() .collect(Collectors.toCollection(ArrayList::new));
	
		System.out.println("\n3. ArrayList created by Collectors: " + anArrayList);
		
		Set<Integer> hashSet = numbers.stream() .collect(Collectors.toCollection(HashSet::new));
		System.out.println("3.Set created by Collectors: " + hashSet);
		
		// 4. Collectors.toMap() Example 
		
	//The Function.idenity() means the same object will be stored as a key, 
		//while String::valueOf means string representation fo that Integer object will be saved as the value.

		
		Map<Integer, String> intToString = numbersWithoutDups.stream()
															  .collect(Collectors.toMap(Function.identity(), String::valueOf)); 
	
		System.out.println("\n4. Map created by Collectors: " + intToString); 
		
		List<Student> students = Arrays.asList(
		        new Student(101,"John",19),
		        new Student(102,"Mike",  21),
		        new Student(103,"Michael", 20)
		);
		
		Map<String, Integer> nameScore = students.stream()
                .collect(Collectors.toMap(Student::getStuName, Student::getScore));
		
		System.out.println("4. Map created by Collectors: " + nameScore);
		
		Stream<String> s = Stream.of("apple", "banana", "orange");
        Map<Character, String> m = s.collect(
                            Collectors.toMap(s1 -> s1.charAt(0),
                                                s1 -> s1));
        System.out.println("4. " +m);
			
		// 5. Collectors.joining() Example 
        Stream<String> ohMy = Stream.of("lions", "tigers", "bears");
        String result = ohMy.collect(Collectors.joining(": "));
        System.out.println("\n6."+ result); 
		
		String csv = numbers.stream().map(String::valueOf).collect(Collectors.joining(", ")); 
		 
		System.out.println("\n6. Comma separated String created by Collectors.joining() : " + csv); 
		
		
		
		// 6. Collectors.summaryStatistics() Example 
		
		IntSummaryStatistics summary = numbers.stream() .collect(Collectors.summarizingInt(Integer::valueOf)); 
		
		double average = summary.getAverage(); 
		int maximum = summary.getMax(); 
		int minimum = summary.getMin();
		System.out.println("\n7. Summery Statistic");
		System.out.println("Avg : "+average + "\t max: " + maximum + " \t min: " +minimum ) ; 
		
		
		// 7. Collectors.groupingBy() Example     
	/*	
		Stream<Locale> streamOfLocales = Stream.of(Locale.getAvailableLocales()); 
		Map<String, List<Locale>> countryToLocale = streamOfLocales
				.collect(Collectors.groupingBy(Locale::getCountry));   	
		System.out.println("\n8. locales group by countries using Collectors.groupingBy:\n " + countryToLocale); 
		*/
		
		//7. Collectors.averagingInt() Example     
	/*	// ohMy = Stream.of("lions", "tigers", "bears");
        Double results = ohMy.collect(Collectors.averagingInt(String::length));
        System.out.println("\n 8. average  " +results); 
		*/
		
		// 9. Collectors.partitionBy() Example     
		
	/*	Map<Boolean, List<Integer>> evenAndOddNumbers = numbers.stream(). 
				collect(Collectors.partitioningBy(number -> number%2 ==0 ));     

		System.out.println("\n9. even nubmers: " + evenAndOddNumbers.get(true));   
		System.out.println("odd nubmers: " + evenAndOddNumbers.get(false));     
		
		// 10. Collectors.counting() Example   

		long count = numbers.stream().filter( number -> number> 10)  
				.collect(Collectors.counting());     
			System.out.println("\n10 count: " + count); 
			*/
	}
	
}





















