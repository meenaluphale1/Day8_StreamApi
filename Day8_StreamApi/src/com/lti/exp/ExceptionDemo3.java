/* Program to demonstrates multiple catch clauses */
package com.lti.exp;
class ExceptionDemo3
{
	public static void main(String args[ ]) 
	{
		int arr[] = {10,5};
		int a = 5;
	
		try
		{      
			arr[0]=100;
			int b = arr[0]/10;
		}		
		//multiple catch // 
		catch(  ArithmeticException | ArrayIndexOutOfBoundsException  e)   
		{       
			System.out.println("\n enhancement ..multiple expceptions in single catch block ");
			System.out.println("\n Error ....."+e);			
		}
		
		System.out.println("\n After try/catch block....");
	}
}
	//ArrayStore - if u r trying to  store the wrong type of object into an array of objects 
//Object[] ary = new Integer[4];
