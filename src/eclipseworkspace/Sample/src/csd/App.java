/*----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: İki zar atıldığında zarların çift gelmesi (ikisi de aynı) olasılığını yaklaşık olarak hesaplayan
	simülasyon programını yazınız
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args) 
	{	
		CoinSimulationApp.run();
	}
}

class CoinSimulationApp {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		CoinSimulation cs = new CoinSimulation();
		
		for (;;) {
			System.out.print("Parayı kaç kez atmak istiyorsunuz?");
			int count = Integer.parseInt(kb.nextLine());
			
			if (count <= 0)
				break;
			
			cs.run(count);
			System.out.printf("Yazı gelme olasılığı:%f%n", cs.p);
		}
				
	}
}

class CoinSimulation {
	public double p;
	
	//...
	public static int getNumberOfTails(int count)
	{		
		java.util.Random r = new java.util.Random();
		int n = 0;
		
		for (int i = 0; i < count; ++i)
			if (r.nextBoolean())
				++n;
		
		return n;
	}
	
	
	public void run(int count)
	{
		p = getNumberOfTails(count) / (double)count;				
	}
}