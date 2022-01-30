/*----------------------------------------------------------------------------------------------------------------------
	Küçük tamsayı türü ile büyük tamsayı türü işleme sokulduğunda dönüşüm büyük tamsayı türüne doğrudur. Sonuç büyük
	tamsayı türünden çıkar. "Integral promotion" bu kuralın dışındadır
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args) 
	{
		short a = 10;
		long b = 34;
		long c;
		
		c = a + b;
		
		System.out.printf("c = %d%n", c);
	}
}


