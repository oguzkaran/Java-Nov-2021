/*----------------------------------------------------------------------------------------------------------------------	
	Her new işlemi yeni bir nesne yaratmak olduğuna göre aşağıdaki örnekte ** ile belirtilen deyimde yeni bir nesne 
	yaratılmış ve adresi s referansına atanmıştır. Bu durumda artık s yeni bir nesneyi gösteriyor duruma gelmiştir
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args) 
	{		
		Sample s;	
		
		s = new Sample();	
		
		s.x = 10;
		s.y = true;		
		
		System.out.printf("s.x = %d%n", s.x);
		System.out.printf("s.y = %b%n", s.y);
		
		s = new Sample(); //**
		
		System.out.printf("s.x = %d%n", s.x);
		System.out.printf("s.y = %b%n", s.y);		
	}
}

class Sample {
	public int x;
	public boolean y;
	//...
}
