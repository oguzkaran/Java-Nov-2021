/*----------------------------------------------------------------------------------------------------------------------
	Bileşik deyim
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)
	{	
		int a = 10, b = 20;;;;;;;;;;;;	//Bildirim deyimi	
		
		{ //Bileşik deyim
			++a; //basit deyim
			b--; //basit deyim
			Sample.foo(); //basit deyim
			
			{
				System.out.printf("a = %d%n", a);
				System.out.printf("b = %d%n", b);
			}
			//...
		}
		;;;;;;;;;;;;;;;
		
		; //boş deyim
		
		;
		
		;
	}
}

class Sample {
	public static void foo()
	{
		System.out.println("foo");		
	}
}