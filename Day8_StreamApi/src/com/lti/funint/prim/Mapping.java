package com.lti.funint.prim;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Mapping {

    public static void main(String[] args) {
    	
    	 List<Integer> list = Arrays.asList(1, 2, 3, 4);
    	 int[] arr = list.stream().mapToInt(i -> i).toArray(); //[1, 2, 3, 4]
    	
    	// This function that takes an Object , which is a String in this case.
    	 //The function returns an int .
    	 //The function -They take the source type and return the  target type. 
   //  When returning an object stream, the method is mapToObj() .
    	    // Beyond that, it’s the name of the primitive type in the map method name. 
    	
        Stream<String> objStream = Stream.of("penguin", "fish");
        IntStream intStream = objStream.mapToInt(s -> s.length());
        intStream.forEach(System.out::println);
      

        //flatMapToXXX
        List<Integer> integerList = new ArrayList<Integer>();
        IntStream ints = integerList.stream()
                .flatMapToInt(x -> IntStream.of(x));
        DoubleStream doubles = integerList.stream()
                .flatMapToDouble(x -> DoubleStream.of(x));
        LongStream longs = integerList.stream()
                .flatMapToLong(x -> LongStream.of(x));
    }

    
    
    private static Stream<Integer> mapping(IntStream stream) {
        return stream.mapToObj(x -> x);
    }

    private static Stream<Integer> boxing(IntStream stream) {
        return stream.boxed();
    }
}
