/*----------------------------------------------------------------
	FILE		: Circle.java
	AUTHOR		: Java-Nov-2021 Group
	LAST UPDATE	: 08.05.2022

	Circle class that represents a Circle in geometry

	Copyleft (c) 1993 C and System Programmers Association
	All Rights Free
----------------------------------------------------------------*/
package org.csystem.util.math.geometry;

public class Circle {
    private double m_radius;

    public Circle()
    {
    }

    public Circle(double radius)
    {
        setRadius(radius);
    }

    public double getRadius()
    {
        return m_radius;
    }

    public void setRadius(double r)
    {
        m_radius = Math.abs(r);
    }

    public double getArea()
    {
        return Math.PI * m_radius * m_radius;
    }

    public double getCircumference()
    {
        return 2 * Math.PI * m_radius;
    }

    //...
}
