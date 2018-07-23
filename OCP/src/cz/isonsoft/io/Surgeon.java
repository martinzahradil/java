package cz.isonsoft.io;

import java.nio.file.Path;
import java.text.Normalizer;
import java.text.Normalizer.Form;

public class Surgeon {

	

	public static void main(String... tools) {
		String original = "aáeéiíoóöőuúüű AÁEÉIÍOÓÖŐUÚÜŰ"
				+ "öœ,\r\n" + 
				"ü,\r\n" + 
				"Ä,\r\n" + 
				"Ü,\r\n" + 
				"Ö,\r\n" + 
				"ÀÁÂÃÄÅǺĀĂĄǍΑΆẢẠẦẪẨẬẰẮẴẲẶА,\r\n" + 
				"àáâãåǻāăąǎªαάảạầấẫẩậằắẵẳặа,\r\n" + 
				"Б,\r\n" + 
				"б,\r\n" + 
				"ÇĆĈĊČ,\r\n" + 
				"çćĉċč,\r\n" + 
				"Д,\r\n" + 
				"д,\r\n" + 
				"Ď,\"D\");\r\n" + 
				"ď,\"d\");\r\n" + 
				"ÐĎĐΔ,\r\n" + 
				"ðďđδ,\r\n" + 
				"ÈÉÊËĒĔĖĘĚΕΈẼẺẸỀẾỄỂỆЕЭ,\r\n" + 
				"èéêëēĕėęěέεẽẻẹềếễểệеэ,\r\n" + 
				"Ф,\r\n" + 
				"ф,\r\n" + 
				"ĜĞĠĢΓГҐ,\r\n" + 
				"ĝğġģγгґ,\r\n" + 
				"ĤĦ,\r\n" + 
				"ĥħ,\r\n" + 
				"ÌÍÎÏĨĪĬǏĮİΗΉΊΙΪỈỊИЫ,\r\n" + 
				"ìíîïĩīĭǐįıηήίιϊỉịиыї,\r\n" + 
				"Ĵ,\r\n" + 
				"ĵ,\r\n" + 
				"ĶΚК,\r\n" + 
				"ķκк,\r\n" + 
				"ĹĻĽĿŁΛЛ,\r\n" + 
				"ĺļľŀłλл,\r\n" + 
				"М,\r\n" + 
				"м,\r\n" + 
				"ÑŃŅŇΝН,\r\n" + 
				"ñńņňŉνн,\r\n" + 
				"ÒÓÔÕŌŎǑŐƠØǾΟΌΩΏỎỌỒỐỖỔỘỜỚỠỞỢО,\r\n" + 
				"òóôõōŏǒőơøǿºοόωώỏọồốỗổộờớỡởợо,\r\n" + 
				"П,\r\n" + 
				"п,\r\n" + 
				"ŔŖŘΡР,\r\n" + 
				"ŕŗřρр,\r\n" + 
				"ŚŜŞȘŠΣС,\r\n" + 
				"śŝşșšſσςс,\r\n" + 
				"ȚŢŤŦτТ,\r\n" + 
				"țţťŧт,\r\n" + 
				"ÙÚÛŨŪŬŮŰŲƯǓǕǗǙǛŨỦỤỪỨỮỬỰУ,\r\n" + 
				"ùúûũūŭůűųưǔǖǘǚǜυύϋủụừứữửựу,\r\n" + 
				"ÝŸŶΥΎΫỲỸỶỴЙ,\r\n" + 
				"ýÿŷỳỹỷỵй,\r\n" + 
				"В,\r\n" + 
				"в,\r\n" + 
				"Ŵ,\r\n" + 
				"ŵ,\r\n" + 
				"ŹŻŽΖЗ,\r\n" + 
				"źżžζз,\r\n" + 
				"ÆǼ,\r\n" + 
				"ß,\r\n" + 
				"Ĳ,\r\n" + 
				"ĳ,\r\n" + 
				"Œ,\r\n" + 
				"ƒ,\r\n" + 
				"ξ,\r\n" + 
				"π,\r\n" + 
				"β,\r\n" + 
				"μ,\r\n" + 
				"ψ,\r\n" + 
				"Ё,\r\n" + 
				"ё,\r\n" + 
				"Є,\r\n" + 
				"є,\r\n" + 
				"Ї,\r\n" + 
				"Ж,\r\n" + 
				"ж,\r\n" + 
				"Х,\r\n" + 
				"х,\r\n" + 
				"Ц,\r\n" + 
				"ц,\r\n" + 
				"Ч,\r\n" + 
				"ч,\r\n" + 
				"Ш,\r\n" + 
				"ш,\r\n" + 
				"Щ,\r\n" + 
				"щ,\r\n" + 
				"ЪъЬь,\r\n" + 
				"Ю,\r\n" + 
				"ю,\r\n" + 
				"Я,\r\n" + 
				"я,\r\n" + 
				"";
		 String text = Normalizer.normalize(original, Form.NFD).replaceAll("\\p{InCombiningDiacriticalMarks}+", "");
		 
		 System.out.println(text);
		}
	}
