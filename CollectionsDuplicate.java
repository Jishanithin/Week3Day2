package week3day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class CollectionsDuplicate {

	public static void main(String[] args) {

		String text = "We learn java basics as part of java sessions in java week1";
		Set<String> charset = new LinkedHashSet<String>();
		String[] newText = text.split(" ");
		for (String output : newText) {
			charset.add(output);

		}

		System.out.println(charset);

		String abc = "";
		for (String lastop : charset) {

			abc = abc + " " + lastop;

		}

		System.out.println(abc);
	}
}
