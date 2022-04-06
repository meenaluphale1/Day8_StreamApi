package com.lti.streamop.interm;

import java.util.stream.Stream;
/*Map method -> uses Function -that takes one argument and produces a result 
 * .
 *  The method signature is as follows:  <R> Stream<R> map(Function<? super T, ? extends R> mapper) 
 It uses the lambda expression to figure out the type passed to that function and the one returned. 
 The return type is the stream that gets returned.
 */
public class Map {

    public static void main(String[] args) {
        Stream<String> s = Stream.of("monkey", "gorilla", "bonobo");
       
      // s.map(String::length) 
        //    .forEach(System.out::println); 
       
 //   s.map(x->x.length()) 
  //  .forEach(System.out::println); 
        
   //  s.map(x->x.startsWith("m")) 
    //  .forEach(System.out::println); 
        
    s.map(x->x.concat("Hi"))
     .forEach(System.out::println);
    
    

        
    }
}
//s.map(String::length)  ===> converts a list of String objects to a list of Integer s 
//representing their lengths
//String::length is means   lambda x -> x.length() means  function that turns a String into an Integer . 