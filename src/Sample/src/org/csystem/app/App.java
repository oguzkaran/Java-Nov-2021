/*----------------------------------------------------------------------------------------------------------------------
	Türemiş sınıfı nesnesi içerisinde kadar alan da bulunur. Yani türemiş sınıf nesnesi içerisinde taban sınıfın
	non-static veri elemanları da vardır. Bu durumda nesnesel kapsama söz konusudur. Bu durumda türemiş
	sınıf nesnesinin uzunluğu "en az, taban sınıf nesnesinin bellekte kapladığı alan + türemiş sınıfa eklenen non-static
	veri elemanlarının toplam uzunluğu kadardır"
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

class App {
	public static void main(String[] args)
	{
		B x = new B();

		x.a = 10;
		x.b = 30;

		System.out.printf("x.a = %d%n", x.a);
		System.out.printf("x.b = %d%n", x.b);
	}
}


class B extends A {
	public int b;
	//...
}

class A {
	public int a;

	//...
}