/*----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Parametresi ile aldığı int türden gün, ay ve yıl bilgilerine ilişkin tarihin aşağıdaki açıklamalara
	göre haftanın hangi gününe geldiği bilgisini döndüren getDayOfWeek isimli metodu yazarak aşağıdaki açıklamalara uygun
	programı yazınız.
	Açıklamalar:
	- Metot geçersiz tarih için -1 değerine geri dönecektir.
	- 01.01.1900 tarihinden öncesi geçersiz kabul edilecektir.
	- Haftanın günü 01.01.1900 ile verilen tarih arasında (verilen tarih dahil) geçen gün sayısının 7 ile bölümünden elde
	edilen kalan ile bulunabilir. Değer 0(sıfır) ise "Pazar", 1(bir) ise "Pazartesi", ..., 6 ise Cumartesi günlerine
	karşılık gelir.
	- Parametresi ise aldığı gün, ay ve yıl bilgilerine ilişkin tarihin hafta sonu olup olmadığını test eden isWeekend
	ve hafta içi olup olmadığını test eden isWeekday metotlarını da yazınız. Metotlar tarih geçerlilik kontrolü
	yapmayacaktır
	 (İleride daha iyisi yazılacaktır)
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import org.csystem.app.datetime.DateApp;

class App {
	public static void main(String [] args)
	{
		DateApp.run();
	}
}

