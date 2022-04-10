/*----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Parametresi ile aldığı int türden bir dizinin elemanlarını parametresi ile aldığı min ve maz değerleri
	içim [min, max] aralığında rasgele değerlerle dolsuran fillRandomArray isimli metodu ArrayUtil sınıfı içerisinde
	yazınız ve aşağıdaki kod ile test ediniz. Metodun Random referansı alan ve almayan iki oveload'unu da yazınız
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import java.util.Random;
import java.util.Scanner;

import static org.csystem.util.array.ArrayUtil.*;

class App {
	public static void main(String [] args)
	{
		FillRandomArrayTest.run();
	}	
}

class FillRandomArrayTest {
	public static void run()
	{
		Scanner kb = new Scanner(System.in);
		System.out.print("Min değerini giriniz:");
		int min = Integer.parseInt(kb.nextLine());

		System.out.print("Max değerini giriniz:");
		int max = Integer.parseInt(kb.nextLine());

		Random r = new Random();

		for (;;) {
			System.out.print("Dizinin eleman sayısını giriniz:");
			int n = Integer.parseInt(kb.nextLine());

			if (n <= 0)
				break;

			int [] a = new int[n];

			fillRandomArray(r, a, min, max);

			print(a);
			System.out.printf("Toplam:%d%n", sum(a));
		}

		System.out.println("Tekrar yapıyor musunuz?");
	}
}

