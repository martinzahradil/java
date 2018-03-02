package testOcp;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {
	public static void main(String[] args) {
	Queue<Integer> q = new LinkedList<>();
	q.add(10);
	q.add(12);
	q.remove();
	System.out.println(q);
	
	}
}
