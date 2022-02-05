/*----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Parametresi ile aldığı int türden iki sayının "en büyük ortak bölenini" döndüren gcd isimli
	metodu NumberUtil sınıfı içerisinde yazınız be aşağıdaki kod ile test ediniz.
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args) 
	{
		GcdTest.run();									
	}
}

class GcdTest {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		for (;;) {
			System.out.print("Birinci sayıyı giriniz:");
			int a = Integer.parseInt(kb.nextLine());
			
			System.out.print("İkinci sayıyı giriniz:");
			int b = Integer.parseInt(kb.nextLine());
			
			int result = NumberUtil.gcd(a, b);
			
			System.out.printf("ebob(%d, %d) = %d%n", a, b, result);
			
			if (result == 1)
				break;
		}
	}
}


class NumberUtil {
	public static int gcd(int a, int b)
	{
		//TODO:
	}
}

