package cz.isonsoft.lukas;

public class Lukas {

	 private int age;
	int size;
	static int count;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	 protected Lukas(int age, int size) {
		this.age = age;
		this.size = size;
	}

	public Lukas() {

	}

	public static void main(String[] args) {
		int a = 5;
		int b = 10;
		Lukas lukas = new Lukas(a, b);

		// lukas.age = 5;
		// Lukas petr = new Lukas(5,5);
		// System.out.println("count" + petr.count);
		// System.out.println("age" + petr.age);
		// Lukas martin = new Lukas();
		// System.out.println("a " + a);
		// System.out.println("b " + b);
		// System.out.println(Lukas.sum(a, b));
		// System.out.println("a " + a);
		// System.out.println("b " + b);
		System.out.println("age: " + lukas.age);
		getAge(lukas);
		System.out.println("age2: " + lukas.age);

	}

	public static int sum(int c, int d) {
		c += c;
		d++;
		return c + d;
	}

	public static void getAge(Lukas ttt) {

		ttt.age = 100;
	}
}
