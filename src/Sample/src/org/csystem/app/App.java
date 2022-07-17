/*----------------------------------------------------------------------------------------------------------------------
    Bir sınıfın ctor'u içerisinde o sınıfın başka ctor'unun çağrılması kodu yazılmışsa (this ctor) bu durumda çağıran için
    non-static initializer kodu yerleştirilmez. Çünkü zaten çağrılan ctor'da ya olacaktır y da da o da başka bir ctor'u
    çağırsa da sonuçta çalıştırılacak non-static blok olacaktır. Yani bir non-static blok nesne başına bir kez çalıştırılır
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

class App {
	public static void main(String[] args)
	{
		Sample s1 = new Sample();
		System.out.println("---------------------------------------");
		Sample s2 = new Sample(10);
		System.out.println("---------------------------------------");
		Sample s3 = new Sample(4.5);
	}
}

class Sample {
	{
		System.out.println("non-static initializer");
	}

	public Sample()
	{
		this(Math.E);
		System.out.println("I am a default ctor");
	}

	public Sample(int a)
	{
		this();
		System.out.println("I am a ctor with parameter type: int");
	}

	public Sample(double a)
	{
		System.out.println("I am a ctor with parameter type: double");
	}

	//...
}
