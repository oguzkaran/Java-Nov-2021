/*----------------------------------------------------------------------------------------------------------------------
	Klavyeden int türden değerler okunması
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Birinci sayı giriniz:");
		int a = Integer.parseInt(kb.nextLine());
		
		System.out.print("İkinci sayı giriniz:");
		int b = Integer.parseInt(kb.nextLine());
		
		int total = a + b;
		
		System.out.println(total);		
	}
}


