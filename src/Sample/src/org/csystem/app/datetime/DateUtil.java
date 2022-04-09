package org.csystem.app.datetime;

public class DateUtil {
	public static void displayDateTR(int day, int month, int year)
	{
		int dayOfWeek = getDayOfWeek(day, month, year);
		
		if (dayOfWeek == -1) {
			System.out.println("Geçersiz tarih");
			return;
		}
		
		switch (dayOfWeek) {
		case 0 -> System.out.printf("%02d/%02d/%04d Pazar%n", day, month, year);			
		case 1 -> System.out.printf("%02d/%02d/%04d Pazartesi%n", day, month, year);			
		case 2 -> System.out.printf("%02d/%02d/%04d Salı%n", day, month, year);			
		case 3 -> System.out.printf("%02d/%02d/%04d Çarşamba%n", day, month, year);			
		case 4 -> System.out.printf("%02d/%02d/%04d Perşembe%n", day, month, year);			
		case 5 -> System.out.printf("%02d/%02d/%04d Cuma%n", day, month, year);			
		case 6 -> System.out.printf("%02d/%02d/%04d Cumartesi%n", day, month, year);			
		}
		
		if (isWeekend(day, month, year))
			System.out.println("Bugün kurs var. Tekrar yaptınız mı?");
		else
			System.out.println("Kurs günü yaklaşıyor. Tekrar yapmayı unutmayınız");
			
	}
	
	public static int getDayOfWeek(int day, int month, int year)
	{
		int dayOfYear;
		
		if (year < 1900 || (dayOfYear = getDayOfYear(day, month, year)) == -1)
			return -1;
		
		return (dayOfYear + getTotalDays(year)) % 7;
	}
	
	
	public static int getTotalDays(int year)
	{
		int totalDays = 0;
		
		for (int y = 1900; y < year; ++y) {
			totalDays += 365;
			if (isLeapYear(y))
				++totalDays;
		}		 
		
		return totalDays;
	}
	
	public static boolean isWeekend(int day, int month, int year)
	{
		int dayOfWeek = getDayOfWeek(day, month, year);
		
		return dayOfWeek == 0 || dayOfWeek == 6; 
	}
	
	public static boolean isWeekday(int day, int month, int year)
	{
		return !isWeekend(day, month, year);
	}	
	
	public static int getDayOfYear(int day, int month, int year)
	{
		if (!isValidDate(day, month, year))
			return -1;
		
		int dayOfYear = day;
		
		switch (month - 1) {
		case 11:
			dayOfYear += 30;
		case 10:
			dayOfYear += 31;
		case 9:
			dayOfYear += 30;
		case 8:
			dayOfYear += 31;
		case 7:
			dayOfYear += 31;
		case 6:
			dayOfYear += 30;
		case 5:
			dayOfYear += 31;
		case 4:
			dayOfYear += 30;
		case 3:
			dayOfYear += 31;
		case 2:
			dayOfYear += 28;
			if (isLeapYear(year))
				++dayOfYear;
		case 1:
			dayOfYear += 31;			
		}		
		
		return dayOfYear;
	}
	
	
	public static boolean isValidDate(int day, int month, int year)
	{
		if (day < 1 || day > 31 || month < 1 || month > 12)
			return false;
		
		int days = switch (month) {
		case 4, 6, 9, 11 -> 30;		
		case 2 -> {
			if (isLeapYear(year))
				yield 29;
			
			yield 28;
		}
		default -> 31;
		};
		
		
		return day <= days;
	}
	
	public static boolean isLeapYear(int year)
	{
		return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;				
	}
}
