/*----------------------------------------------------------------------------------------------------------------------
	AnalyticalCircle sınıfı ve test kodu
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import org.csystem.util.math.geometry.AnalyticalCircle;

class App {
	public static void main(String[] args)
	{
		AnalyticalCircle ac = new AnalyticalCircle(345.6, 8.9);

		System.out.printf("(%f, %f)%n", ac.getX(), ac.getY());

		ac.setCenter(23.89, 56.89);

		System.out.printf("(%f, %f)%n", ac.getX(), ac.getY());
	}
}

