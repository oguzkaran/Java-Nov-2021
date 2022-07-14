/*----------------------------------------------------------------------------------------------------------------------
	Aşağıdaki örnekte c referansına null atanması derleyicinin "değer verilmeme ihrtimali olan bir değişkeni kullanıyorsun"
	şeklindeki hata durumunu engellemek için kullanılmıştır. Şüphesiz program farklı şekillerde de yazılabilir. Durumu
	göstermek için bu şekilde yazılmıştır
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import org.csystem.util.math.geometry.Circle;

import java.util.Scanner;

class App {
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);

		for (;;) {
			System.out.print("Bir sayı giriniz:");
			int a = Integer.parseInt(kb.nextLine());

			if (a < 0 || a > 3) {
				System.out.println("Geçersiz değer girdiniz!...");
				continue;
			}

			Circle c = null;

			switch (a) {
				case 0 -> c = new Circle(0);
				case 1 -> c = new Circle(-1);
				case 2 -> c = new Circle(-128);
				case 3 -> c = new Circle(127);
			}

			System.out.printf("r = %f, area = %f, circumference = %f%n", c.getRadius(), c.getArea(), c.getCircumference());
		}
	}
}

