package com.lti.funint.prim;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class MyDoubleStream {

    public static void main(String[] args) {
    	
        DoubleStream empty = DoubleStream.empty();

        DoubleStream oneValue = DoubleStream.of(3.14);
      //  oneValue.forEach(System.out::println); // 3.14 
     
        DoubleStream varargs = DoubleStream.of(1.0, 1.1, 1.2);
       varargs.forEach(System.out::println); //1.0, 1.1, 1.2

        DoubleStream random = DoubleStream.generate(Math::random);        
      random.limit(3).forEach(System.out::println); // any 3 nos 
        
       // method  of stream filter()  -->  (lambda ?  impl fun interface  )
  
        DoubleStream fractions = DoubleStream.iterate(.5, d -> d / 2);
        //fractions.limit(3).forEach(System.out::println);    // 0.5 0.25 0.125 
        
        
      //DoubleStream.iter
        
        //  priimitive Functional Interrfaces avail methods 
        // Streams for primitive datatypes 
        //Functional Intefaces for prim datatypes        
        
        IntStream range = IntStream.range(1, 6);        
        range.forEach(System.out::println);
        
        IntStream rangeClosed = IntStream.rangeClosed(1, 5);
        rangeClosed.forEach(System.out::println);
        
        
        
    }
}
