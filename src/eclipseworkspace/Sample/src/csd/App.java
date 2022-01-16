/*----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: 
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
		System.out.println(NumberUtil.isPrime(1_000_003));				
		System.out.println(NumberUtil.isPrimeSlow(1_000_003));
	}
}

class NumberUtil {
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
		
		int count = 0;
		
		for (long i = 11; i * i <= val; i += 2) {
			++count;
			if (val % i == 0)
				return false;
		}
		
		System.out.printf("isPrime:count:%d%n", count);
		
		return true;							
	}
	
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

