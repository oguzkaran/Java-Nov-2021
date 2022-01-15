/*----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Paremtresi ile aldığı bir sayının Armstrong sayısı olup olmadığını test eden isArmstrong metodunu
	yazınız ve aşağıdaki kod ile test ediniz:
	Açıklamalar: 
		- Pozitif bir sayının her basamağının basamak sayıncı kuvvetleri toplandığında sonuç sayının kendisine eşitse
		bu sayıya Armstrong sayısı denir
			153 -> 1 * 1 * 1 + 5 * 5 * 5 + 3 * 3 * 3 = 153 				
		 - Kuvvet alma işlemi için yukarıda yazılmış pow metodunu kullanınız		 		 
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args) 
	{
		IsArmstrongTest.run();			
	}
}

class IsArmstrongTest {	
	public static void run()
	{
		for (int n = 0; n <= 9999999; ++n)
			if (NumberUtil.isArmstrong(n))
				System.out.println(n);
	}
}

class NumberUtil {
	public static boolean isArmstrong(int val)
	{
		//TODO:
	}
	
	public static int pow(int a, int b)
	{
		int result = 1;
		
		while (b-- > 0)
			result *= a;
		
		return result;
	}
}
