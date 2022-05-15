/*----------------------------------------------------------------
	FILE		: IntValue.java
	AUTHOR		: Java-Nov-2021 Group
	LAST UPDATE	: 15.05.2022

	Immutable IntValue class for wrapping an int value by using
	cache for [-128, 17] closed interval value

	Copyleft (c) 1993 C and System Programmers Association
	All Rights Free
----------------------------------------------------------------*/
package org.csystem.util.wrapper;

public class IntValue {
    private static final int CACHE_MIN = -128;
    private static final int CACHE_MAX = 127;
    private static final IntValue [] ms_cache = new IntValue[CACHE_MAX - CACHE_MIN + 1];
    private final int m_value;

    private IntValue(int value)
    {
        m_value = value;
    }

    public static IntValue of(int value)
    {
        if (value < CACHE_MIN || CACHE_MAX < value)
            return new IntValue(value);

        int idx = value + 128;

        if (ms_cache[idx] == null)
            ms_cache[idx] = new IntValue(value);

        return ms_cache[idx];
    }

    public String toString()
    {
        return m_value + "";
    }
}
