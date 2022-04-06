package com.lti.exp;
//method overriding example 
/*
 * If super class method does not declare any exception, 
 then sub class overriden method cannot declare checked exception 
 but it can declare unchecked exceptions.*/

import java.io.IOException;
import java.util.Scanner;

class SuperClass { 
  
    // SuperClass doesn't declare any exception 
    void method() 
    { 
        System.out.println("SuperClass"); 
    } 
}   
class SubClass extends SuperClass {   
	
     void method() throws ArithmeticException //throws ArithmeticException //unchecked exp// //checked exp throws IOException
    { 
          System.out.println("SubClass");   
    } 
}
public class ExceptionDemo8 {

	public static void main(String[] args) {		
		
		SuperClass s = new SubClass(); 
        s.method(); 		
	}
}


