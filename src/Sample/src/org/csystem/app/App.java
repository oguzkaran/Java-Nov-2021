/*----------------------------------------------------------------------------------------------------------------------
	super ctor sentaksı adından da anlaşaılacağı gibi yalnızca ctor içerisinde kullanılabilir
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

class App {
	public static void main(String[] args)
	{
		A x = new A(10);
	}
}


class A {
	public A()
	{
		System.out.println("A.A()");
	}

	public A(int a)
	{
		System.out.println("A.A(int)");
	}
	//...
}