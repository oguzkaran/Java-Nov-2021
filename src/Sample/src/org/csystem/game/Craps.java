package org.csystem.game;

public class Craps {
	public boolean win;
	
	public static int roll(java.util.Random r)
	{
		return (r.nextInt(6) + 1) + (r.nextInt(6) + 1);
	}
	
	public void rollForIndefinite(java.util.Random r, int result)
	{
		int total;
		
		while ((total = roll(r)) != result && total != 7)
			;
		
		win = total == result;
	}
	
	public void play()
	{
		java.util.Random r = new java.util.Random();		
		int total = roll(r);
		
		switch (total) {
		case 7, 11 -> win = true;
		case 2, 3, 12 -> win = false;
		default -> rollForIndefinite(r, total); 
		}
	}
}
