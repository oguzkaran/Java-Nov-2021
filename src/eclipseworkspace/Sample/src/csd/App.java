/*----------------------------------------------------------------------------------------------------------------------
	Aşağıdaki örnekte println metodu birleştirilmiş yazıyı argüman olarak alır ve ekrana basar. Şüphesiz birleştirme
	işlemini println yapamaz. Çünkü metot çağrılmadan önce argümana ilişkin ifade hesaplanır, elde edilen değer ile
	metot çağrılır
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args) 
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.printf("Kişi sayısını giriniz:");
		int count = Integer.parseInt(kb.nextLine());		
		
		System.out.println("Toplam " + count + " kişi aşı oldu");
	}
}

