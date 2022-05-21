/*----------------------------------------------------------------------------------------------------------------------
	Time sınıfı ve test kodu
	Not: Aşağıdaki kod etkin bir biçimde yazılmamıştır. Etkin yazılması için başka bilgilere de ihtiyaç vardır
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import org.csystem.util.datetime.Time;

class App {
	public static void main(String[] args)
	{
		for (;;) {
			Time now = new Time();

			System.out.printf("%s\r", now.toString());
		}
	}
}

