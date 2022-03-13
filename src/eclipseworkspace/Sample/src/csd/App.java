/*----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Klavyeden bir kullanıcı adı ve şifre isteyen basit ATM uygulamasının bir parçasını aşağıdaki
	açıklamalara göre yazınız
	Açıklamalar:
	- Kullanıcı adı ve şifresi en fazla 3(üç) kez denenebilecektir.
	
	- Denemeler sırasında doğru giriş yapılırsa "GİRİŞ BAŞARILI", başarısız denemelerde "GİRİŞ BAŞARISIZ!...", 3. denemede de
	başarısız olunursa "GİRİŞ BAŞARISIZ. ARTIK DENEME HAKKINIZ BİTTİ!..." mesajları verilecektir.
	
	- Kullanıcı adı ve şifrenin doğruluğu program içerisinde belirlenen bir kullanıcı adı ve şifre ile yapılacaktır.
	
	- Uygulamayı genel düşünürek yazınız	
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args) 
	{			
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		for (;;) {
			System.out.print("Bir yazı giriniz:");
			String s = kb.nextLine();
			
			if ("elma".equals(s))
				break;
			
			System.out.printf("(%s)%n", s);
			System.out.printf("(%s)%n", s.trim());
		}
		
		System.out.println("Tekrar yapıyor musunuz?");
	}
}

