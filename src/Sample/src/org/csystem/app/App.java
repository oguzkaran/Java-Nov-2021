/*----------------------------------------------------------------------------------------------------------------------
	CSDArrayList sınıfının toString metodu aşağıdaki gibi yazılabilir. String birleştirmesi maliyeti gözardı edilmiştir
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import org.csystem.util.collection.CSDArrayList;
import org.csystem.util.math.MutableFraction;

class App {
	public static void main(String[] args)
	{
		CSDArrayList values = new CSDArrayList();
		CSDArrayList fractions = new CSDArrayList();

		for (int i = 0; i < 10; ++i)
			values.add(i * 10);

		for (int i = 0; i < 10; ++i)
			fractions.add(new MutableFraction(i, 4));

		System.out.println(values);
		System.out.println(fractions);
	}
}