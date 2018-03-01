package testOcp;

public class NestedClasses {

	InnerClass clovek;
	String povolani;

	NestedClasses(String povolani, InnerClass clovek) {
		this.povolani = povolani;
		this.clovek = clovek;
	}

	NestedClasses() {
		this.clovek = new InnerClass();
		this.povolani = "undef";
	}

	public static class InnerClass {
		static String name;
		static int age;
		int moth;
		

		InnerClass() {
			name = "undef";
			age = 10;

		}

		static void printClovek() {
			System.out.println(name + " " + age);
		}
	}

	public static void main(String[] args) {

		NestedClasses prvni = new NestedClasses();
		NestedClasses.InnerClass.printClovek();

	}

}
