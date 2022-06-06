/*----------------------------------------------------------------------------------------------------------------------
	Aşağıdaki örnekte z'nin ve t'nin dinamik türü C olur
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

class App {
	public static void main(String[] args)
	{
		C x = new C();
		B y;
		A z;
		A t;

		y = x;

		System.out.println(y.getClass().getName());

		z = y;

		System.out.println(z.getClass().getName());

		t = z;

		System.out.println(t.getClass().getName());
	}
}

class C extends B {
	//...
}

class B extends A {
	//...
}

class A {
	//...
}

