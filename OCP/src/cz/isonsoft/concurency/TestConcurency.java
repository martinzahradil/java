package cz.isonsoft.concurency;

import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class TestConcurency {
	public static int counter = 0;

	public static String printNext() {
		return "next";

	}

	public static  int printInt() {
		return ++counter;

	}

	public static void main(String[] args) throws InterruptedException {

		pokus();

	}

	private static void pokus() throws InterruptedException {
		ExecutorService service = null;
		CyclicBarrier c = new CyclicBarrier(5, () -> System.out.println("barrier"));
		long start = System.currentTimeMillis();
		try {
			service = Executors.newFixedThreadPool(20);

			for (int i = 0; i < 10000000; i++)
				service.submit(() -> printInt());
					// try {
					// c.await();
					// } catch (InterruptedException | BrokenBarrierException e) {
					// // TODO Auto-generated catch block
					// e.printStackTrace();
					// }
					// System.out.println(printNext());
				

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			if (service != null) {
				service.shutdown();
				//
			}

		}

		service.awaitTermination(10000000, TimeUnit.MILLISECONDS);
		long end = System.currentTimeMillis();
		System.out.println("time calculation: " + ((end - start) / 1000) + "s");
		System.out.println(TimeUnit.MILLISECONDS.toSeconds(end - start));
	}

}
