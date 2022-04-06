package com.lti.funint.prim;

import java.util.HashMap;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class UsingOptional {

    public static void main(String[] args) {
    	
    
		  IntStream stream = IntStream.rangeClosed(1, 10); 
		  
		  OptionalDouble optional =  stream.average();
		  
		  optional.ifPresent(System.out::println);
		  
		  System.out.println(optional.getAsDouble());
		  
		  System.out.println(optional.orElseGet(() -> Double.NaN));
		  
		  
		  DoubleStream doubles = DoubleStream.generate(() -> Math.PI);
		  
		  OptionalDouble min = doubles.limit(3).min();
		 		
		  DoubleStream .generate(() -> Math.PI) .limit(3) .min();
		  System.out.println(min);
		 
    }
}
