/*----------------------------------------------------------------
	FILE		: StringUtil.java
	AUTHOR		: Java-Nov-2021 Group
	LAST UPDATE	: 03.04.2022
	
	Utility class for string operations
	
	Copyleft (c) 1993 C and System Programmers Association
	All Rights Free
----------------------------------------------------------------*/
package org.csystem.util.string;

import java.util.Random;

public class StringUtil {

	public static String capitalize(String s) 
	{
		return s.isEmpty() ? "" : Character.toUpperCase(s.charAt(0)) + s.substring(1).toLowerCase();
	}

	public static boolean containsAll(String s, String text) 
	{
		int len = text.length();

		for (int i = 0; i < len; ++i)
			if (!s.contains(text.charAt(i) + ""))
				return false;

		return true;
	}

	public static int countString(String str, String s) 
	{
		int count = 0;

		for (int i = -1; (i = str.indexOf(s, i + 1)) != -1; ++count)
			;

		return count;
	}

	public static int countStringIgnoreCase(String str, String s) 
	{
		return countString(str.toLowerCase(), s.toLowerCase());
	}

	public static String getLongestPalindrome(String text) 
	{
		String result = "";

		int end = text.length();

		while (end != 0) {
			int begin = 0;

			while (begin != end) {
				String str = text.substring(begin++, end);

				if (str.length() > 1 && isPalindrome(str) && str.length() > result.length())
					result = str;
			}

			--end;
		}

		return result;
	}

	public static String getRandomText(Random r, int count, String text) 
	{
		String str = "";

		int len = text.length();

		for (int i = 0; i < count; ++i)
			str += text.charAt(r.nextInt(len));

		return str;
	}

	public static String getRandomTextEN(int count) 
	{
		return getRandomTextEN(new Random(), count);
	}

	public static String getRandomTextEN(Random r, int count)
	{
		return getRandomText(r, count, "abcdefghijklmnopqrstuwxvyzABCDEFGHIJKLMNOPQRSTUWXVYZ");
	}

	public static String getRandomTextTR(int count) 
	{
		return getRandomTextTR(new Random(), count);
	}

	public static String getRandomTextTR(Random r, int count) 
	{
		return getRandomText(r, count, "abcçdefgğhıijklmnoöprsştuüvyzABCÇDEFGĞHIİJKLMNOÖPRSŞTUÜVYZ");
	}

	public static boolean isPalindrome(String s)
	{
		int left = 0;
		int right = s.length() - 1;

		while (left < right) {
			char cLeft = Character.toLowerCase(s.charAt(left));

			if (!Character.isLetter(cLeft)) {
				++left;
				continue;
			}

			char cRight = Character.toLowerCase(s.charAt(right));

			if (!Character.isLetter(cRight)) {
				--right;
				continue;
			}

			if (cLeft != cRight)
				return false;

			++left;
			--right;
		}

		return Character.isLetter(s.charAt(left));
	}

	public static boolean isPangramEN(String s) 
	{
		return containsAll(s.toLowerCase(), "abcdefghijklmnopqrstuwxvyz");
	}

	public static boolean isPangramTR(String s)
	{
		return containsAll(s.toLowerCase(), "abcçdefgğhıijklmnoöprsştuüvyz");
	}

	public static String padLeading(String s, int length)
	{
		return padLeading(s, length, ' ');
	}

	public static String padLeading(String s, int length, char ch) 
	{
		int len = s.length();

		return (length <= len) ? s : ((ch + "").repeat(length - len) + s);
	}

	public static String padTrailing(String s, int length) 
	{
		return padTrailing(s, length, ' ');
	}

	public static String padTrailing(String s, int length, char ch) 
	{
		int len = s.length();

		return (length <= len) ? s : (s + (ch + "").repeat(length - len));
	}


	public static String reversed(String s)
	{
		String rev = "";

		for (int i = s.length() - 1; i >= 0; --i)
			rev += s.charAt(i);

		return rev;
	}

	public static String trimLeading(String s)
	{
		int i;
		int len = s.length();

		for (i = 0; i < len && Character.isWhitespace(s.charAt(i)); ++i)
			;

		return s.substring(i);
	}

	public static String trimTrailing(String s)
	{
		int i;

		for (i = s.length() - 1; i >= 0 && Character.isWhitespace(s.charAt(i)); --i)
			;

		return s.substring(0, i + 1);
	}
}
