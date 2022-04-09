/*----------------------------------------------------------------
	FILE		: NumberUtil.java
	AUTHOR		: Java-Nov-2021 Group
	LAST UPDATE	: 09.04.2022
	
	Utility class for numeric operations
	
	Copyleft (c) 1993 C and System Programmers Association
	All Rights Free
----------------------------------------------------------------*/
package org.csystem.util.numeric;

import static java.lang.Math.abs;
import static java.lang.Math.log10;
import static java.lang.Math.pow;

public class NumberUtil {	
	public static int digitsCount(int a)
	{
		return a == 0 ? 1 : (int)log10(abs(a)) + 1; 
	}
	
	public static int digitsSum(int val)
	{		
		int sum = 0;
		
		while (val != 0) {
			sum += val % 10;
			val /= 10;
		}
		
		return abs(sum);		
	}
	
	public static int factorial(int n)
	{
		int result = 1;
		
		for (int i = 2; i <= n; ++i)
			result *= i;
		
		return result;
	}
	
	public static int gcd(int a, int b)
	{
		int min = Math.min(abs(a), abs(b));
		
		for (int i = min; i >= 2; --i)
			if (a % i == 0 && b % i == 0)
				return i;
		
		return 1;
	}
	
	public static int getDigitsPowSum(int val)
	{
		int count = digitsCount(val);		
		int sum = 0;
		
		while (val != 0) {
			sum += pow(val % 10, count);
			val /= 10;
		}
		
		return sum;				
	}
	
	public static int getFibonacciNumber(int n)
	{
		if (n <= 2)
			return n - 1;
		
		int prev1 = 1, prev2 = 0, val = 0;
		
		for (int i = 2; i < n; ++i) {
			val = prev1 + prev2;
			prev2 = prev1;
			prev1 = val;
		}
		
		return val;
	}
	
	public static int getNextArmstrong(int val)
	{
		for (;;)
			if (isArmstrong(++val))
				return val;		
	}
	
	public static int getNextFibonacciNumber(int val)
	{
		if (val < 0)		
			return 0;
		
		int prev1 = 1, prev2 = 0, result = 0;
		
		while (result <= val) {
			result = prev1 + prev2;
			prev2 = prev1;
			prev1 = result;
		}
		
		return result;		
	}
	
	public static long getPrime(int n)
	{
		long val = 2;
		
		for (int i = 2, count = 0; count < n; ++i)
			if (isPrime(i)) {
				++count;
				val = i;
			}
		
		return val;
	}
	
	public static boolean isArmstrong(int val)
	{
		return val >= 0 && val == getDigitsPowSum(val);
	}
	
	public static boolean isEven(int val)
	{
		return val % 2 == 0;
	}
	
	public static boolean isOdd(int val)
	{
		return !isEven(val);
	}
	
	public static boolean isPrime(long val)
	{
		if (val <= 1)
			return false;
		
		if (val % 2 == 0)
			return val == 2;
		
		if (val % 3 == 0)
			return val == 3;
		
		if (val % 5 == 0)
			return val == 5;
		
		if (val % 7 == 0)
			return val == 7;
		
		for (long i = 11; i * i <= val; i += 2)
			if (val % i == 0)
				return false;
		
		return true;
	}

	public static int mid(int a, int b, int c)
	{
		if (a <= b && b <= c || c <= b && b <= a)
			return b;

		if (b <= a && a <= c || c <= a && a <= b)
			return a;

		return c;
	}
	
	public static int min(int a, int b, int c)
	{
		return Math.min(Math.min(a, b), c);
	}
	
	public static int max(int a, int b, int c)
	{
		return Math.max(Math.max(a, b), c);
	}
	
	
	public static int reversed(int val)
	{		
		int result = 0;
		
		while (val != 0) {
			result = result * 10 + val % 10;
			val /= 10;
		}		
		
		return result;
	}	
}
