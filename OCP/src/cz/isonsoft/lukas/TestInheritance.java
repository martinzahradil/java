package cz.isonsoft.lukas;

import cz.isonsoft.lukas.Bigger;
import cz.isonsoft.lukas.Largest;
import cz.isonsoft.lukas.Small;

public class TestInheritance extends Bigger {
	static void show(Small abc) {
		System.out.println(abc.a);
		System.out.println("getclass " + abc.getClass());
	}

	public static void main(String[] cokoli) {
System.out.println(cokoli[0]);
System.out.println(cokoli[1]);
//		Small l = new Largest();
//		Small b = new Bigger();
//		Small s = new Small();
//
//		System.out.println(l.love() + " " + l.a);
//		System.out.println(b.love() + " " + b.a);
//		System.out.println(s.love() + " " + s.a);
		// show(s);
		// show(b);
		// show(l);

		// System.out.println(Small.sa);
		// Largest.sa = 100;
		// System.out.println(Small.sa);
		// System.out.println(Largest.sa);
		// Largest test = new Largest();
		// // Largest sec = new Bigger();
		// // Largest Small = (Largest) new Small();
		// test.a = 10;
		//
		// Small smallReference = new Bigger();
		//
		// int x =((Bigger)smallReference).b;
		//
		// System.out.println(test.a);
		// // System.out.println(((Bigger)test).a);
		//
		// Bigger big = (Bigger) test;
		//
		// System.out.println(big.a);
		//
		// System.out.println(((Largest) big).a);
		// System.out.println();
		// System.out.println(test.c);
	}
}
