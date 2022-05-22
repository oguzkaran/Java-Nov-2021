/*----------------------------------------------------------------
	FILE		: Date.java
	AUTHOR		: Java-Nov-2021 Group
	LAST UPDATE	: 22.05.2022

	Date class that represents a local date

	Copyleft (c) 1993 C and System Programmers Association
	All Rights Free
----------------------------------------------------------------*/

package org.csystem.util.datetime;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Date {
    private static final int [] DAYS_OF_MONTHS = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private static final String [] MONTHS_TR= {"", "Ocak", "Şubat", "Mart", "Nisan", "Mayıs", "Haziran", "Temmuz",
            "Ağustos", "Eylül", "Ekim", "Kasım", "Aralık"};
    private static final String [] MONTHS_EN = {"", "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    private static final String [] DAYS_OF_WEEK_TR = {"Pazar", "Pazartesi", "Salı", "Çarşamba", "Perşembe", "Cuma", "Cumartesi"};
    private static final String [] DAYS_OF_WEEK_EN = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
    private static final DayOfWeek [] DAY_OF_WEEKS = DayOfWeek.values();
    private static final Month [] MONTHS = Month.values();

    private int m_day;
    private int m_month;
    private int m_year;
    private int m_dayOfWeek;

    private static String getDaySuffix(int day)
    {
        return switch (day) {
            case 1, 21, 31 -> "st";
            case 2, 22 -> "nd";
            case 3, 23 -> "rd";
            default -> "th";
        };
    }

    private static int getDayOfWeek(int day, int month, int year)
    {
        return (getDayOfYear(day, month, year) + getTotalDays(year)) % 7;
    }

    private static int getTotalDays(int year)
    {
        int totalDays = 0;

        for (int y = 1900; y < year; ++y)
            totalDays += isLeapYear(y) ? 366 : 365;

        return totalDays;
    }

    private static int getDayOfYear(int day, int month, int year)
    {
        return day + getTotalDaysByMonth(month, year);
    }

    private static int getTotalDaysByMonth(int month, int year)
    {
        int totalDays = 0;

        for (int m = month - 1; m >= 1; --m)
            totalDays += DAYS_OF_MONTHS[m];

        return month > 2 && isLeapYear(year) ? totalDays + 1 : totalDays;
    }


    private static boolean isValidDate(int day, int month, int year)
    {
        if (day < 1 || day > 31 || month < 1 || month > 12)
            return false;

        return day <= (month == 2 && isLeapYear(year) ? 29 : DAYS_OF_MONTHS[month]);
    }

    private static boolean isLeapYear(int year)
    {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

    private static void doWorkForException(String message)
    {
        System.out.println(message);
        System.exit(1); //Exception işlemleri konusuna kadar sabredin
    }

    private static void checkDate(int day, int month, int year, String errMessage)
    {
        if (!isValidDate(day, month, year))
            doWorkForException(errMessage);
    }

    private void checkDay(int value, String errMessage)
    {
        checkDate(value, m_month, m_year, errMessage);
    }

    private void checkMonth(int value, String errMessage)
    {
        checkDate(m_day, value, m_year, errMessage);
    }

    private void checkYear(int value, String errMessage)
    {
        checkDate(m_day, m_month, value, errMessage);
    }

    private void set(int day, int month, int year)
    {
        m_day = day;
        m_month = month;
        m_year = year;
        m_dayOfWeek = getDayOfWeek(m_day, m_month, m_year);
    }

    public Date() //Burada yazılan kodların şu an bilinmesi gerekmez. Sadece default ctor'un anlamına odaklanınız
    {
        Calendar now = new GregorianCalendar();

        set(now.get(Calendar.DAY_OF_MONTH), now.get(Calendar.MONTH) + 1, now.get(Calendar.YEAR));
    }

    public Date(int day, Month month, int year)
    {
        checkDate(day, month.ordinal() + 1, year, String.format("Invalid date value(s) -> d: %d, m: %s, y: %d", day, month.toString(), year));
        set(day, month.ordinal() + 1, year);
    }

    public Date(int day, int month, int year)
    {
        checkDate(day, month, year, String.format("Invalid date value(s) -> d: %d, m: %d, y: %d", day, month, year));
        set(day, month, year);
    }

    public int getDay()
    {
        return m_day;
    }

    public void setDay(int value)
    {
        if (value == m_day)
            return;

        checkDay(value, "Invalid day value: " + value);
        set(value, m_month, m_year);
    }

    public Month getMonth()
    {
        return MONTHS[m_month - 1];
    }

    public void setMonth(Month month)
    {
        setMonthValue(month.ordinal() + 1);
    }

    public int getMonthValue()
    {
        return m_month;
    }

    public void setMonthValue(int value)
    {
        if (value == m_month)
            return;

        checkMonth(value, "Invalid month value: " + value);
        set(m_day, value, m_year);
    }

    public int getYear()
    {
        return m_year;
    }

    public void setYear(int value)
    {
        if (value == m_year)
            return;

        checkYear(value, "Invalid year value: " + value);
        set(m_day, m_month, value);
    }

    public DayOfWeek getDayOfWeek()
    {
        return DAY_OF_WEEKS[m_dayOfWeek];
    }

    public String getDayOfWeekTR()
    {
        return DAYS_OF_WEEK_TR[m_dayOfWeek];
    }

    public String getDayOfWeekEN()
    {
        return DAYS_OF_WEEK_EN[m_dayOfWeek];
    }

    public boolean isLeapYear()
    {
        return isLeapYear(m_year);
    }

    public boolean isWeekend()
    {
        return m_dayOfWeek == 0 || m_dayOfWeek == 6;
    }

    public boolean isWeekday()
    {
        return !isWeekend();
    }

    public String toString(char sep)
    {
        return String.format("%02d%c%02d%c%04d", m_day, sep, m_month, sep, m_year);
    }

    public String toString()
    {
        return toString('/');
    }

    public String toShortDateStringTR()
    {
        return String.format("%d %s %d", m_day, MONTHS_TR[m_month], m_year);
    }

    public String toShortDateStringEN()
    {
        return String.format("%d%s %s %d", m_day, getDaySuffix(m_day), MONTHS_EN[m_month], m_year);
    }

    public String toLongDateStringTR()
    {
        return String.format("%s %s", toShortDateStringTR(), getDayOfWeekTR());
    }

    public String toLongDateStringEN()
    {
        return String.format("%s %s", toShortDateStringEN(), getDayOfWeekEN());
    }
}
