package locale;

import java.text.NumberFormat;
import java.text.ParseException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Set;
import java.time.LocalDateTime;

public class LocaleTest {

	public static void main(String[] args) throws ParseException {
//		Locale locale = Locale.getDefault();
//		System.out.println(locale);
//		System.out.println(Locale.GERMAN); // de
//		System.out.println(Locale.GERMANY); // de_DE
//		System.out.println(new Locale("FR")); // fr
//		System.out.println(new Locale("hi", "IN"));
//		Locale l1 = new Locale.Builder()
//				.setLanguage("de")
//				.setRegion("De")
//				.build();
//		System.out.println(l1);
		
		Locale locale = new Locale ("en");
//		System.out.println(locale);
//		printProper(locale);
		
//		Locale locale2 = new Locale ("en","EN");
//		System.out.println(locale2);
//		printProper(locale2);
		
		String s  = NumberFormat.getInstance(locale).format(2.15);
		Double d = (Double)NumberFormat.getInstance(locale).parse("2.15");
		System.out.println(s+ " "+ d);
//		NumberFormat.getInstance(locale)
		
		LocalDateTime m = LocalDateTime.of(2017, 2,2,2,2);
		Duration dur = Duration.ofDays(1);
		LocalDateTime n = m.minus(dur);
		System.out.println(n);
//		
	}
	public static void printProper(Locale locale) {
		ResourceBundle rs= ResourceBundle.getBundle("Pokus", locale);
		System.out.println(rs.getString("button"));
		
		Set<String> allKeys = rs.keySet();
		allKeys.stream()
		.map(k -> k + " " + rs.getString(k))
		.forEach(System.out::println);
		
		
	}

}
