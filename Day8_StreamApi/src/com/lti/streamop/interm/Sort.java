package com.lti.streamop.interm;

import java.util.Comparator;
import java.util.stream.Stream;
// returns a stream with the elements sorted. Just like sorting arrays, 
//Java uses natural ordering unless we specify a comparator. T
public class Sort {
	

    public static void main(String[] args) {
        Stream<String> s = Stream.of("brown-", "bear-");
        
        s.sorted().forEach(System.out::print); // bear-brown-
        
        System.out.println("\n");
    
        Stream<String> s1 = Stream.of("brown bear-", "grizzly-");
        
        s1.sorted(Comparator.reverseOrder())
                      .forEach(System.out::print); // grizzly-brown bear-

        
       // s1.sorted(Comparator::reverseOrder); // DOES NOT COMPILE
    }
}

/*
returns a stream with the elements sorted. Just like sorting arrays, 
Java uses natural ordering unless we specify a comparator. T*/