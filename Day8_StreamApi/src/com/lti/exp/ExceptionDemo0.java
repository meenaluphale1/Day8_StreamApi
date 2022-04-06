package com.lti.exp;
	//why ? 
public class ExceptionDemo0 {	
	public static void main(String[] args)
	{		
		int k=100;			
		/* int i = 0;
		int j =500/i;
		System.out.println(" j " +j);		*/		
		try
		{		
		int i = 0;
		int j =500/i;
		System.out.println(" j " +j);
		}
		catch(Exception e)
		{
		System.out.println("pin no not correct  ");
		System.out.println(e.getMessage());
		//e.printStackTrace();
		}
		finally
		{
		//  
		}
		System.out.println("K"+k);		
		
	
	}

}

