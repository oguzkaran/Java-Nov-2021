/*----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Parametresi ile aldığı bir yazının tersini döndüren reversed isimli metodu StringUtil sınıfı 
	içerisinde yazınız ve aşağıdaki kod ile test ediniz. 
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args) 
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.printf("Kişi sayısını giriniz:");
		int count = Integer.parseInt(kb.nextLine());		
		
		System.out.println("Toplam " + count + " kişi aşı oldu");
	}
}

class ReverseTest {
	public static void run()
	{		
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		for (;;) {
			System.out.print("Bir yazı giriniz:");
			String s = kb.nextLine();			
			
			if ("elma".equals(s))
				break;
			
			System.out.printf("Yazının tersi:%s%n", StringUtil.reversed(s));
		}
		
		System.out.println("Tekrar yapıyor musunuz?");		
	}
}

class StringUtil {
	public static String reversed(String s)
	{
		//TODO: 
	}
}