package com.lti.streamop.interm;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/*
 * The flatMap() method returns a new array formed 
 * by applying a given callback function to each element of the array,
 *  and then flattening the result by one level.
 *   It is identical to a map() followed by a flat() of depth 1, 
 *  but slightly more efficient than calling those two methods separately.*/

public class FlatMap {

    public static void main(String[] args) {
        List<String> zero = Arrays.asList();
        List<String> one = Arrays.asList("Bonobo");
        List<String> two = Arrays.asList("Mama Gorilla", "Baby Gorilla");
        
        Stream<List<String>> animals = Stream.of(zero, one, two);
        
        Stream<String> stream = animals.flatMap(List::stream);
        //combine all lists in a stream 

        stream.forEach(System.out::println);
    }
}

