package com.lti.streamop.interm;

import java.util.stream.Stream;

//s make a Stream smaller. They could make a finite stream 
//smaller, or they could make a finite stream out of an infinite stream. 

public class LimitSkip {

    public static void main(String[] args) {
    	
       Stream<Integer> s = Stream.iterate(1, n -> n + 1);     
       
     // s.forEach(System.out::println);
       // limit ( total 10 values) 
       s.skip(4).limit(10).forEach(System.out::println); 
       
      // s.skip(5).limit(20).forEach(System.out::println); 
    }
}
