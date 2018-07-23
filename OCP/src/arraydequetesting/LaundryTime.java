package arraydequetesting;

import java.util.ArrayDeque;

class Wash<T> {
	T item;

	public void clean(T item) {
		this.item = item;
		System.out.println("Clean " + item);
	}
}

class Car {

}

public class LaundryTime {

	public static void main(String[] args) {
		Wash wash = new Wash<String>();
		wash.clean(new Car());
	}
}
