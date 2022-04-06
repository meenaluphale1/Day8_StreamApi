package com.lti.streamop.interm;

import java.util.stream.Stream;

//pass any Predicate to it 

//Filter method - > uses Predicate 


public class Filter {

    public static void main(String[] args) {
    	
        Stream<String> s = Stream.of("monkey", "gorilla", "mew " , "mmmm");       
      
        s.filter(x -> x.startsWith("m"))
                .forEach(System.out::print); 
       
     
    }
}

//Below is the signature of filter() method in java.util.stream.Stream interface.

//Stream<T> filter(Predicate<? super T> predicate);

//From the method signature, it is evident that the type of Predicate should be the same as the type of stream.

//Suppose you have a list of Student objects and you want to get only those students whose age is greater than 15 years.
//Following stream will use Predicate for this as below.

//create a predicate as per the condition
  
  /*
   * 
   
Predicate<Student> p = p -> p.getAge() > 15;
// filter records
List<Student> studentsGreaterThan15 = students.
                                      filter(p).
                                      collect(Collectors.toList());*/
