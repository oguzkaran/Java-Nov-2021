/*----------------------------------------------------------------------------------------------------------------------
	Programcı isterse çöp toplayıcının devreye girmesini sağlayabilir. Bunun System sınıfının gc isimli static metodu
	veya Runtime sınıfının gec metodu çağrılabilir. Ancak bu çoğunlukla hatta neredeyse hiç bir zaman yapılmaması
	gereken bir yaklaşımdır. Programcı çöp toplayıcının devreye girmesi konusunda etkin çalışmasına güvenmelidir. Çünkü
	çöp toplayıcının gereksi yere arka planda çalıştırılması da programın performansını olumsuz etkileyebilir. Programcı
	böyle bir şeye ihtiyaç duyarsa çok çok büyük olasılıkla algoritmik bir hatası bulunur. Programcı buna yönelik
	tasarımını (algoritmasını) ve kodlarını gözden geçirmelidir
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

class App {
	public static void main(String [] args)
	{
		Sample s;

		s = new Sample(); //rc1: 1

		{
			Sample k;

			k = s; //rc1: 2

			Mample.foo(k); //rc1: 3 -> rc1: 4
			//rc1: 3 -> rc1: 2
		} //rc1: 1
		s = new Sample(); //rc1: 0 (garbage collected), rc2: 1
		System.gc(); //Runtime.getRuntime().gc();
		//...
	}
}

class Mample {
	public static void foo(Sample s)
	{
		Sample k;

		//...
		k = s;

		//...
	}
}

class Sample {
	//...
}

