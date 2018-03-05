package testOcp;

import java.util.function.*;
import java.util.stream.*;

public class StreamGenerate {
	int y;
	int x = y= 99;
	

	public static void main(String[] args) {
		Predicate<? super String> predicate = s -> s.length() > 3;
		Stream<String> stream = Stream.iterate("1-", (s) -> s + s);
		stream.limit(5)
		.peek(System.out::println)
		//boolean b1 = stream.noneMatch(predicate);
		//boolean b2 = stream.anyMatch(predicate);
		//System.out.println(b1 + " " );
		.forEach(System.out::println);
		StreamGenerate s = new StreamGenerate();
		System.out.println(s.y);
		System.out.println(s.x);
		double x = (double)(2+3)/2;
		System.out.println(x);
	}

}
