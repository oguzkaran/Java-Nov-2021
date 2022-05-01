/*----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Parametresi ile aldığı int türden bir matrisin elemanları toplamını döndüren sum metodunu ArrayUtil
	içerisinde yazınız ve test ediniz
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import org.csystem.util.array.ArrayUtil;

import java.util.Random;
import java.util.Scanner;

class App {
	public static void main(String[] args)
	{
		SumDiagonalTest.run();
	}
}

class SumDiagonalTest {
	public static void run()
	{
		Scanner kb = new Scanner(System.in);
		Random r = new Random();

		for (;;) {
			System.out.print("Bir sayı giriniz:");
			int n = Integer.parseInt(kb.nextLine());

			if (n <= 0)
				break;

			System.out.println("------------------------------------");
			int [][] a = ArrayUtil.getRandomSquareMatrix(r, n, 0, 99);

			ArrayUtil.print(2, a);
			System.out.printf("Esas köşegen toplamı:%d%n", ArrayUtil.sumDiagonal(a));
			System.out.println("------------------------------------");
		}

		System.out.println("Tekrar yapıyor musunuz?");
	}
}
