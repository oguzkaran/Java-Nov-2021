/*----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Parametresi ile aldığı int türden gün, ay ve yıl bilgilerine ilişkin tarihin yılın kaçıncı 
	günü olduğu bilgisine geri döenen getDayOfYear isimli metodu yazınız ve aşağıdaki kod ile test ediniz.
	Açıklamalar:
	 - Metot geçersiz bir tarih için -1 değerine geri dönecektir
	 - Algoritmasına ilişkin örnekler:
	 
	 01.03.2020 -> 1 + 29 + 31 = 61
	 01.03.2022 -> 1 + 28 + 31 = 60
	 31.12.2020 -> 31 + 30 + 31 + ... + 29 + 31 = 366	 
	 31.12.2021 -> 31 + 30 + 31 + ... + 25 + 31 = 365
	 (İleride daha iyisi yazılacaktır)
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args) 
	{
		GetDayOfYearTest.run();
	}
}

class GetDayOfYearTest {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		for (;;) {
			System.out.print("Gün?");
			int day = Integer.parseInt(kb.nextLine());
			
			if (day == 0)
				break;
			
			System.out.print("Ay?");
			int month = Integer.parseInt(kb.nextLine());
			
			System.out.print("Yıl?");
			int year = Integer.parseInt(kb.nextLine());
			
			int dayOfYear = DateUtil.getDayOfYear(day, month, year);
			
			if (dayOfYear != -1)
				System.out.printf("%02d/%02d/%04d%n tarihi yılın %d. günüdür", day, month, year, dayOfYear);
			else
				System.out.println("Geçersiz tarih!...");
		}
		
		System.out.println("Tekrar yapıyor musunuz?");
	}
}

class DateUtil {
	public static int getDayOfYear(int day, int month, int year)
	{
		//TODO:
	}
	
	
	public static boolean isValidDate(int day, int month, int year)
	{
		if (day < 1 || day > 31 || month < 1 || month > 12)
			return false;
		
		int days;
		
		switch (month) {
		case 4:
		case 6:
		case 9:
		case 11:
			days = 30;
			break;
		case 2:
			days = 28;
			if (isLeapYear(year))
				++days;
		default:
			days = 31;				
		}
		
		return day <= days;
	}
	
	public static boolean isLeapYear(int year)
	{
		return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;				
	}
}