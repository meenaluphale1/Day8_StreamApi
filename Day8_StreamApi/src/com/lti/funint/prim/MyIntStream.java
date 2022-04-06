package com.lti.funint.prim;

import java.util.OptionalDouble;
import java.util.Random;
import java.util.function.ToIntFunction;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MyIntStream {

	public static void main(String[] args) {

		
		  Stream<Integer> stream = Stream.of(1, 2, 3);
		  System.out.println(stream.reduce(0, (s, n) -> s + n));// 6
		  
		  			
		  //Alternatively, stream = Stream.of(1, 2, 3);
		  Stream<Integer> stream1 = Stream.of(1, 2, 3);
		  System.out.println(stream1.mapToInt(x -> x).sum());//6
		  
		  IntStream intStream = IntStream.of(1, 2, 3);
		  OptionalDouble avg =  intStream.average(); 
		  System.out.println(avg.getAsDouble());// 2.00
		  
		  Random ran = new Random();
		  intStream = ran.ints();
		  intStream.limit(5).forEach(System.out::println);
		  
		  IntStream count = IntStream.iterate(5, n -> n + 1).limit(10);
		  count.forEach(System.out::println);// 1 2 3 4 5 // 2 3 4 5
		  
		  System.out.println("\n");
		  //Alternatively, 
		  IntStream range = IntStream.range(1, 6);
		  range.forEach(System.out::println); //1 2 3 4 5 // 6 not included
		  
		  System.out.println("\n");
		  IntStream rangeClosed = IntStream.rangeClosed(1, 6);
		  rangeClosed.forEach(System.out::println);// 1 2 3 4 5 6 //
		  
		  //page 207  - table 4.7 
		  // Instantiating ToIntFunction   // ToIntFunction is a Functional Interface with applyAsInt() method 
	        ToIntFunction<Double> ob = a -> (int)(a * 10);
	  
	        // Applying the above function using applyAsInt()
	        System.out.println(ob.applyAsInt(3.2));
		  	  
		  
		  
		 
	}
}