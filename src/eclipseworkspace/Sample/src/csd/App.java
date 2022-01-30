/*----------------------------------------------------------------------------------------------------------------------
	Gerçek sayı türünden tamsayı türüne yapılan explicit dönüşüm şu aşamalarla gerçekleşir:
	- Sayının noktadan sonraki kısmı atılır
		- Elde edilen değer hedef türün sınırları içerisinde kalıyorsa doğrudan hedef türe atanır
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args) 
	{	
		double a;
		short b;
		
		a = 5_000_000_000.56;
		b = (short)a;
		
		System.out.printf("5000000000 = %d%n", (short)5_000_000_000L);
		System.out.printf("2147483648 = %d%n", (short)2147483647);
		System.out.printf("b = %d%n", b);				
	}
}


