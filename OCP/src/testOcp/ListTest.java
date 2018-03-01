package testOcp;


import java.util.*;

public class ListTest {

	public static void main(String[] args) {
		List list = new ArrayList();
		//list.add(1);
		//list.add("2");
		list.add(.3);
		print(list);
		
	}
	private static void print (List<String> list) {
		for(Object object:list)
			System.out.print(object);
	}

}
