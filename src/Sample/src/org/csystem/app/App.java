/*----------------------------------------------------------------------------------------------------------------------
	Date sınıfı ve test kodu
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import org.csystem.util.datetime.Date;
import org.csystem.util.datetime.Month;

class App {
	public static void main(String[] args)
	{
		Date birthDate = new Date(10, Month.SEP, 1976);

		System.out.println(birthDate.toLongDateStringEN());
		System.out.println(birthDate.getDayOfWeek().toString());

		birthDate.setMonth(Month.MAY);

		System.out.println(birthDate.toLongDateStringEN());
		System.out.println(birthDate.getDayOfWeek().toString());
	}
}
