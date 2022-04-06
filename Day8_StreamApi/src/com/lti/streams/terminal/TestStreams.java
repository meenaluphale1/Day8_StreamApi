package com.lti.streams.terminal;

import java.util.*;

public class TestStreams{

	public static void main(String []arg)
	{
		int[] nums = {1,2,3,4,5};
		
		int sum =  Arrays.stream(nums).sum();
		
		System.out.println(sum);
		//print only Even values
		Arrays.stream(nums)
		    .filter(e -> e%2==0)
			.forEach(System.out::println);

		//Ex2: 
		//Old way:
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7);
		for(Integer n : list)
		{
			int x = n * n;
			System.out.println(x);
		}

		//New way:
		List<Integer> list1 = Arrays.asList(1,2,3,4,5,6,7);
		
		list1.stream().map((x) -> x*x).forEach(System.out::println);
		
		
	}
}
/*
Method reference is used to refer method of functional interface.
 It is compact and easy form of lambda expression. 
 Each time when you are using lambda expression to just referring a method, 
 you can replace your lambda expression with method reference. 
*/