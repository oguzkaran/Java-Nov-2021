/*----------------------------------------------------------------------------------------------------------------------
	Bir isim kod içerisinde iki şekilde kullanılabilir: nitelikli (qualified), niteliksiz (unqualified)
	
	Kullanılan bir isim nokta operatörünün sağında kalıyorsa nitelikli, kalmıyorsa niteliksiz kullanılmış olur.
	
	Niteliksiz kullanılan isimler "niteliksiz isim arama (unqualified name lookup)" kurallarına göre, nitelikli
	kullanılan isimler ise "nitelikli isim arama (qualified name lookup)" kurallarına göre aranır. 
	
	Anathar Notlar: Yukarıdaki tanımlarda nitelikli veya niteliksiz olmak olumlu veya olumsuz bir etki anlamında
	düşünülmemelidir
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

class App {	
	public static void main(String [] args)
	{
		Sample s; //Sample niteliksiz aranır
		
		s = new Sample(); //s ve Sample niteliksiz aranır
		s.x = 20; //s niteliksiz, x nitelikli aranır
		s.foo(30); //s niteliksiz, foo nitelikli aranır
									
	}	
}


class Sample { 
	public int x;
	
	public void foo(int a)  
	{
		x = a; //x ve a niteliksiz aranır
	}
}