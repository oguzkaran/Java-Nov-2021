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
    public static int [] getRandomArray(Random r, int count, int min, int max) //[min, max]
    {
        int [] a = new int[count];

        for (int i = 0; i < count; ++i)
            a[i] = r.nextInt(max - min + 1) + min;

        return a;
    }

    public static int [] getRandomArray(int count, int min, int max) //[min, max]
    {
        return getRandomArray(new Random(), count, min, max);
    }

    public static double [] getRandomArray(Random r, int count, double min, double max) //[min, max)
    {
        double [] a = new double[count];

        for (int i = 0; i < count; ++i)
            a[i] = r.nextDouble() * (max - min) + min;

        return a;
    }

    public static double [] getRandomArray(int count, double min, double max) //[min, max)
    {
        return getRandomArray(new Random(), count, min, max);
    }

    public static void print(int [] a)
    {
        for (int i = 0; i < a.length; ++i)
            System.out.printf("%d ", a[i]);

        System.out.println();
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
        //TODO:
    }
}
