/*----------------------------------------------------------------------------------------------------------------------
	Şu ana kadar gördüklerimizle temel türden bir değerin yazı karşılığı aşağıdaki yöntemlerle elde edilebilir
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args) 
	{
		int a = 10;
		String s1 = String.valueOf(a);
		String s2 = a + "";
		String s3 = String.format("%d", a);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}
}


