/*----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Parametresi ile aldığı yazının Türkçe pangram olup olmadığını test eden isPangramTR ve İngilizce 
	pangram olup olmadığını test eden isPangramEN isimli metotları yazınız ve aşağıdaki kod ile test ediniz.
	Pangram: İçerisinde özel isim olmayab anlamlı ve ilgili dilin alfabesindeki tüm karakterleri içeren cümlelere denir.
	
	Örnekte özel isim ve anlamlı olma durumu dikkate alınmayacaktır
	
	İngilizce: The quick brown fox jumps over the lazy dog.
	Türkçe: Pijamalı hasta yağız şoföre çabucak güvendi.
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args) 
	{
		IsPangramTest.run();
	}
}

class IsPangramTest {
	public static void run()
	{
		IsPangramTRTest.run();
		System.out.println("--------------------------------");
		IsPangramENTest.run();
		
	}
}



class IsPangramENTest {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Input a text:");
		String s = kb.nextLine();
		
		System.out.println(StringUtil.isPangramTR(s) ? "Pangram" : "Not a Pangram");		
	}
}



class IsPangramTRTest {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Bir yazı giriniz:");
		String s = kb.nextLine();
		
		System.out.println(StringUtil.isPangramTR(s) ? "Pangram" : "Pangram değil");
		
	}
}

class StringUtil {
	public static boolean isPangramTR(String s)
	{
		
	}
	
	public static boolean isPangramEN(String s)
	{
		
	}
}