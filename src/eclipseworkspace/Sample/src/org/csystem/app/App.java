/*----------------------------------------------------------------------------------------------------------------------	
	Yıldızlı import bildiriminin (import on demand declaration) genel biçimi:
	
		import <paket ismi>[.alt paketler].*;
	
	Bu bildirim niteliksiz isim arama genel kurallarına göre aranan bir ismin paket içerisinde de bulunamaması durumunda
	arama için bakılacak paket belirtir. Yani adeta bir paketin başka bir paket içerisine isim arama anşlamında enjekte
	edilmesidir. Bu durumda da ismin bulunamaması durumunda alt ya da üst paketlere bakılmaz
	
	Daha açık olarak, yıldızlı import bildirimleri derleyiciye "eğer niteliksiz bir ismi paket içerisinde bulamazsan bu
	paketlere de bak" anlamındadır
----------------------------------------------------------------------------------------------------------------------*/

package org.csystem.app;

import java.util.*;
import org.csystem.util.string.*;
import org.csystem.util.math.geometry.*;

class App {	
	public static void main(String [] args)
	{
		Scanner kb = new Scanner(System.in);
		Random r = new Random();
		
		System.out.printf("Bir sayı giriniz:");
		int count = Integer.parseInt(kb.nextLine());
		
		for (int i = 0; i < count; ++i) {
			Point p = new Point(r.nextDouble(), r.nextDouble());
			
			System.out.println(p.toString());
		}
		
		for (int i = 0; i < count; ++i)
			System.out.println(StringUtil.getRandomTextTR(r, 10));
		
	}	
}

