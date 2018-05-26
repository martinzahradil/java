package cz.isonsoft.lukas;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class LoopTest {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>(); // Arrays.asList("jedna", "dva", "tri");
	/*	set.add("jedna");
		set.add("dva");
		set.add("tri");
		set.add("dva");

		List<Car> listCar = new ArrayList<>();
		listCar.add(new Car("octavia", 5, "modra"));
		listCar.add(new Car("ceed", 10, "cerna"));
		listCar.add(new Car("323", 15, "stribrna"));

		String[] pole = { "jedna", "dva", "tri" };

		outer: for (Car test : listCar) {

			System.out.println(test.getModel());
			inner: for (String ineerTest : pole) {
				if (ineerTest == "dva") {
					break ;
				}
				System.out.println("pole : " + ineerTest);
			}
		}*/
		
		String tes = "neco neco";
		tes.substring(0, 5);
		System.out.println(tes);
		
		LocalDate ld = LocalDate.of();
		ld=ld.plusDays(5);
		System.out.println(ld);
	}

}
