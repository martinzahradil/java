package cz.isonsoft.generic;

import java.util.List;

public class Gener<T> {
	private T val;

	public Gener(T val) {
		this.val = val;
	}

	public String toString() {
		return "[" + val + "]";
	}
	
	public static <U> String mujGen(U val) {
		return val.getClass().toString();
		
	}
	public static void printList(List<?> list) {
		for(Object n:list) {
			System.out.println(n.getClass());
		}
	}
	

}
