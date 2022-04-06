package com.lti.funint.prim;

import java.util.IntSummaryStatistics;
import java.util.OptionalInt;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SummarizingStatistics {

    public static void main(String[] args) {
    	
		/*
		 * Stream<String> stream = Stream.iterate("", (s) -> s + "1");
		 * System.out.println(stream.limit(2).map(x -> x +
		 * "2").collect(Collectors.toList()));
		 */
    	
    	// compare :
    	//https://www.javabrahman.com/java-8/java-8-streams-api-creating-infinite-streams-with-iterate-and-generate-methods/
    	
    	
    	Predicate<? super String> predicate = s -> s.startsWith("g");
    	Stream<String> stream1 = Stream.generate(() -> "growl! ");
    	Stream<String> stream2 = Stream.generate(() -> "growl! ");
    	boolean b1 = stream1.anyMatch(predicate);
    	boolean b2 = stream2.allMatch(predicate);
    	System.out.println(b1 + " " + b2);
    	
    	
		/*
		 * IntStream ints = IntStream.of(); System.out.println(max(ints));
		 * 
		 * ints = IntStream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		 * System.out.println(range(ints));
		 * 
		 * ints = IntStream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		 * System.out.println(average(ints));
		 */
    	IntStream  ints = IntStream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println(count(ints));
        
		/*
		 * ints = IntStream.empty(); System.out.println(sum(ints));
		 */
        
    }

    private static int max(IntStream ints) {
        OptionalInt optional = ints.max();
        return optional.orElseThrow(RuntimeException::new);
        //return optional.orElseThrow(x->{System.out.println("Stream is empty");});
    }

    private static int range(IntStream ints) {
        IntSummaryStatistics stats = ints.summaryStatistics();
        if (stats.getCount() == 0) {
            throw new RuntimeException();
        }
        return stats.getMax() - stats.getMin();
    }

    private static long count(IntStream ints) {
        IntSummaryStatistics stats = ints.summaryStatistics();
        return stats.getCount();
    }

    private static long sum(IntStream ints) {
        IntSummaryStatistics stats = ints.summaryStatistics();
        return stats.getSum();
    }    

    private static double average(IntStream ints) {
        IntSummaryStatistics stats = ints.summaryStatistics();
        return stats.getAverage();
    }
}