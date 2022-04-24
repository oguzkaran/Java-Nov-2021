/*----------------------------------------------------------------------------------------------------------------------

----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

class App {
	public static void main(String [] args)
	{
		Sample [] samples = new Sample[10];

		for (int i = 0; i < samples.length; ++i)
			samples[i] = new Sample(i * 10);

		for (int i = 0; i < samples.length; ++i)
			System.out.printf("%d ", samples[i].x);

		System.out.println();
	}
}

class Sample {
	public int x;

	public Sample(int a)
	{
		x = a;
	}
	//...
}