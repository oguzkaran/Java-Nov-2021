/*----------------------------------------------------------------------------------------------------------------------
	Aşağıdaki örnekte porseDouble metodunun fırlattığı exception nesnesi de yakalanabildiğinden akış sonlanmaz
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import java.util.Scanner;

class App {
	public static void main(String[] args)
	{
		try {
			Scanner kb = new Scanner(System.in);
			System.out.print("Bir sayı giriniz:");
			double a = Double.parseDouble(kb.nextLine());
			double result = MathUtil.log10(a);

			System.out.printf("Result:%f%n", result);
		}
		catch (UndefinedException ex) {
			System.out.println("Undefined");
		}
		catch (IndeterminateException ex) {
			System.out.println("Indeterminate");
		}
		catch (NumberFormatException ex) {
			System.out.println("Geçersiz noktalı sayı girdiniz!...");
		}

		System.out.println("Tekrar yapıyor musnuz?");
	}
}

class MathUtil {
	public static double log10(double a)
	{
		if (a == 0)
			throw new UndefinedException();

		if (a < 0)
			throw new IndeterminateException();

		return Math.log10(a);
	}
}

class UndefinedException extends RuntimeException {
	//...
}


class IndeterminateException extends RuntimeException {
	//...
}
