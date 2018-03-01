package testOcp;

import java.nio.file.*;
import java.nio.file.Paths;
import java.util.Set;
import java.util.TreeSet;

class Magazine implements Comparable<Magazine> {
	private String name;

	public Magazine(String name) {
		this.name = name;

	}

	@Override
	public int compareTo(Magazine m) {
		return name.compareTo(m.name);
	}

	@Override
	public String toString() {
		return name;

	}
}

public class TestMagazine {

	public static void main(String[] args) throws Exception {
		Set<Magazine> set = new TreeSet<>();
		System.out.println(set.add(new Magazine("prvni")));
		System.out.println(set.add(new Magazine("Druhy")));
		System.out.println(set.add(new Magazine("prvni")));
		System.out.println(set.iterator().next());
		System.out.println(set.iterator().next());

		set.stream().forEach(System.out::println);
		int hh = 5;
		assert hh == 6 : "moje" + hh;
		Path p = Paths.get("\\moje\\.\\tvoje\\..\\nase\\coje.txt");
		Path p2 = Paths.get("\\Users\\MartinZahradil\\Pictures\\Saved Pictures");
		Path p3	= Paths.get("\\jj\\tktk");
		System.out.println(p2.relativize(p3));

	}

}
