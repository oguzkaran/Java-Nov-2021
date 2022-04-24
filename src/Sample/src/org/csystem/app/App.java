/*----------------------------------------------------------------------------------------------------------------------
	doc/images dizininde bulunan firstNotRepeatingCharacter.jpeg dosyasında sorulan sorunun bir çözümü
	Not: İleride daha iyisi yazılacaktır
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import org.csystem.util.string.StringUtil;

import java.util.Random;
import java.util.Scanner;

class App {
	public static void main(String [] args)
	{
		FirstNonRepeatingCharacterTest.run();
	}	
}

class FirstNonRepeatingCharacterTest {
	public static void run()
	{
		FirstNonRepeatingCharacterRandomTest.run();
		FirstNonRepeatingCharacterStdInTest.run();

		System.out.println("Tekrar yapıyor musunuz?");
	}
}


class FirstNonRepeatingCharacterRandomTest {
	public static void run()
	{
		Random r = new Random();
		Scanner kb = new Scanner(System.in);

		System.out.print("Dizinin eleman sayısını giriniz:");
		int n = Integer.parseInt(kb.nextLine());

		while (n-- > 0) {
			System.out.println("-----------------------------------------");
			String str = StringUtil.getRandomTextEN(r, r.nextInt(5, 11)).toLowerCase();
			System.out.println(str);
			char ch = Util.firstNonRepeatingCharacter(str);

			System.out.printf("%s%n", ch == '_' ? "Hiç tekrarlanmayan karakter yok" : "İlk tekrarlanmayan karakter:" + ch);

			System.out.println("-----------------------------------------");
		}
	}
}


class FirstNonRepeatingCharacterStdInTest {
	public static void run()
	{
		Random r = new Random();
		Scanner kb = new Scanner(System.in);

		for (int i = 0; i < 5; ++i) {
			System.out.print("Bir yazı giriniz:");
			String str = kb.nextLine();

			System.out.println("-----------------------------------------");
			char ch = Util.firstNonRepeatingCharacter(str);

			System.out.printf("%s%n", ch == '_' ? "Hiç tekrarlanmayan karakter yok" : "İlk tekrarlanmayan karakter:" + ch);
			System.out.println("-----------------------------------------");
		}
	}
}

class Util {
	public static char firstNonRepeatingCharacter(String s)
	{
		int [] counts = new int[26];
		int length = s.length();

		for (int i = 0; i < length; ++i)
			++counts[s.charAt(i) - 'a'];

		for (int i = 0; i < length; ++i) {
			char ch = s.charAt(i);

			if (counts[ch - 'a'] == 1)
				return ch;
		}

		return '_';
	}
}
