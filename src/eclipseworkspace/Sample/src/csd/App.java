/*----------------------------------------------------------------------------------------------------------------------
	format metodu, printf ile tamamen aynı işi yapar
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Oran yüzde değerini giriniz:");
		int ratio = Integer.parseInt(kb.nextLine());
		
		
		System.out.format("Oran:%%%d%n", ratio);
	}
}
