/*----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Parametresi ile aldığı bir yazının sadece başındaki boşluk karakterlerini atan trimLeading ve 
	sadece sonundaki boşluk karakterlerini atan trimTrailing isimli metotları yazınız ve aşağıdaki kod ile test ediniz.	
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args) 
	{	
		TrimLeadingTrailingTest.run();						
	}
}

class TrimLeadingTrailingTest {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		for (;;) {
			System.out.print("Bir yazı giriniz:");
			String s = kb.nextLine();
			
			if ("elma".equals(s))
				break;
			
			System.out.printf("(%s)%n", StringUtil.trimleading(s));
			System.out.printf("(%s)%n", StringUtil.trimTrailing(s));
		}
		
		System.out.println("Tekrar yapıyor musunuz?");
	}
}


class StringUtil {
	public static String trimLeading(String s)
	{
		//TODO:
	}
	
	public static String trimTrailing(String s)
	{
		//TODO:
	}
}

