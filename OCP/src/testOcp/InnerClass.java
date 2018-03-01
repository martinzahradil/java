package testOcp;

public class InnerClass {
	static int coje = 8;

	static void nonStaticMethod() {
		int variable = 5;

		final int navra = 5;
		final int finVar = 5;
		class LocalInner {
			final int innerLocalVariable = coje;

			protected void pokus() {
				System.out.println(finVar);
			}

		}
	}

	public static void main(String[] args) {

	
	}

}
