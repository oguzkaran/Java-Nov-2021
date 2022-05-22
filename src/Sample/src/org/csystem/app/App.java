/*----------------------------------------------------------------------------------------------------------------------
	Aşağıdaki durumda içi boş ()'ler geçerlidir. Hiç parantez konmaması ile aynı anlamdadır. Aslında aşağıdaki kullanım
	ve parantezsiz kullanım, sabitlere ilişkin nesneler yaratılırken "default ctor" çağrılsın anlamındadır. Anımsanacağı
	gibi bir sınıfa hiç bir ctor yazılmamaışsa derleyici default ctor'u içi boş ve public olarak yazar. enum sınıflar
	için içi boş ve erişilemez olorak yazar.   
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

class App {
	public static void main(String[] args)
	{

	}
}


enum Color {
	RED(), GREEN(), BLUE(), WHITE(), BLACK()
}