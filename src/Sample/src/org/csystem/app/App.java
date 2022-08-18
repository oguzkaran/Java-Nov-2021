/*----------------------------------------------------------------------------------------------------------------------
	Bir sınıf başka bir sınıftan türetilip istediği kadar arayüzü destekleyebilir. Bu durumda extends'in başta yazılması
	zorunludur
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

class App {
	public static void main(String[] args)
	{

	}
}

class B extends A implements IX, IY, IZ {
	//...
}

class A {
	//...
}

interface IX {
	//...
}

interface IY {
	//...
}

interface IZ {
	//...
}