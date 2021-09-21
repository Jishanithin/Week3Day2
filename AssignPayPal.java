package week3day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class AssignPayPal {

	public static void main(String[] args) {
		String str = "PayPal India";
		String str1 = str.toLowerCase();

		char[] ch = str1.toCharArray();

		Set<Character> charSet = new LinkedHashSet<Character>();
		Set<Character> dupcharSet = new LinkedHashSet<Character>();

		for (int i = 0; i < ch.length; i++) {
			if (ch[i] != ' ')
				if (charSet.add(ch[i])) {
					continue;
				} else
					dupcharSet.add(ch[i]);

		}

		for (Character charSet1 : charSet) {
			System.out.println("CharSet : " + charSet1);

		}
		System.out.println(" ");
		for (Character dupSet1 : dupcharSet) {
			
			System.out.println("dupl set: " + dupSet1);
		}

	}
}
