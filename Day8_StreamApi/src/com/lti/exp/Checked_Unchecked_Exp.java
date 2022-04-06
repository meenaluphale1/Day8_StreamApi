package com.lti.exp;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class Checked_Unchecked_Exp {
		public static void main(String[] args)    {	  
		
		int k=1000;			
		
		int i = 0;
		int j =500/i;
		System.out.println(" j " +j);		
		System.out.println("K:" + k);	
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			String str = br.readLine();
			
		} catch (IOException e) {
			System.out.println(" sandns");
			e.printStackTrace();
		}
		
		
	
	}

}

