/*----------------------------------------------------------------------------------------------------------------------
	Genel olarak söylemek gerekirse Scanner'ın çalışma sistematiği dolayısıyla nextInt, nextLong ve nextDouble
	gibi metotlar aynı Scanner nesnesine ilişkin nextLine metodu ile aynı akışta çağrılmamalıdır. Buradaki
	durum istemden sisteme değişiklik gösterebilir. Bu sebeple özellike klavye işlemlerinde (stdin) nextLine
	metodu dışındakileri biz tercih etmiyoruz. Programcı nextLine metodunun diğer metotlarla aynı nesne için çağrılmacağından
	eminse nextLong, nextInt ve nextDouble metotlarını kullanabilir. Aşağıdaki programı çalıştırırak sonucu
	gözlemleyiniz
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args) 
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		for (;;) {
			System.out.print("Öğrencinin numarasını giriniz:");
			int no = Integer.parseInt(kb.nextLine());
			
			if (no == 0)
				break;
			
			System.out.print("Öğrencinin ismini giriniz:");
			String name = kb.nextLine();
			
			System.out.printf("%d, %s%n", no, name);
		}
	}
}

