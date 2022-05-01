/*----------------------------------------------------------------------------------------------------------------------
	Java 5 ile birlikte aşağıdaki gibi ikinci köşeli parantez içerisinde yazılan uzunluk, matrisin (mantıksal) sütun
	sayısı anlamına gelir. Yani dizi dizisinin herbir elemanının gösterdiği diziler de o uzunlukta otomatik olarak
	yaratılırlar
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import org.csystem.util.array.ArrayUtil;

import java.util.Random;
import java.util.Scanner;

class App {
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
		Random r = new Random();

		System.out.print("Satır sayısını giriniz:");
		int m = Integer.parseInt(kb.nextLine());

		System.out.print("Sütun sayısını giriniz:");
		int n = Integer.parseInt(kb.nextLine());

		int [][] a;

		a = ArrayUtil.getRandomMatrix(r, m, n, 0, 99);

		for (int i = 0; i < a.length; ++i) {
			for (int j = 0; j < a[i].length; ++j)
				System.out.printf("%02d ", a[i][j]);

			System.out.println();
		}
	}
}

