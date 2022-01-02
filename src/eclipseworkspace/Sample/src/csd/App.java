/*----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Katsayıları klavyeden girilen ikinci dereceden bir denklemin köklerini bulup ekrana yazdıran
	programı yazınız
	(İleride daha iyisi yazılacaktır)
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args) 
	{	
		EquationSolverApp.run();		
	}
}

class EquationSolverApp {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("a?");
		double a = Double.parseDouble(kb.nextLine());
		
		System.out.print("b?");
		double b = Double.parseDouble(kb.nextLine());
		
		System.out.print("c?");
		double c = Double.parseDouble(kb.nextLine());
		
		EquationSolver.findRoots(a, b, c);
	}
}

class EquationSolver {
	public static double getDelta(double a, double b, double c)
	{
		return b * b - 4 * a * c;
	}
	
	public static void doWorkForPositiveDelta(double delta, double a, double b)
	{
		double sqrtDelta = Math.sqrt(delta);
		double x1 = (-b + sqrtDelta) / (2 * a);
		double x2 = (-b - sqrtDelta) / (2 * a);
		
		System.out.printf("x1 = %f, x2 = %f%n", x1, x2);		
	}
	
	public static void doWorkForZeroDelta(double delta, double a, double b)
	{		
		System.out.printf("x1 = x2 = %f%n", -b / (2 * a));
	}
	
	public static void findRoots(double a, double b, double c)
	{
		double delta = getDelta(a, b, c);
		
		if (delta > 0)
			doWorkForPositiveDelta(delta, a, b);		
		else if (delta == 0) 
			doWorkForZeroDelta(delta, a, b);
		else
			System.out.println("Gerçek kök yok");
	}
}