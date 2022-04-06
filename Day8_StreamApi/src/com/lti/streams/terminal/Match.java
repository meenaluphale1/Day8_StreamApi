package com.lti.streams.terminal;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Match {

	
    public static void main(String[] args) {
        
        List<String> list = Arrays.asList("monkey", "2", "chimp");     
        
       Stream<String> infinite = Stream.generate(() -> "chimp");     
       
       							//"2"
       Predicate<String> pred = x -> Character.isLetter(x.charAt(0));       
      
        System.out.println(list.stream().anyMatch(pred));
        
        
        System.out.println(list.stream().allMatch(pred)); 
        
        
        System.out.println(list.stream().noneMatch(pred)); 
        
       System.out.println(infinite.anyMatch(pred)); 

       // infinite.forEach(System.out::println);
    }
}
