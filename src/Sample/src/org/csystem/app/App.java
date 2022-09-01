/*----------------------------------------------------------------------------------------------------------------------
	Aşağıdaki 3 ve 4 numaralı çağrılarda açılım belirtilmiş olsa da tam uyumlu metotlar seçilir. Bu işlem generic
	bir işin türe özgü olarak özelleştirilmesi durumlarında kullanılır
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

class App {
	public static void main(String[] args)
	{
		Sample.foo("ankara"); //1
		Sample.foo(2); //2
		Sample.<String>foo("ankara"); //3
		Sample.<Integer>foo(34); //4
		Sample.foo(3.4); //5
	}
}

class Sample {
	public static <T> void foo(T t)
	{
		System.out.println("foo(T)");
	}

	public static void foo(String s)
	{
		System.out.println("foo(String)");
	}

	public static void foo(int val)
	{
		System.out.println("foo(int)");
	}

	public static void foo(Integer val)
	{
		System.out.println("foo(Integer)");
	}
}
