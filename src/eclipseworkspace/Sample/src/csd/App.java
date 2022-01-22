/*----------------------------------------------------------------------------------------------------------------------
	switch deyimine ilişkin ifade temel türlerden yalnızca tamsayı türlerinden bir veya char türü olabilir	
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args) 
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("Telefon kodunu giriniz:");
		double code = Double.parseDouble(kb.nextLine());		
		
		switch (code) {
		case 212:
			System.out.println("İstanbul Avrupa");
			break;
		case 216:
			System.out.println("İstanbul Anadolu");
			break;		
		case 372:
			System.out.println("Zonguldak");
			break;
		case 312:
			System.out.println("Ankara");
			break;
		case 232:
			System.out.println("İzmir");
			break;					
		}
		
		System.out.println("Tekrar yapıyor musunuz?");
	}
}