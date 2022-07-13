/*----------------------------------------------------------------------------------------------------------------------
	Aşağıdaki örnekte static veri elemanı olan x değişkenine sınıf ismi ile erişilerek atama yapılmıştır. setX metodunun
	parametre ismi de x olduğundan sınıf ismi ile veri elemanına erişilmesi gerekir
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

class App {
	public static void main(String [] args)
	{
		Sample.setX(20);

		System.out.printf("Sample.x = %d%n", Sample.x);
	}
}

class Sample {
	public static int x;

	public static void setX(int x)
	{
		Sample.x = x;
	}
}