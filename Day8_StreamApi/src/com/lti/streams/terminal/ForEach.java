package com.lti.streams.terminal;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
/*
 *  Java forEach loop
        Java provides a new method forEach() to iterate the elements. 
        It is defined in Iterable and Stream interface.
        It is a default method defined in the Iterable interface. 
        Collection classes which extends Iterable interface can use forEach loop to iterate elements.

        This method takes a single parameter which is a functional interface. 
        So, you can pass lambda expression as an argument.
 */
public class ForEach {

    public static void main(String[] args) {
        Stream<String> s = Stream.of("Monkey", "Gorilla", "Bonobo");
        s.forEach(System.out::print); // MonkeyGorillaBonobo

      //  Stream s1 = Stream.of(1);
    //   for (String i : s1){ } // DOES NOT COMPILE
        
   
        List<String> gamesList = new ArrayList<String>();  
                gamesList.add("Football");  
                gamesList.add("Cricket");  
                gamesList.add("Chess");  
                gamesList.add("Hocky");  
                gamesList.forEach(games -> System.out.println(games));  

        
    }
}

