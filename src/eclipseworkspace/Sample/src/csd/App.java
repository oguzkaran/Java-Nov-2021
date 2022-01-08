/*----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Parametresi ile aldığı int türden bir sayının basamak sayısını döndüren digitsCount isimli
	metodu yazınız ve aşağıdaki kod ile test ediniz 	
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args) 
	{
		DigitsCountTest.run();			
	}
}

class DigitsCountTest {
	
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.println("Sayıları girmeye başlayınız:");
		
		while (true) {
			System.out.print("Bir sayı giriniz:");
			int val = Integer.parseInt(kb.nextLine());
			
			System.out.printf("%d sayısının basamak sayısı:%d%n", val, NumberUtil.digitsCount(val));
			
			if (val == 0)
				return;
		}
	}
}

class NumberUtil {
	public static int digitsCount(int val)
	{
		//TODO:
	}
}