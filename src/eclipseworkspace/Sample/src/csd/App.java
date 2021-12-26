/*----------------------------------------------------------------------------------------------------------------------
	boolean türden geri dönüş değeri olan bir metodun if deyiminin koşul ifadesinde çağrılması
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args) 
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);		
		System.out.print("Bir sayı giriniz:");
		int val = Integer.parseInt(kb.nextLine());
		
		if (!NumberUtil.isEven(val))
			System.out.println("Tek");
		else
			System.out.println("Çift");
			
		System.out.println("Tekrar yapıyor musunuz?");		
	}
}


class NumberUtil {
	public static boolean isEven(int val)
	{
		return val % 2 == 0;
	}
	
	//...
}

