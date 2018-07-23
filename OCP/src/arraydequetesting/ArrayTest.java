package arraydequetesting;

import java.util.ArrayDeque;

public class ArrayTest {
	public static void main(String[] args) {
		
		ArrayDeque<String> ar = new ArrayDeque<>();
		ar.offer("alfons");
		ar.offer("toby");
		ar.add("neco mezi");
		ar.push("poslednakPrvnak");
		
		System.out.println("poll: " +ar.poll());
		
		for (String a : ar) {
			System.out.println(a);
		}
		
		while(!ar.isEmpty()) {
			System.out.println("ar:  "+ar.pop());
		}
	
	}

}
