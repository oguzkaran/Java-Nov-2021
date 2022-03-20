/*----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Parametresi ile aldığı bir yazının sadece başındaki boşluk karakterlerini atan trimLeading ve 
	sadece sonundaki boşluk karakterlerini atan trimTrailing isimli metotlarını yazınız ve aşağıdaki kod ile test ediniz.	
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
			
			System.out.printf("(%s)%n", StringUtil.trimLeading(s));
			System.out.printf("(%s)%n", StringUtil.trimTrailing(s));
		}
		
		System.out.println("Tekrar yapıyor musunuz?");
	}
}


class StringUtil {
	public static String trimLeading(String s)
	{
		int i;
		int len = s.length();		
	
		for (i = 0; Character.isWhitespace(s.charAt(i)) && i < len; ++i)
			;
		
		return s.substring(i);		
	}
	
	public static String trimTrailing(String s)
	{
		int i;	
		
		for (i = s.length() - 1; i >= 0 && Character.isWhitespace(s.charAt(i)); --i)
			;
		
		return s.substring(0, i + 1);
	}
}

