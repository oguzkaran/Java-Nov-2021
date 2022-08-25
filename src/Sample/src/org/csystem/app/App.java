/*----------------------------------------------------------------------------------------------------------------------
	Soyut bir tür ne zaman interface, ne zaman abstract sınıf yapılmalıdır? Programcı buna nasıl karar verecektir?
	Önce interface düşünülmeli, interface özellikleri yazacağınız türü karşılamıyorsa (abstract) sınıf yazılmalıdır

	interface yapılabildiği yerde abstract sınıf yerine interface yapılması, bu interface'i destekleyen bir sınıfın
	başka bir sınıftan da türetilmesi olanağını sağlar. Aynı zamanda okunabilirlik/algılanabilirlik de artırılmış olur
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

class App {
	public static void main(String[] args)
	{
		Mample m = new Mample();
		A a = new A();
		B b = new B();

		m.doWorkForIX(a);
		m.doWorkForIX(b);
	}
}

class Mample {
	public void doWorkForIX(IX ix)
	{
		//...
		ix.foo();
		ix.bar();
	}
}

class B implements IX {
	public void foo()
	{
		System.out.println("B.foo");
	}
}


class A implements IX {
	public void foo()
	{
		System.out.println("A.foo");
	}
}

interface IX {
	default void foo()
	{
		throw new UnsupportedOperationException();
	}

	default void bar()
	{
		throw new UnsupportedOperationException();
	}

	default void tar()
	{
		//...
	}
}