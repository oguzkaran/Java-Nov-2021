/*----------------------------------------------------------------------------------------------------------------------
    CSDArrayList sınıfı
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import org.csystem.util.collection.CSDArrayList;

class App {
	public static void main(String[] args)
	{
		CSDArrayList numbers = new CSDArrayList();

		for (int i = 0; i < 12; ++i)
			numbers.add(i * 10);

		int size = numbers.size();

		for (int i = 0; i < size; ++i)
			System.out.printf("%d ", (int)numbers.get(i));
		System.out.println();

		int oldValue = (int)numbers.set(2, 67);

		for (int i = 0; i < size; ++i)
			System.out.printf("%d ", (int)numbers.get(i));
		System.out.println();

		System.out.printf("Old value:%d%n", oldValue);
	}
}
