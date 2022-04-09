/*----------------------------------------------------------------------------------------------------------------------
	Homework-007-1. sorunun bir çözümü
	(Not: Çözüm çalışma sorusunun verildiği tarihte işlenmiş olan konulara göre yazılmıştır)
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

class App {	
	public static void main(String [] args)
	{
		LottoProbabilitySimulationApp.run();
	}	
}

class LottoProbabilitySimulationApp {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);

		System.out.print("Bir sayı giriniz:");
		int count = Integer.parseInt(kb.nextLine());
		LottoProbabilitySimulation simulation = new LottoProbabilitySimulation(count);

		simulation.run();
		System.out.printf("1.oyun için oyuncunun kazanma olasılığı:%f%n", simulation.game1Prob);
		System.out.printf("2.oyun için oyuncunun kazanma olasılığı:%f%n", simulation.game2Prob);
		System.out.printf("3.oyun için oyuncunun kazanma olasılığı:%f%n", simulation.game3Prob);
	}
}

class LottoProbabilitySimulation {
	public int count;
	public double game1Prob;
	public double game2Prob;
	public double game3Prob;

	public LottoProbabilitySimulation(int n)
	{
		count = n;
	}

	public void run()
	{
		java.util.Random r = new java.util.Random();
		Lotto lotto = new Lotto(r);
		int winCount1,  winCount2,  winCount3;

		winCount1 = winCount2 = winCount3 = 0;

		for (int i = 0; i < count; ++i) {
			lotto.play();

			if (lotto.winGame1)
				++winCount1;

			if (lotto.winGame2)
				++winCount2;

			if (lotto.winGame3)
				++winCount3;
		}
		game1Prob = (double)winCount1 / count;
		game2Prob = (double)winCount2 / count;
		game3Prob = (double)winCount3 / count;
	}
}

class Lotto {
	public boolean winGame1;
	public boolean winGame2;
	public boolean winGame3;
	public java.util.Random random;

	public int getRandom()
	{
		return random.nextInt(99) + 1;
	}

	public int getFirst()
	{
		return getRandom();
	}

	public int getSecond(int first)
	{
		int second;

		while ((second = getRandom()) == first)
			;

		return second;
	}

	public int getThird(int first, int second)
	{
		int third;

		while ((third = getRandom()) == first || third == second)
			;

		return third;
	}

	public void playGame1(int first, int second, int third)
	{
		winGame1 = first + second + third < 150;
	}

	public void playGame2(int first, int second, int third)
	{
		winGame2 = NumberUtil.isPrime(first + second + third);
	}

	public void playGame3(int first, int second, int third)
	{
		int min = NumberUtil.min(first, second, third);
		int max = NumberUtil.max(first, second, third);
		int mid = first + second + third - max - min;

		winGame3 = max - min > mid;
	}

	public Lotto(java.util.Random r)
	{
		random = r;
	}

	public void play()
	{
		int first = getFirst();
		int second = getSecond(first);
		int third = getThird(first, second);

		playGame1(first, second, third);
		playGame2(first, second, third);
		playGame3(first, second, third);
	}
}

class NumberUtil {
	public static boolean isPrime(long val)
	{
		if (val <= 1)
			return false;

		if (val % 2 == 0)
			return val == 2;

		if (val % 3 == 0)
			return val == 3;

		if (val % 5 == 0)
			return val == 5;

		if (val % 7 == 0)
			return val == 7;

		for (long i = 11; i * i <= val; i += 2)
			if (val % i == 0)
				return false;

		return true;
	}

	public static int min(int a, int b, int c)
	{
		return Math.min(Math.min(a, b), c);
	}

	public static int max(int a, int b, int c)
	{
		return Math.max(Math.max(a, b), c);
	}
}
