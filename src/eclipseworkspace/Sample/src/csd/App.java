/*----------------------------------------------------------------------------------------------------------------------
	Point sınıfı 	
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args) 
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		Point p1, p2;
		
		p1 = new Point();
		p2 = new Point();
		
		System.out.print("Bir sayı giriniz:");
		int count = Integer.parseInt(kb.nextLine());
		
		for (int i = 0; i < count; ++i) {
			System.out.print("Birinci nokta için x?");
			p1.x = Double.parseDouble(kb.nextLine());
			
			System.out.print("Birinci nokta için y?");
			p1.y = Double.parseDouble(kb.nextLine());
			
			System.out.print("İkinci nokta için x?");
			p2.x = Double.parseDouble(kb.nextLine());
			
			System.out.print("İkinci nokta için y?");
			p2.y = Double.parseDouble(kb.nextLine());
			
			System.out.println("------------------------");
			
			System.out.printf("Distance:%f%n", p1.distance(p2));
			
			System.out.println("------------------------");
		}
		
		System.out.println("------------------------");
		System.out.print("İkinci nokta için x?");
		double x = Double.parseDouble(kb.nextLine());
		
		System.out.print("İkinci nokta için y?");
		double y = Double.parseDouble(kb.nextLine());	
		
		
		System.out.printf("Distance:%f%n", p1.distance(x, y));
		
		System.out.println("------------------------");
		
		System.out.printf("Distance:%f%n", p1.distance());		
	}
}

class Point {
	 public double x;
	 public double y;
	 
	 //...	 
	 
	 public double distance()
	 {
		 return distance(0, 0);		 		 
	 }
	 
	 public double distance(Point other)
	 {
		 return distance(other.x, other.y);
	 }
	 
	 public double distance(double a, double b)
	 {
		 return Math.sqrt(Math.pow(x - a, 2) + Math.pow(y - b, 2));		 		 		 		 
	 }
	 
	 public void offset(double dxy)
	 {
		 offset(dxy, dxy);
	 }
	 
	 public void offset(double dx, double dy)
	 {
		 x += dx;
		 y += dy;
	 }	 
	 
	 public void print() 
	 {
		 System.out.printf("(%f, %f)%n", x, y);
	 }
}
