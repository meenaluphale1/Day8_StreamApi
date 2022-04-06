package com.lti.streams.terminal;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class WithMap 
{
	public static void main(String[] args) {		
	
	 List<Person> persons = Arrays.asList(
             new Person("jay", 30),
             new Person("vijay", 20),
             new Person("Sanjay", 40)
     );
	 
     List<String> collect = persons.stream()
             .map(Person::getName) //( p-> p.getName())
             .collect(Collectors.toList());
     
     collect.forEach(System.out::println); // (collect)-> System.out.println(Collect) 
          
    /* String name = persons.stream()
             .filter(x -> "jay".equals(x.getName()))
             .map(Person::getName)  //convert stream to String
             .findAny()
             .orElse("");
     
    System.out.println(name);*/
     

 }

}
