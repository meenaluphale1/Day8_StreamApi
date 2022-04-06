/* Program to Demonstrates 'Own exception' */
//applied in project -> Java_Training_Godrej_OOPS -> com.godrej.casestudy-> Account 

package com.lti.exp;

//user defined // custom exception 
class OwnException extends Exception
{
	@Override
	public String getMessage()	{
		
		return "plz check  number is even";
	}	
}
class ExceptionDemo9{
	
	 static void evenodd(int number) throws OwnException 
	{
		System.out.println("\n called evenodd method");
		
		if(number%2==0)
					System.out.println("Normal Exit....Number is Even ");
		else
			throw new OwnException();		
	}	
	 

static void validate(int no) throws OwnException {
	
		evenodd(23);
	
}
	
	public static void main(String args[]) 
	{	
				try {
						validate(23) ;
					} catch (OwnException e) {
						System.out.println(e.getMessage());
					}
											
			System.out.println("pgm continues ");
	}
}
				
