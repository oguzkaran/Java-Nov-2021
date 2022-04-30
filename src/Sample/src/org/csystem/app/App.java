/*----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Klavyeden alınan int türden bir n sayısı için n elemanları bir String dizisi yaratınız. Bu dizinin
	her bir elemanını [5, 15] arasında belirlenmiş sayı kadar Türkçe karakterlerden oluşan yazılarla doldurunuz. Bu işlemdem
	sonra StringUtil StringUtil sınıfı içerisinde yazacağınız parametresi ile aldığı bir String dizisinin elemanlarını,
	yine diğer parametresi ile aldığı bir ayraç ile birleştirilmiş bir String'e geri dönen join isimli metodu çağırarak
	sonucu ekranda gösteriniz
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import java.util.Scanner;

import static org.csystem.util.numeric.NumberUtil.numberToText3DigitsTR;

class App {
	public static void main(String[] args)
	{
		NumberToText3DigitsTRTest.run();
	}
}

class NumberToText3DigitsTRTest {
	public static void run()
	{
		Scanner kb = new Scanner(System.in);

		for (;;) {
			System.out.print("Bir sayı giriniz:");
			int a = Integer.parseInt(kb.nextLine());

			System.out.printf("%d:%s%n", a, numberToText3DigitsTR(a));

			if (a == 0)
				break;
		}

		System.out.println("Tekrar yapıyor musunuz?");
	}
}


