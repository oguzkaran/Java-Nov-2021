/*----------------------------------------------------------------------------------------------------------------------	
	non-static veri elamanlarına nesnesin yaratılması aşamasında default değerler verilir. Default değer türe özgü
	mantıksal sıfır değeridir. Örneğin int türü için sıfırken, boolean türü için false değerindedir. Default değerler
	sınıfın veri elemanları final bildirilmişse verilmez. Bu konu ileride ele alınacaktır
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args) 
	{
		Sample s, k;
		
		s = new Sample();	
		k = new Sample();
		
		System.out.printf("s.x = %d%n", s.x);
		System.out.printf("s.y = %b%n", s.y);
		
		System.out.printf("k.x = %d%n", k.x);
		System.out.printf("k.y = %b%n", k.y);
	}
}

class Sample {
	public int x;
	public boolean y;
	//...
}
