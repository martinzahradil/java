package testOcp;

class TestClass {

	static class Clovek {
		String a = "haha";
		int b = 88;

	@Override
	public String toString() {
		return a +" "+ String.valueOf(b);
	}
	}

	public static <T, U> String concatMy(T t, U u) {
		T prvni = t;
		U druhy = u;

		return prvni.toString() + " " + druhy.toString();

	}

	enum Pocty {
		PRVNI(10, 15), DRUHY(11, 14), TRETI(18, 6);

		private final int jedna;
		private final int dva;

		private Pocty(int jedna, int dva) {
			this.jedna = jedna;
			this.dva = dva;
		}

		int getJedna() {
			return jedna;
		}

		int getDva() {
			return dva;
		}

		String toText() {
			return String.valueOf(getDva() + ":" + getJedna());
		}

	}

	public static void main(String[] args) {
		Pocty enumVar = Pocty.PRVNI;

		switch (enumVar) {
		case PRVNI:
			System.out.println(Pocty.PRVNI.toText());
		case DRUHY:
			System.out.println("from 2");
		default:
			System.out.println("from def");
		}

		for (Pocty p : Pocty.values()) {
			System.out.println(p.toText());
			System.out.println(p.toString());

		}

		System.out.println(concatMy(new Integer(8), new Long(8)));
		System.out.println(concatMy(new Integer(8), new Clovek()));

	}

}
