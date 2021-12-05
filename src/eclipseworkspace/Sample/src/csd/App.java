/*----------------------------------------------------------------------------------------------------------------------
	Yukarıdaki senaryoda kodun aşağıdaki gibi yazılması daha iyi bir tekniktir	 
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)
	{
		CalculateTotalApp.run();
	}
}


class CalculateTotalApp {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Birinci sayıyı giriniz:");
		int a = Integer.parseInt(kb.nextLine());	

		System.out.print("İkinci sayıyı giriniz:");
		int b = Integer.parseInt(kb.nextLine());	
		
		int total = NumberUtil.add(a, b); 
		
		Util.display(total);
		
		////... (a ve b değişkenlerinin değerleri değiştirilmiyor varsayalım)
		
		Util.display(total);
	}
}

class Util {
	public static void display(int a)
	{
		System.out.println(a);		
	}
}

class NumberUtil {
	public static int add(int a, int b)
	{
		return a + b;
	}
}