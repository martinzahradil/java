package cz.isonsoft.lambda;

import java.util.ArrayList;
import java.util.List;

public class Initech {
	public static void main(String[] reports) {
		final List<Boss> bosses = new ArrayList(8);
		bosses.add(new Boss("Jenny"));
		bosses.add(new Boss("Ted"));
		bosses.add(new Boss("Grace"));
		bosses.removeIf(s -> s.getName().equalsIgnoreCase("ted"));
		System.out.print(bosses);
	}
}
