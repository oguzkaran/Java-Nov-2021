/*----------------------------------------------------------------------------------------------------------------------
	Sabitler (literals):
	Program koduna doğrudan yazdığımı sayılara denir. Sabitlerin de türü vardır. Derleyici sabitin türüne göre derleme 
	işlemini yapar.
	
	Sabitlerin türlerine ilişkin ayrıntılar:
	- Sayı nokta içermiyorsa ve sonuna herhangi bir ek almamışsa ve int türü sınırları içerisindeyse int türdendir. 
	Sınırlar dışında ise error oluşur
	Örnek: 10, 100, 1000
	
	- Sayı nokta içermiyorsa ve sonuna L (küçük veya büyük) ekini almışsa long türdendir. Sayı long sınırları dışında 
	ise error oluşur
	Örneğin: 10L, 3000000000L, 201L	
	
	Anahtar Notlar: Küçük harf L son ekinin 1(bir) sayısı ile benzerliğinden dolayı kullanılması tavsiye edilmez  
	
	- Java'da byte ve short türden sabit yoktur
	
	- Sayı nokta içeriyorsa ve herhangi bir son ek almamışsa double türdendir
	Örneğin: 3.4, 3., 0.5, .6
	
	- Sayı nokta içersin ya da içermesin sonuna D (küçük veya büyük) ekini almışsa double türdendir
	 Örneğin: 3.4D, 4d
	 
	 - Sayı nokta içersin ya da içermesin sonuna F (küçük veya büyük) ekini almışsa float türdendir
	 Örneğin: 3.4f, 4F
	 
	 - boolean türden iki tane sabit vardır: true, false
	 
	 - 
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)
	{	
		float a;
		
		a = 3.4F;
		
		System.out.printf("a = %.20f%n", a);
		
		
	}
}


