/*----------------------------------------------------------------------------------------------------------------------
	Aşağıdaki örneği inceleyiniz
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import org.csystem.util.array.ArrayUtil;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

class App {
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
		Random r = new Random();
		ArrayList<ArrayList<Integer>> list = new ArrayList<>();

		System.out.print("Bir sayı giriniz:");
		int count = Integer.parseInt(kb.nextLine());

		while (count-- > 0) {
			ArrayList<Integer> iList = new ArrayList<>();
			for (int a : ArrayUtil.getRandomArray(r, r.nextInt(5, 15), 0, 99))
				iList.add(a);

			list.add(iList);
		}

		for (ArrayList<Integer> iList : list) {
			for (int a : iList)
				System.out.printf("%d ", a);

			System.out.println();
		}
	}
}

