package cz.isonsoft.assertexce;

class MissingMoneyException extends Exception {
}

class MissingFoodException extends Exception {
}

public class Problem {
	public void doIHaveAProblem() throws MissingMoneyException, MissingFoodException {
		System.out.println("No problems");
	}

	public static void main(String[] lots) {
		try {
			final Problem p = new Problem();
			p.doIHaveAProblem();
		} catch (Exception e) {

//			throw new Exception(e.getStackTrace());
		}
	}
}
