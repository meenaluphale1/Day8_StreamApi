/* Program that intentionally causes a divide-by-zero error.*/
package com.lti.exp;
class ExceptionDemo1
{
	public static void main(String args[ ]) throws Exception
	{
			
		int j =100;
		
				try
				{
						int i =0;
						j =500/i;
						System.out.println(" j =" +j);
						
				}
				catch(Exception e)
				{
				
				System.out.println(" plese check i is zero ");
				//System.out.println( e.getMessage());				
				//e.printStackTrace();
				
				}
				finally
				{
					System.out.println(" close connection ");
				}
				
		System.out.println(" j " +j);
		
		
		
		
		
		
		
	}
}