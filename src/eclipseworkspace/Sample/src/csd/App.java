/*----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Parametresi ile aldığı bir yazının ilk harfi büyük geri kalan tüm harfleri küçük olacak ve 
	harf dışı karakterler de aynı kalacak şekilde bir yazı döndüren. capitalize isimli metodu StringUtil sınıfı 
	içerisinde yazınız ve aşağıdaki kod ile test ediniz.
	
	Örnek: java Programcısı ÇOK çalışmalıdır. -> Java programcısı çok çalışmalıdır.
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args) 
	{	
		CapitalizeTest.run();						
	}
}

class CapitalizeTest {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		for (;;) {
			System.out.print("Bir yazı giriniz:");
			String s = kb.nextLine();
			
			if ("elma".equals(s))
				break;
			
			System.out.printf("(%s)%n", StringUtil.capitalize(s));
		}
		
		System.out.println("Tekrar yapıyor musunuz?");
	}
}


class StringUtil {
	public static String capitalize(String s)
	{
		//TODO:
	}
}

