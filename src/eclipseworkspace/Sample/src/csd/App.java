/*----------------------------------------------------------------------------------------------------------------------
	Point sınıfı  
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args) 
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		Point p1, p2, p3;
		
		p1 = new Point();
		p2 = new Point(56.89, 300.98);
		p3 = new Point(67);
		
		p1.print();
		p2.print();
		p3.print();
		
		p2.offset(3.4);
		p2.print();
	}
}

class Point {
	 public double x;
	 public double y;
	 
	 public Point()
	 {		 
	 }
	 
	 public Point(double a)
	 {
		 x = a;
	 }
	 
	 public Point(double a, double b)
	 {
		 x = a;
		 y = b;
	 }
	 
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
