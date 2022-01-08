/*----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Klavyeden sıfır girilene kadar alınan sayıların pozitif ve negatif olanlarının ayrı ayrı toplamlarını
	bulan programı yazınız 	
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args) 
	{
		PosNegSumSolver.run();			
	}
}

class PosNegSumSolver {
	public static void displayResult(int sumPos, int sumNeg)
	{
		if (sumPos != 0)
			System.out.printf("Pozitif sayıların toplamı:%d%n", sumPos);
		else
			System.out.println("Hiç pozitif sayı girmediniz");
		
		if (sumNeg != 0)
			System.out.printf("Negatif sayıların toplamı:%d%n", sumNeg);
		else
			System.out.println("Hiç negatif sayı girmediniz");
	}
	
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.println("Sayıları girmeye başlayınız:");
		
		int val;
		int sumPos = 0, sumNeg = 0;
		
		System.out.print("Bir sayı giriniz:");
		while ((val = Integer.parseInt(kb.nextLine())) != 0) {
			if (val > 0)
				sumPos += val;
			else
				sumNeg += val;
			System.out.print("Bir sayı giriniz:");
		}
		
		displayResult(sumPos, sumNeg);
	}
}