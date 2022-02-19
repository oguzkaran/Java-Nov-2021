/*----------------------------------------------------------------------------------------------------------------------	
	1. Aday metotlar: 1, 2, 3, 4, 5, 6
	2. Uygun metotlar: 3, 4, 5
	3. En uygun metot: 3			
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args) 
	{
		int a = 10;
		short b = 30;
		
		Sample.foo(a, b);
	}
}

class Sample {
	public static void foo() //1
	{
		System.out.println("Sample.foo()");		
	}
	
	public static void foo(int a) //2
	{
		System.out.println("Sample.foo(int)");		
	}
	
	public static void foo(int a, int b) //3
	{
		System.out.println("Sample.foo(int, int)");		
	}
	
	public static void foo(double a, int b) //4
	{
		System.out.println("Sample.foo(double, int)");		
	}
	
	public static void foo(int a, long b) //5
	{
		System.out.println("Sample.foo(int, long)");		
	}
	
	public static void foo(int a, char b) //6
	{
		System.out.println("Sample.foo(int, char)");		
	}
	
	public static void bar() //7
	{
		System.out.println("Sample.bar()");		
	}
}



