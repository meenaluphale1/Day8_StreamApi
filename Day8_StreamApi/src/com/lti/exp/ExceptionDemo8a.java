package com.lti.exp;
/*
If Super class method throws an exception, 
then Subclass overriden method can throw the same exception or no exception,or subclass  
but must not throw parent exception of the exception thrown by Super class method.*/

class SuperClass1 {   
    // SuperClass declares an exception	
    void method() throws ArithmeticException  //
    { 
        System.out.println("SuperClass");         
    } 
}   
class SubClass1 extends SuperClass1 { 
      // SubClass declaring an exception  // which are not a child exception of RuntimeException 
    void method() throws ArithmeticException
    { 
       
        System.out.println("SubClass"); 
    } 
  } 
public class ExceptionDemo8a {
	
	public static void main(String[] args) throws Exception {
		SuperClass1 s = new SubClass1(); 
        s.method(); 
	}

}