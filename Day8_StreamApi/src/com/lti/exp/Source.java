package com.lti.exp;
//user defined or own exception class MyExp /UserExp
//stpe 1 : create a class myExp extends Exception
class NumException extends Exception 
{
	public String getMessage() // 2. you can override getMessage method 
	{
		return "Please check n2 has value zero";
	}
}
public class Source {
	
	public static int calDiv(int num1, int num2) throws NumException // 4. throws decalrations beside out method 
	{
		
		if (num2 == 0) // 3. whenever the conditions fails 
			throw new NumException();//step 3.  new object of your own class is being thrown
		else
			return num1 / num2;
		
		
	}
	
	public static void main(String ar[])  {
		int n1, n2, result;
		n1 = 100;
		n2 = 0;
	
			try {
				result = calDiv(n1, n2);
				System.out.println(result);
				
			} catch (NumException e) {
				
				e.printStackTrace();
			} 
			
			

	
	}
	
}






