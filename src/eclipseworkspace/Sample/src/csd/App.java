/*----------------------------------------------------------------------------------------------------------------------
	ctor aşağıdaki özelliklere sahip bir metottur:
	- Sınıfı yazan programcı sınıfa hiçbir ctor yazmazsa parametresiz ctor'u (default ctor) derleyici tarafından içi boş
	ve public olarak yazılır
	
	- Sınıfı yazan programcı en az bir tane ctor yazarsa default ctor derleyici tarafından yazılmaz. Artık default ctor
	yazılıp yazılmayacağı sınıfı yazan programcıya bırakılmış olur
	
	- ctor sınıf ismi ile aynı olan ve geri dönüş değeri kavramı olmayan bir metottur. Geri dönüş değeri bilgisi yazılmaz.
	void da yazılmaz. Sınıf ismi ile aynı isimde bir metot yazılıp geri dönüş değeri bilgisi de yazılırsa artık bu metot
	ctor olmaz. Şüphesiz böyle bir metot yazılmamalıdır  
	 
	- ctor overload edilebilir (constructor overloading)
	
	- ctor non-static bir metottur
	
	- 
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args) 
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("Minimum değer giriniz:");
		int min = Integer.parseInt(kb.nextLine());
		
		System.out.print("Maksimum değer giriniz:");
		int max = Integer.parseInt(kb.nextLine());
		
		System.out.print("Kaç tane sayı üretmek istersiniz?");
		int count = Integer.parseInt(kb.nextLine());
		
		for (int i = 0; i < count; ++i)
			System.out.printf("%d ", (int)(Math.random() * (max - min) + min)); //[min, max)
		
		System.out.println();
	}
}

class Sample {
	public Sample()
	{
		
	}
	
	public Sample(int a)
	{
		
	}
}


