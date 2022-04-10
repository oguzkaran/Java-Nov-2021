/*----------------------------------------------------------------------------------------------------------------------
	[] operatörüne pozitif ya da negatif bakımdan sınırlar dışında bir indeks numarası verildiğinde exception oluşur
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import java.util.Random;
import java.util.Scanner;

class App {
	public static void main(String [] args)
	{
		Random r = new Random();
		Scanner kb = new Scanner(System.in);
		System.out.print("Bir sayı giriniz:");
		int n = Integer.parseInt(kb.nextLine());
		int [] a;

		a = new int[n];

		for (int i = 0; i < a.length; ++i)
			a[i] = r.nextInt(100);

		System.out.printf("a[5] = %d%n", a[5]);
	}	
}

