package testOcp;

public class Singelton {
	static int count = 0;

	private static Singelton anInstance;

	public static Singelton getInstance() {

		if (anInstance == null) {
			System.out.println("prvni if");
			synchronized (Singelton.class) {
				if (anInstance == null) {
					System.out.println("druhy if");
					anInstance = new Singelton();
				}
			}
		}
		System.out.println("vrat");
		return anInstance;

	}

	private Singelton() {
		count++;
		System.out.println(count);

	}

	public static void main(String[] args) {
		Singelton prvni= getInstance();
		Singelton druhy= getInstance();
		
		// TODO Auto-generated method stub

	}

}
