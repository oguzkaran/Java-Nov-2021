/*----------------------------------------------------------------------------------------------------------------------
	Aşağıdaki örnekte return deyimiile sonsuz döngüden de çıkılmış olur 	
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args) 
	{
		System.out.printf("Toplam:%d%n", Util.getTotal());				
	}
}

class Util {
	public static int getTotal()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.println("Sayıları girmeye başlayınız:");
		
		int val;
		int sum = 0;
		
		while (true) {
			val = Integer.parseInt(kb.nextLine());
			
			if (val == 0)
				return sum;
			
			sum += val;
		}		
	}
}