/*----------------------------------------------------------------
	FILE		: ArrayUtil.java
	AUTHOR		: Java-Nov-2021 Group
	LAST UPDATE	: 10.04.2022

	Utility class for array operations

	Copyleft (c) 1993 C and System Programmers Association
	All Rights Free
----------------------------------------------------------------*/
package org.csystem.util.array;

import java.util.Random;

public class ArrayUtil {
    public static void fillRandomArray(Random r, int [] a, int min, int max)
    {
        for (int i = 0; i < a.length; ++i)
            a[i] = r.nextInt(min, max + 1); //Since Java 17
    }

    public static void fillRandomArray(int [] a, int min, int max)
    {
        fillRandomArray(new Random(), a, min, max);
    }

    public static void fillRandomArray(Random r, double [] a, double min, double bound)
    {
        for (int i = 0; i < a.length; ++i)
            a[i] = r.nextDouble(min, bound); //Since Java 17
    }

    public static void fillRandomArray(double [] a, double min, int bound)
    {
        fillRandomArray(new Random(), a, min, bound);
    }

    public static int [] getRandomArray(Random r, int count, int min, int max) //[min, max]
    {
        int [] a = new int[count];

        fillRandomArray(r, a, min, max);

        return a;
    }

    public static int [] getRandomArray(int count, int min, int max) //[min, max]
    {
        return getRandomArray(new Random(), count, min, max);
    }

    public static double [] getRandomArray(Random r, int count, double min, double bound) //[min, bound)
    {
        double [] a = new double[count];

        fillRandomArray(r, a, min, bound);

        return a;
    }

    public static double [] getRandomArray(int count, double min, double bound) //[min, max)
    {
        return getRandomArray(new Random(), count, min, bound);
    }

    public static void print(int [] a)
    {
        for (int i = 0; i < a.length; ++i)
            System.out.printf("%d ", a[i]);

        System.out.println();
    }

    public static void reverse(int [] a)
    {
        for (int i = 0;i < a.length / 2; ++i)
            swap(a, i, a.length - 1 - i);
    }

    public static void swap(int [] a, int i, int k)
    {
        int temp;

        temp = a[i];
        a[i] = a[k];
        a[k] = temp;
    }

    public static void swap(char [] c, int i, int k)
    {
        char temp;

        temp = c[i];
        c[i] = c[k];
        c[k] = temp;
    }

    public static int sum(int [] a)
    {
        int total = 0;

        for (int i = 0; i < a.length; ++i)
            total += a[i];

        return total;
    }
}
