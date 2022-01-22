/*----------------------------------------------------------------------------------------------------------------------
	continue deyimi döngüyü değil döngünün o anki adımını sonlandırmak için kullanılır. continue deyimi yalnızca 
	döngü deyimlerinde kullanılabilir. continue deyiminin de etiketli biçimi vardır. Ancak yapısal ve nesne yönelimli
	programlama teknikleri açısından kullanıması tavsiye edilmez. continue deyiminin etiketsiz biçimi break deyimi kadar
	sık kullanılmasa da okunabilirliği artırmak amacıyla bazı durumlarda tercih edilebilir. Aşağıdaki örnekte [1, n]
	arasındaki tek sayılar ekrana yazdırılmıştır. Örnek continue deyiminin çalışma biçimini göstermek için aşağıdaki 
	biçimde yazılmıştır 
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args) 
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("Bir sayı giriniz:");
		int n = Integer.parseInt(kb.nextLine());
		
		for (int i = 1; i <= n; ++i) {
			if (i % 2 == 0)
				continue;
			
			System.out.printf("%d ", i);
		}
		
		System.out.println();		
	}
}

