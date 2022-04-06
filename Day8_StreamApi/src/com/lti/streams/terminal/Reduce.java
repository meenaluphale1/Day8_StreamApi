package com.lti.streams.terminal;

import java.util.Arrays;
import java.util.function.BinaryOperator;
import java.util.stream.Stream;

public class Reduce {

	public static void main(String[] args) {
		
		Stream<Integer> numbers = Stream.of(3, 5, 6);
		// 3, 5, 6
		// 15 6
			
		System.out.println(numbers.reduce((a, b) -> a * b));
		
		//int sum1 = Stream.of(3, 5, 6).reduce(0,(a, b) -> a * b);
		//System.out.println(sum1);

											// 2 * 3 // 6 * 5 // 30* 6 
		int sum2 = Stream.of(3, 5, 6).reduce(2, (a, b) -> a * b);
		System.out.println(sum2);

		//int sum3 = Stream.of(3, 5, 6).reduce(3, (a, b) -> a * b);
		//System.out.println(sum3);

		
		 
		
		/*
		 * //Java 7 String[] array = new String[]{"w", "o", "l", "f"}; String result =
		 * ""; for (String s : array) { result = result + s; }
		 * System.out.println(result);
		 * 
		 * //Java 8 //1 Stream<String> stream1 = Stream.of("w", "o", "l", "f");
		 * 
		 * String word = stream1.reduce("", (s, c) -> s + c); System.out.println(word);
		 * 
		 * 
		 * 
		 * //or stream1 = Stream.of("w", "o", "l", "f"); String word1 =
		 * stream1.reduce("", String::concat); System.out.println(word1);
		 * 
		 * //2 Stream<Integer> stream2 = Stream.of(3, 5, 6);
		 * 
		 * System.out.println(stream2.reduce((a, b) -> a * b));
		 * 
		 * System.out.println(Stream.of(3, 5, 6).reduce((a, b) -> a * b));
		 * 
		 * 
		 * 
		 * BinaryOperator<Integer> op = (a, b) -> a * b; Stream<Integer> empty =
		 * Stream.empty(); Stream<Integer> oneElement = Stream.of(3); Stream<Integer>
		 * threeElements = Stream.of(3, 5, 6);
		 * 
		 * empty.reduce(op).ifPresent(System.out::println);
		 * oneElement.reduce(op).ifPresent(System.out::println);
		 * threeElements.reduce(op).ifPresent(System.out::println);
		 * 
		 * //3 Stream<String> stream3 = Stream.of("w", "o", "l", "f!"); int length =
		 * stream3.reduce(0, (i, s) -> i + s.length(), (a, b) -> a + b);
		 * System.out.println(length);
		 * 
		 * Stream.of("w", "o", "l", "f!") .reduce(0, (i, s) -> i + s.length(), (a, b) ->
		 * a + b); System.out.println(length);
		 */
	}
}
