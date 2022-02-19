/*----------------------------------------------------------------------------------------------------------------------	
		 
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args) 
	{
		//...
		{
			short a = 10;
			short b = a;		
		
		
		}	
		
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
	
	public static void foo(long a, int b) //3
	{
		System.out.println("Sample.foo(long, int)");		
	}
	
	public static void foo(int a, long b) //4
	{
		System.out.println("Sample.foo(int, long)");		
	}
	
	public static void foo(double a, long b) //5
	{
		System.out.println("Sample.foo(double, long)");		
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



