package testOcp;

import java.io.File;


public class StreamTest {
	
	public transient static int ahoj=7;
	public transient int boje= 7;

	public static void main(String[] args) {
	
		File k = new File("C:\\_Projects");
	
		String[] listik= k.list();
		for(String a: listik) {
			System.out.println(a);
		}
		System.out.println(System.getProperty("user.dir"));
		File[] pelicko= File.listRoots();
		for (File file: pelicko) {
			System.out.println(file);
			System.out.println(file.getFreeSpace());
			System.out.println(file.getTotalSpace());
			System.out.println(file.getUsableSpace());
		}
	}

}
