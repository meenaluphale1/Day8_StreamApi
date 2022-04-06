package com.lti.streams.terminal;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestStreams2{

	public static void main(String []arg)
	{
		Integer[] nums = {1,2,3,4,5};
		List<Integer> k  =  Arrays.stream(nums)
				    		.limit(3)
				    			.collect(Collectors.toList());
		System.out.println(k);
		

	}
	
}
