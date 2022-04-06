/* Program to Demonstrates 'throws' */
package com.lti.exp;
class ExceptionDemo7
{
	static void procedure() throws IllegalAccessException
	{	
		System.out.println(" Inside procedure( ).....");			
		throw new IllegalAccessException("something wrong ..illegal access ");			
	}		
	public static void main(String args[ ]) throws IllegalAccessException 
	{
		procedure();			
	}
}

