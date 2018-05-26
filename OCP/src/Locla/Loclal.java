package Locla;

import java.util.Locale;
import java.util.ResourceBundle;

public class Loclal {

	public static void main(String[] args) {
		Locale.setDefault(new Locale("en", "US"));
		ResourceBundle rb = ResourceBundle.getBundle("Buggy",new Locale("cz","CZ"));
		System.out.println(rb.getBaseBundleName());
		System.out.println(rb.getString("wheels"));
	}

}
