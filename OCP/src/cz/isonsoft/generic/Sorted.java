package cz.isonsoft.generic;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Sorted {
static int count ;
	public static void main(String[] args) {
		Stream<Integer> bol = Stream.of(3,1,3);
		 bol.filter(b->b>5).forEach(System.out::print);
	 			
	}

}