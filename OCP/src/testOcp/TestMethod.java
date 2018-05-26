package testOcp;

public class TestMethod {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
System.out.println(play("wtf"));
	}

	public static int play(String dogName) throws Exception {
		try {
			if(true)
			throw new RuntimeException(dogName);
			else
				throw new RuntimeException(dogName);
		}catch(Exception e) {
			throw new RuntimeException(e);
		}
	}
}
