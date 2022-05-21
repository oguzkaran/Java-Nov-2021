/*----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Klavyeden aşağıdaki formatta girilen bilgiyi ayrıştırarak ekrana sonuçları yazdıran programı
	aşağıdaki açıklamalara göre yazınız:
	Format: <isim>:<gg/aa/yyyy>:<ders adı>:<vize>:<final>
	Oğuz Karan:10/09/1976:Matematik:45:78
	Kürşat Sorkullu:27/01/1986:Fizik:90:100
	...

	Açıklamalar:
	- Format geçerlilik kontrolü yapılmayacaktır

	- Formatta kişinin vize ve final notlarına göre vize * 0.4 + final * 0.6 formülüne göre geçme notu hesaplanacak ve
	doğum tarihinin hangi güne geldiği de belirlenerek ekrana geçti veya kaldı biçiminde bilgiler yazdırılarcaktır.
	Örneğin:
	Oğuz Karan 10 Eylül 1976 Cuma Matematik 45 78 64.8 Geçti

	- Geçme notu >= 50 ise öğrenci geçecek, değilse kalacaktır

	- İleride daha iyisi yazılacaktır
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import org.csystem.app.parser.studentinfo.StudentInfoParserApp;
import org.csystem.util.datetime.Date;

class App {
	public static void main(String[] args)
	{
		Date d = new Date();

		System.out.println(d.toLongDateStringEN());
	}
}

