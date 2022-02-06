/*----------------------------------------------------------------------------------------------------------------------
	Homework-002-5. sorunun bir çözümü
	(Not: Çözüm çalışma sorusunun verildiği tarihte işlenmiş olan konulara göre yazılmıştır)
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args) 
	{
		PrintGolbachPrimesApp.run();											
	}
}

class PrintGolbachPrimesApp {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		for (;;) {
			System.out.print("2'den büyük bir çift sayı giriniz:?");
			int val = Integer.parseInt(kb.nextLine());
			
			if (val == 0)
				break;			
			
			if (val <= 2 || val % 2 != 0) {
				System.out.println("2'den büyük çift sayı girmelisiniz!...");
				continue;
			}			
			
			NumberUtil.printGoldBachPrimes(val);						
		}
		
		System.out.println("Tekrar yapıyor musunuz?");
	}
}

class NumberUtil {
	public static void printGoldBachPrimes(int val)
	{
		for (int a = 2; a < val; ++a) {
			int b = val - a;
			
			if (isPrime(a) && isPrime(b) && a <= b)
				System.out.printf("%d + %d = %d == %d%n", a, b, a + b, val);
		}		
	}
	
	public static boolean isPrime(long val)
	{
		if (val <= 1)
			return false;
		
		if (val % 2 == 0)
			return val == 2;
		
		if (val % 3 == 0)
			return val == 3;
		
		if (val % 5 == 0)
			return val == 5;
		
		if (val % 7 == 0)
			return val == 7;	
		
		for (long i = 11; i * i <= val; i += 2)		
			if (val % i == 0)
				return false;		
		
		return true;							
	}	
}