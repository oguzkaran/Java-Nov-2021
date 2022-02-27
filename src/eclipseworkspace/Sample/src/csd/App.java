/*----------------------------------------------------------------------------------------------------------------------	
	Aşağıdaki örnekte main içerisindeki yerel değişken olan b'nin değeri metot çağrısından sonra değişmez. Çünkü 
	argümanlardan parametrelere aktarım bir atama işlemidir
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args) 
	{				
		int b = 10;
		
		Sample.foo(b);
		
		System.out.printf("b = %d%n", b);
	}
}

class Sample {
	public static void foo(int a)
	{
		//...
		++a;
		//...
	}
}

