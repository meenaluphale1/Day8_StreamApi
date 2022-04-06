package com.lti.streamop.interm;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/*useful for debugging because it allows us to perform a 
 *stream operation without actually changing the stream. 
 * The method signature is as follows: 
 Stream<T> peek(Consumer<? super T> action)
 */

public class Peek {

    public static void main(String[] args) {    	
		
    	/* Stream<String> stream = Stream.of("gblack bear", "brown bear", "grizzly"); 
    	 long count = stream.filter(s -> s.startsWith("g")) 		 
    			 			 .peek(System.out::println)
    			 			  .count(); 
    	 
    	 System.out.println(count); */
		 
    	 
      
        List<Integer> numbers = new ArrayList<>(); 
        numbers.add(1);
        numbers.add(1);
        numbers.add(1); 
       
        System.out.println(numbers.size());
        
        List<String> letters = new ArrayList<>();   
        letters.add("a"); 
        letters.add("a"); 
        letters.add("a"); 
        letters.add("a"); 
        
        							
        Stream<List<?>> stream1 = Stream.of(numbers, letters);
        
        stream1.map(List::size)
                .forEach(System.out::print); 
/*
       

        //Bad Peek - update variable and result of stream
        Stream<List<?>> bad = Stream.of(numbers, letters);
        bad.peek(x -> x.remove(0))
                .map(List::size)
                .forEach(System.out::print); // 00      
        System.out.println(numbers + " "+ letters);*/
    }
}













