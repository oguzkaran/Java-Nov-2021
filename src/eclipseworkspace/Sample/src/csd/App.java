/*----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Parametresi ile aldığı int türden bir n değeri için n-inci asal sayıyı döndüren getPrime isimli 
	metodu yazınız ve aşağıdaki kod ile test ediniz.
	Açıklamalar:	
		- isPrime metodunun hızlı olan versiyonunu kullanınız
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args) 
	{
		GetPrimeTest.run();			
	}
}

class GetPrimeTest {	
	public static void run()
	{		
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		for (;;) {
			System.out.print("Bir sayı giriniz:");
			int n = Integer.parseInt(kb.nextLine());
			
			if (n < 1) 
				break;
			
			System.out.printf("%d. asal sayı:%d%n", n, NumberUtil.getPrime(n));			
		}
		
		System.out.println("Tekrar yapıyor musunuz?");
	}
}

class NumberUtil {
	public static long getPrime(int n)
	{
		int count = 0;
		long val = 2;
		
		for (;;) {
			if (isPrime(val))
				++count;
			
			if (count == n)
				return val;
			
			++val;
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
