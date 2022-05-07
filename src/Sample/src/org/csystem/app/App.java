/*----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Sayısal loto kuponu üreten bir program tasarlayıp yazınız
	(İleride daha iyisi yazılacaktır)
----------------------------------------------------------------------------------------------------------------------*/

package org.csystem.app;

class App {
	public static void main(String[] args)
	{
		int [][][] a;

		a = new int[3][4][5];


		for (int i = 0; i < a.length; ++i)
			for (int j = 0; j < a[i].length; ++j)
				for (int k = 0; k < a[i][j].length; ++k)
					a[i][j][k] = i + j + k;

		//...
	}
}

