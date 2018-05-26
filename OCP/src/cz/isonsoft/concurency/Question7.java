package cz.isonsoft.concurency;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Question7 {

	public static void main(String[] args) {
//		Stream.of(10,20,22,12,14,55).reduce((x,y)->x+y).ifPresent(System.out::println);
//		 
//        Stream.of(10,20,22,12,14,55).reduce(Integer::sum).ifPresent(System.out::println);
// 
//        Stream.of("java", "c", "c#", "python").reduce((x,y)->x+" | "+y).ifPresent(System.out::println);
        
        List<Number > intList = new ArrayList<Number>();
        intList.add(10);
        intList.add(new Double(10.5));
        
        for(Number n:intList) {
        	System.out.println(n.getClass());
        }
        

	}
	
}
