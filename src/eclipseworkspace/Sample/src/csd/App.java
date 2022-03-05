/*----------------------------------------------------------------------------------------------------------------------	
	Yukarıdaki örnekte anlatılan problemler aşağıdkai gibi static veri elemanları kullanılarak çözülebilir. Böylece
	kod karmaşası da azalmış olur. Örnekte yine detaylar gözardı edilmiştir. Burada anlatılmak istenen konulara odaklamanız
	tavsiye edilir. Ayrıca ** ile belirtilen kod parçaları konu açısından önemsizdir
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args) 
	{		
		WarGameApp.run();
		
	}
}

class WarGameApp {
	//...	
	
	public static void run()
	{
		//...		
		
		for (int i = 0; i < 10; ++i) {
			Alien a;
			
			a = new Alien();
			
			//...		
		}
		
		//...
		
		for (int i = 0; i < 20; ++i) {
			Soldier s;
			
			s = new Soldier();			
			//...			
		}	
		
		//...
		
		System.out.printf("Number of aliens:%d%n", Alien.count);
		System.out.printf("Number of soldiers:%d%n", Soldier.count);
		
		//...
	}
} 

class Alien {
	public static int count;
	public int numberOfArms;
	public int color;
	
	public Alien() //**
	{
		++count;
	}
	//...
}

class Soldier {
	public static int count;
	public int title;
	public int numberOfGuns;
	
	public Soldier() //**
	{
		++count;
	}
	//...
}

class Civilian {
	public static int count;
	//...
}

class Animal {
	public static int count;
	//...
}

class Building {
	public static int count;
	//...
}
