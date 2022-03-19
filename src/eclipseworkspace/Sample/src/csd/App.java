/*----------------------------------------------------------------------------------------------------------------------
	Character sınıfının toXXX metotları
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args) 
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.printf("Bir yazı giriniz:");
		String s = kb.nextLine();		
		int len = s.length();
		
		for (int i = 0; i < len; ++i) {
			char ch = s.charAt(i);
			
			if (!Character.isLetter(ch))
				continue;
			
			
			ch = Character.isUpperCase(ch) ? Character.toLowerCase(ch) : Character.toUpperCase(ch);
			
			System.out.printf("%c", ch);			
		}
		
		System.out.println();
						
	}
}

