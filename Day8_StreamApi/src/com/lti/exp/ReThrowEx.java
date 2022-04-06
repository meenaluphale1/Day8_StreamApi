package com.lti.exp;

public class ReThrowEx {
	
	public static void main(String[] args) {
		String name = null;

		try {
		     name.equals("Joe"); 

		} catch (Exception e) {			
		    // log
		   //throw e; // rethrowing exception // exception object e is rethrown 		    
		   
		    throw new IllegalArgumentException(" something went wrong at server "+ e ); //wrapping  original NullPointerException 
		    }
		}
	

}

