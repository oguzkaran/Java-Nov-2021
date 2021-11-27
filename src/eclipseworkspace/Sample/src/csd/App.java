/*----------------------------------------------------------------------------------------------------------------------
     Metot çağırmanın genel biçimi:
     [paket ismi].[sınıf ismi].<metot ismi>([argümanlar]);
     
     Anahtar Notlar: println de bir metottur. Fakat System bir paket ismi değildir, out da bir sınıf ismi değildir.
     Bu çağrının nasıl yapıldığı ileride ele alınacaktır.
     
     main metoduna "entry point" denir. main metodu java programı tarafından yani JVM tarafından çağrılır. main
     metodu bittiğinde program akış sonlanır 
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)
	{		
		System.out.println("Hello, World");
		csd.Sample.foo();	
		csd.Sample.bar();
		csd.Mample.tar();
		System.out.println("Goodbye, World");
	}
}

class Sample {
	public static void foo()
	{
		System.out.println("Sample -> foo");
	}
	
	public static void bar()
	{
		System.out.println("Sample -> bar");
		csd.Mample.tar();
	}
}


class Mample {
	public static void tar()
	{
		System.out.println("Mample -> tar");
	}
}
