/*----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Parametresi ile aldığı int türden bir count değeri için count tane rasgele üretilmiş Türkçe
	karakterlerden oluşan bir yazı döndüren getRandomTextTR ile count tane rasgele üretilmiş İnglizce karakterlerden oluşan 
	bir yazı döndüren getRandomTextEN metotlarını yazınız ve aşağıdaki kod ile test ediniz
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args) 
	{
		GetRandomTextTRENTest.run();
	}
}

class GetRandomTextTRENTest {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		for (;;) {
			System.out.print("Bir sayı giriniz:");
			int count = Integer.parseInt(kb.nextLine());
			
			if (count <= 0)				
				break;
			
			System.out.printf("Şifre:%s%n", StringUtil.getRandomTextTR(count));
			System.out.printf("PAssword:%s%n", StringUtil.getRandomTextEN(count));
			
		}
		
		System.out.println("Tekrar yapıyor musunuz?");
	}
}


class StringUtil {	
	public static String getRandomTextTR(int count)
	{
		
	}	
	
	public static String getRandomTextEN(int count)
	{
		
	}
}
