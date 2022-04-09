/*----------------------------------------------------------------
	FILE		: Complex.java
	AUTHOR		: Java-Nov-2021 Group
	LAST UPDATE	: 09.04.2022
	
	Complex class that represents a "Complex Number"
	
	Copyleft (c) 1993 C and System Programmers Association
	All Rights Free
----------------------------------------------------------------*/
package org.csystem.util.math;


import static java.lang.Math.sqrt;

public class Complex {
	public double real;
	public double imag;	
	
	public static Complex add(double a1, double b1, double a2, double b2) // İleride bu metodu gizleyeceğiz
	{
		return new Complex(a1 + a2, b1 + b2);		
	}
	
	public static Complex subtract(double a1, double b1, double a2, double b2) // İleride bu metodu gizleyeceğiz
	{
		return add(a1, b1, -a2, -b2);			
	}
	
	public Complex()
	{
	}
	
	public Complex(double a)
	{
		real = a;
	}
	
	public Complex(double a, double b)
	{
		real = a;
		imag = b;
	}
	
	public double getLength()
	{
		return sqrt(real * real + imag * imag);
	}
	
	public double getNorm()
	{
		return getLength();
	}	
	
	public Complex getConjugate()
	{
		return new Complex(real, -imag);
	}
	
	//add methods
	public static Complex add(double value, Complex z)
	{
		return add(value, 0, z.real, z.imag);		
	}
	
	public Complex add(Complex other)
	{
		return add(real, imag, other.real, other.imag);
	}
	
	public Complex add(double value)
	{
		return add(real, imag, value, 0);				
	}
	
	//subtract methods
	public static Complex subtract(double value, Complex z)
	{
		return subtract(value, 0, z.real, z.imag);		
	}
	
	public Complex subtract(Complex other)
	{
		return subtract(real, imag, other.real, other.imag);
	}
	
	public Complex subtract(double value)
	{
		return subtract(real, imag, value, 0);				
	}

	
	//inc methods
	public void inc(double value)
	{
		real += value;
	}
	
	public void inc()
	{
		inc(1);
	}
	
	//dec methods
	public void dec(double value)
	{
		inc(-value);
	}
	
	public void dec()
	{
		dec(1);
	}
	
	public String toString()
	{
		return String.format("(%f, %f)", real, imag);
	}
}
