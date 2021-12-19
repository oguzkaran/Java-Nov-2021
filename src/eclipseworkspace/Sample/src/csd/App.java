/*----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Parametresi ile aldığı int türden 3(üç) basamaklı bir sayının basamakları toplamını döngü kullanmadan
	döndüren digitsSum metodunu yazınız ve aşağıdaki kod ile test ediniz
	Açıklamalar:	 
		- Metot basamak sayısı kontrolü yapmayacaktır
		- Metot negatif sayılar için basamakları toplamını pozitif olarak döndürecektir 
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)
	{	
		DigitsSumTest.run();
	}
}

class DigitsSumTest {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("Bir sayı giriniz:");
		int val = Integer.parseInt(kb.nextLine());
		
		System.out.printf("%d sayısının basamakları toplamı:%d%n", val, Util.digitsSum(val));
	}
}

class Util {
	public static int digitsSum(int val)
	{				
		return Math.abs(val / 100 + val / 10 % 10 + val % 10);
	}
}

