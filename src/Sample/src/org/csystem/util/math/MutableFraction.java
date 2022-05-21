/*----------------------------------------------------------------------------------------------------------------------
	Soru: Bir kesri temsil eden MutableFraction isimli aşağıdaki sınıfı yazınız
	Açıklamalar:
	- Sınıf Matematikteki  bir kesri temsil ettiğinden pay ve payda değerleri tutulacaktır

	- Sınıfın ilgili set ve get metotları yazılacaktır

	- Pay'ın sıfırdan farklı, paydanın sıfır olması durumunda tanımsızlığa ilişkin bir mesaj verilecektir, pay ve paydanın
	her ikisinin birden sıfır olması durumunda belirliğe ilişkin mesaj verilecektir. Her iki durumda da program
	sonlandırılacaktır

	- Kesir he durumda sadeleşmiş bir biçimde tutulacaktır. Örneğin kesrin pay ve paydası sırasıyla 4 ve 18 olarak
	verildiğinde kesir 2 / 9 olarak tutulacaktır.

	- Kesir negatif ise işaret payda bulunacaktır. Örneğin kesin pay ve paydası sırasıyla 3 ve -4 olarak verilmişse
	kesir -3 / 4 biçiminde tutulacaktır

	- Kesrin pay ve paydasının ikisinin birden negatif olması durumunda kesir pozitif olarak tutulacaktır

	- Kesrin payının sıfır olması durumunda payda ne olursa olsun 1(bir) yapılacaktır

	- Sınıfın iki kesri toplayan, bir kesir ile bir tamsayıyı toplayan aşağıdaki gibi metotları olacaktır. Aynı işlemler
	 çıkarma, çarpma ve bölme için de yapılacaktır

	- Sınıfın kesri 1(bir) artıran ve bir azaltan inc ve dec metotları yazılacaktır

	- Sınıfın toString metodu şu formatta yazı döndürecektir:
	    3 / 10 kesri için -> 3 / 10 = 3.33
	    10 / 1 kesri için -> 10 / 1

	 - Bu sınıf için ayrıca Fraction isimli immutable versiyonunu da yazınız

	 - Her iki sınıfa da birbirlerine dönüştürülebilen toXXX metotları eklenecfektir. Örneğin MutableFraction
	 sınıfına toFraction metodu Fraction sınıfına toMutableFraction metodu eklenecektir:
	    public Fraction toFraction();
	    public MutableFraction toMutableFraction();

	 - Sınıfın public bölümünü değiştirmeden istediğiniz değişikliği ve eklemeleri yapabilirsiniz
----------------------------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------
	FILE        : MutableFraction.java
	AUTHOR      : Java-Nov-2021 Group
	LAST UPDATE : 21.05.2022

	MutableFraction class that represents fraction in mathematics

	Copyleft (c) 1993 by C and System Programmers Association (CSD)
	All Rights Free
-----------------------------------------------------------------------*/
package org.csystem.util.math;

public class MutableFraction {
    private int m_a;
    private int m_b;

    public MutableFraction()
    {
        m_b = 1;
    }

    public MutableFraction(int a)
    {
        m_a = a;
        m_b = 1;
    }

    public MutableFraction(int a, int b)
    {
        //...
    }

    public int getNumerator()
    {
        return m_a;
    }

    public void setNumerator(int a)
    {
        //...
    }

    public int getDenominator()
    {
        return m_b;
    }

    public void setDenominator(int b)
    {
        //...
    }

    public double getRealValue()
    {
        return (double)m_a / m_b;
    }

    //add methods
    public static MutableFraction add(int val, MutableFraction f)
    {
        //...

        return new MutableFraction();
    }

    public MutableFraction add(MutableFraction other)
    {
        //...
        return new MutableFraction();
    }

    public MutableFraction add(int val)
    {
        //...
        return new MutableFraction();
    }

    //subtract methods
    public static MutableFraction subtract(int val, MutableFraction f)
    {
        //...
        return new MutableFraction();
    }

    public MutableFraction subtract(MutableFraction other)
    {
        //...
        return new MutableFraction();
    }

    public MutableFraction subtract(int val)
    {
        //...
        return new MutableFraction();
    }

    //multiply methods
    public static MutableFraction multiply(int val, MutableFraction f)
    {
        //...
        return new MutableFraction();
    }

    public MutableFraction multiply(MutableFraction other)
    {
        //...
        return new MutableFraction();
    }

    public MutableFraction multiply(int val)
    {
        //...
        return new MutableFraction();
    }

    //divide methods
    public static MutableFraction divide(int val, MutableFraction f)
    {
        //...
        return new MutableFraction();
    }

    public MutableFraction divide(MutableFraction other)
    {
        //...
        return new MutableFraction();
    }

    public MutableFraction divide(int val)
    {
        //...
        return new MutableFraction();
    }

    public void inc()
    {
        //...
    }

    public void dec()
    {
        //...
    }

    public String toString()
    {
        //...
        return "";
    }
}
