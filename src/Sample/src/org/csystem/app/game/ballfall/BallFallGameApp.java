package org.csystem.app.game.ballfall;

import org.csystem.game.ballfall.BallFall;

public class BallFallGameApp {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		for (;;) {
			System.out.print("Width?");
			int width = Integer.parseInt(kb.nextLine());
			
			if (width == 0)
				break;
			
			System.out.print("Height?");
			int height = Integer.parseInt(kb.nextLine());
			
			BallFall.play(width, height);			
		}
		
		System.out.println("Tekrar yap?yor musunuz?");
	}
}
