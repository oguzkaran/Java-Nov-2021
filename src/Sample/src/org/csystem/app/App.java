/*----------------------------------------------------------------------------------------------------------------------
	Soru: Öyle bir immutable sınıf yazın ki, sınıf içerisinde int türden aşağıdaki açıklamalara göre bir değer
	tutulabilsin. Yani bu sınıf int türden bir değeri sarmalasın (wrapper):
	Açıklamalar:
	- Sınıfın ismi IntValue olacaktır

	- Sınıf [-128, 127] aralığında değerlere ilişkin sarmalanan nesneler ilk kez istendiğinde yaratılacak. Sonraki
	isteklerde hep aynı nesnenin referansı verilecektir.

	- Bu kavrama genel olarak "ön bellek (cache)" denir

	Anahtar Notlar: Aslında JavaSE'de yukarıda anlatılan işlemi yapan bir sınıf vardır. IntValue böyle bir sınıfın
	nasıl yazılabileceğini göstermek için yazılmıştır
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import org.csystem.util.wrapper.IntValue;

class App {
	public static void main(String[] args)
	{
		IntValue iv1 = IntValue.of(100);
		IntValue iv2 = IntValue.of(100);
		IntValue iv3 = IntValue.of(1000);
		IntValue iv4 = IntValue.of(1000);

		System.out.println(iv1 == iv2 ? "Aynı nesne" : "Farklı nesneler");
		System.out.println(iv3 == iv4 ? "Aynı nesne" : "Farklı nesneler");
	}
}



