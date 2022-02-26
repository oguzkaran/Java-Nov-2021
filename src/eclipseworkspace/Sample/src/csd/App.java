/*----------------------------------------------------------------------------------------------------------------------
	Homework-003-8. sorunun bir çözümü
	(Not: Çözüm çalışma sorusunun verildiği tarihte işlenmiş olan konulara göre yazılmıştır)
	Açıklama: Soruda ikinci bir Scanner nesnesi yaratılmaması için bir çok işlem metot olarak yazılmamıştır
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args) 
	{
		CalculateSumCountMinMaxApp.run();		
	}
}

class CalculateSumCountMinMaxApp {
	public static void displayReport(int count, int sum, int min, int max)
	{
		System.out.printf("Toplam %d değer girildi%n", count);
		System.out.printf("Max%d%n", max);
		System.out.printf("Min:%d%n", min);
		System.out.printf("Ortalama:%f%n", (double)sum / count);
	}
	
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);		
		int count = 0;
		int sum = 0;
		int minVal = 100;
		int maxVal = 0;
		
		for (;;) {
			int val;
			
			for (;;) {
				System.out.print("Bir tamsayı giriniz:");
				val = Integer.parseInt(kb.nextLine());
				
				if (0 <= val && val <= 100)
					break;
				
				System.out.print("Geçersiz değer girdiniz!...Yeni bir değer giriniz:");
			}
			
			++count;
			sum += val;
			minVal = Math.min(minVal, val);
			maxVal = Math.max(maxVal, val);
			
			System.out.print("Yeni bir değer girmek istiyor musunuz? [Evet için 1(bir) Hayır için 0(sıfır) değerlerinden birini giriniz]:");
			
			int option;
			
			do 
				option = Integer.parseInt(kb.nextLine());
			while (option != 0 && option != 1);	
			
			if (option == 0)
				break;
		}
		displayReport(count, sum, minVal, maxVal);
	}
}