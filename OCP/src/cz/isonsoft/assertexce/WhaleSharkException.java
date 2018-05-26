package cz.isonsoft.assertexce;

public class WhaleSharkException extends Exception {
	public WhaleSharkException() {
		super("Friendly shark!");
	}

	public WhaleSharkException(String message) {
		super(new Exception(new WhaleSharkException()));
	}

	public WhaleSharkException(Exception cause) {
	}
	public static void main(String[] args)throws WhaleSharkException{
		System.out.println("2");
//		WhaleSharkException sk=
		System.out.println("3");
		throw  new WhaleSharkException("ahoj");
	}
}
