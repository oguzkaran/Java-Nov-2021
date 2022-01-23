/*----------------------------------------------------------------------------------------------------------------------
	Aşağıdaki örnekte switch expression'ın default bölümü olmalıdır. Çünkü switch expression'ın ürettiği değer 
	kullanılmıştır
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args) 
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		for (;;) {
			System.out.print("Telefon kodunu giriniz:");
			int code = Integer.parseInt(kb.nextLine());
			
			if (code <= 0)
				break;
			
			int plate = switch (code) { //error
				case 212:
				case 216:
					System.out.println("İstanbul");
					yield 34;				
				case 372:
					yield 67;
				case 312:
					yield 6;
				case 232:
					yield 35;
				default:
					yield -1;
			};
			
			
			if (plate != -1)
				System.out.printf("Plaka:%d%n", plate);
			else
				System.out.println("Geçersiz plaka");
		}
		
		
		System.out.println("Tekrar yapıyor musunuz?");
	}
}
