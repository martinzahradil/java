package cz.isonsoft.lukasdva;

import cz.isonsoft.lukas.Lukas;

public class TestDifferentPackage extends Lukas{
	
	TestDifferentPackage(){
		super(5,10);
	}

	public static void main(String[] args) {
		int a =0;
		TestDifferentPackage test = new TestDifferentPackage();
		System.out.println(test.getAge());
//		a = test.age;
	}

}
