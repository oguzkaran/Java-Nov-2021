/*----------------------------------------------------------------------------------------------------------------------
	Yukarıda yazılan isPrime metotlarının basit bir karşılaştırması
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args) 
	{
		IsPrimeTest.run();			
	}
}

class IsPrimeTest {	
	public static void run()
	{		
		System.out.println(NumberUtil.isPrimeSlow(710584055392819667L));		
	}
}

class NumberUtil {
	public static boolean isPrimeSlow(long val)
	{
		if (val <= 1)
			return false;
		
		long halfVal = val / 2;
		
		int count = 0;
		
		for (long i = 2; i <= halfVal; ++i) {
			++count;
			if (val % i == 0)
				return false;
		}
		
		System.out.printf("isPrimeSlow:count:%d%n", count);
		return true;
	}
	
	
}
