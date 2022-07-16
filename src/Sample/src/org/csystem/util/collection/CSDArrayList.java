/*----------------------------------------------------------------
	FILE		: CSDArrayList.java
	AUTHOR		: Java-Nov-2021 Group
	LAST UPDATE	: 16.07.2022

	CSDArrayList class that represents dynamic array

	Copyleft (c) 1993 C and System Programmers Association
	All Rights Free
----------------------------------------------------------------*/
package org.csystem.util.collection;

import java.util.Arrays;

public class CSDArrayList {
    private static final int DEFAULT_CAPACITY = 10;
    private Object [] m_objs;
    private int m_index;

    private static void doWorkForIllegalArgumentException(String message)
    {
        System.out.println(message);
        System.exit(1); //exception işlemleri konusuna kadar sabredin
    }

    private static void doWorkForIndexOutOfBoundsException(String message)
    {
        System.out.println(message);
        System.exit(1); //exception işlemleri konusuna kadar sabredin
    }

    private static void checkCapacity(int capacity)
    {
        if (capacity < 0)
            doWorkForIllegalArgumentException("Capacity value can not be negative:" + capacity);
    }

    private void checkIndex(int index)
    {
        if (index < 0 || m_index <= index)
            doWorkForIndexOutOfBoundsException("Index out of range:" + index);

    }

    private void changeCapacity(int capacity)
    {
        m_objs = Arrays.copyOf(m_objs, capacity);
    }

    public CSDArrayList()
    {
        m_objs = new Object[DEFAULT_CAPACITY];
    }

    public CSDArrayList(int initialCapacity)
    {
        checkCapacity(initialCapacity);
        m_objs = new Object[initialCapacity];
    }

    public boolean add(Object elem)
    {
        if (m_objs.length == m_index)
            changeCapacity(m_objs.length == 0 ? 1 : m_objs.length * 2);

        m_objs[m_index++] = elem;

        return true;
    }

    public void add(int index, Object elem)
    {
        if (m_objs.length == m_index)
            changeCapacity(m_objs.length == 0 ? 1 : m_objs.length * 2);

        //TODO:
    }

    public int capacity()
    {
        return m_objs.length;
    }


    public Object get(int index)
    {
        checkIndex(index);

        return m_objs[index];
    }

    public boolean isEmpty()
    {
        return m_index == 0;
    }

    public Object set(int index, Object elem)
    {
        checkIndex(index);
        Object old = m_objs[index];

        m_objs[index] = elem;

        return old;
    }

    public int size()
    {
        return m_index;
    }

}
