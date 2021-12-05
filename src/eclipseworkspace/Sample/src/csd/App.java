/*----------------------------------------------------------------------------------------------------------------------
	printf metodunda sayının noktadan sonraki basamak değerlerinin kaç tane gösterileceği % karakterinden sonra .(nokta)
	ve sayı ile belirlenebilir. Sayının gösterilmeyen basamak değerleri bilimsel olarak yuvarlanır (round). 
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)
	{		
		java.util.Scanner kb = new java.util.Scanner(System.in);		
		System.out.print("Bir sayı giriniz?");		
		double val = Double.parseDouble(kb.nextLine());		
		
		System.out.printf("val = %.10f%n", val);		
		System.out.println("Tekrar yapıyor musunuz?");
	}
}
