/*----------------------------------------------------------------------------------------------------------------------
	Derleyici bir "String literal" gördüğünde şöyle bir kod üretir: "Çalışma zamanında String türden bir nesne yarat, 
	karakterleri bu nesneye aktar ve o nesnenin adresini (referansını) ver"
	
	
	print ve println metotlarının String parametreli overload'ları argüman olarak aldıkları String referansına ilişkin
	(ya da mantıksal olarak yazıyı) yazıyı ekrana basarlar 
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args) 
	{	
		String s;
		
		
		s = "ankara";
		
		System.out.println(s);
	}
}

