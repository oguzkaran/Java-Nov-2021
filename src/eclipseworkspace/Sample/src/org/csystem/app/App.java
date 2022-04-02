/*----------------------------------------------------------------------------------------------------------------------
	import bildirimi genel olarak niteliklendirmeyi azaltmak için, dolayısıyla daha kolay ve açık (clean) kod yazımı
	düşünülmüştür. import bildirimi bir kütüphaneyi "import etmek" anlamına GELMEZ
	
	import bildirimi iki şekilde kullanılabilir:
	1. Yıldızlı import bildirimi (import on demand declaration)
	2. Yıldızsız import bildirimi (import single type declaration)
	
	import bildirimleri ".java" dosyasında (compilation/translation unit) paket bildiriminden sonra diğer bildirimlerden
	önce olmalıdır. import bildirimlerinin sırasının önemi yoktur. import bildirimleri bildirildiği ".java" dosyasına
	özgüdür. Başka bir derleme birimini etkilemez
	
	Anahtar Notlar: "Yıldızlı ve yıldızsız import bildirimi" tercümesi kolay anlatmak için Oğuz Karan tarafından uydurulmuştur. 
	Teknik isimde yıldız (asterisk) anlamında düşünülmemelidir
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;



class App {	
	public static void main(String [] args)
	{
		test.Sample s;
		
		s = new test.Sample();
		
		s.x = 20;
		s.foo();
		System.out.printf("s.x = %d%n", s.x);
						
	}	
}

