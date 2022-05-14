/*----------------------------------------------------------------------------------------------------------------------
	final ve static veri elemanlarının bir kullanımı
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

class App {
	public static void main(String[] args)
	{
		System.out.println(Math.PI);
		System.out.println(ChemistryUtil.AVOGADRO_NUMBER);
	}
}

class ChemistryUtil {
	//...
	public static final double AVOGADRO_NUMBER = 6.02E23;
	//...
}

