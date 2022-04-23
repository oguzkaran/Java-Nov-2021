/*----------------------------------------------------------------------------------------------------------------------
	Kabarcık sıralama algoritmasında dizinin yan yana iki elemanı karşılaştırılır, duruma göre yer değiştirilir. Her
	yinelemede en büyük daraltılmış dizinin sonuna gider. Böylece her yinelemede eskisinden bir geriye gitmek yeterli olur
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import static org.csystem.util.array.ArrayUtil.*;

import java.util.Random;
import java.util.Scanner;

class App {
	public static void main(String [] args)
	{
		BubbleSortTest.run();
	}	
}

class BubbleSortTest {
	public static void run()
	{
		Random r = new Random();
		Scanner kb = new Scanner(System.in);

		for (;;) {
			System.out.print("Dizinin eleman sayısını giriniz:");
			int n = Integer.parseInt(kb.nextLine());

			if (n <= 0)
				break;

			int [] a =getRandomArray(r, n, 0, 99);

			print(2, a);

			boolean desc = r.nextBoolean();

			bubbleSort(a, desc);

			System.out.printf("%s sıralanmış dizi:%n", desc ? "Büyük küçüğe" : "Küçükten büyüğe");
			print(2, a);
		}
		System.out.println("Tekrar yapıyor musunuz?");
	}
}



