/*----------------------------------------------------------------------------------------------------------------------
	Akış return deyimine geldiğinde önce return deyimine ilişkin ifade hesaplanır, elde edilen değere geri dönülür 
	
		int temp = val * val;
	
		x = temp * 3;
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)
	{		
		int x;		
		
		x = Sample.foo() * 3;
		
		System.out.println(x);
	}
}

class Sample {
	public static int foo()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("Bir sayı giriniz:");
		int val = Integer.parseInt(kb.nextLine());		
		
		return val * val;		
	}
}