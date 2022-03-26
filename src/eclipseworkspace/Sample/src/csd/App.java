/*----------------------------------------------------------------------------------------------------------------------
	Yukarıdaki örnek için İngilizce alfabedeki karakterler karakter tablosında sıralı olduğundan isPangramEN metodu
	aşağıdaki gibi de yazılabilir. Ancak yukarıdaki yaklaşım daha geneldir
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args) 
	{
		IsPangramTest.run();
	}
}

class IsPangramTest {
	public static void run()
	{		
		IsPangramENTest.run();		
	}
}

class IsPangramENTest {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		for (;;) {
			System.out.print("Input a text:");
			String s = kb.nextLine();
			
			if ("quit".equals(s))
				break;
			
			System.out.println(StringUtil.isPangramEN(s) ? "Pangram" : "Not a Pangram");
		}
	}
}


class StringUtil {	
	public static boolean isPangramEN(String s)
	{
		for (char c = 'a'; c <= 'z'; ++c)
			if (!s.contains(Character.toLowerCase(c) + ""))
				return false;
		
		return true;
	}	
}