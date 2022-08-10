/*----------------------------------------------------------------------------------------------------------------------
	Aşağıdaki örneği inceleyiniz
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

class App {
	public static void main(String[] args)
	{
		System.out.println(Sample.foo("csd")); //csdtry
	}
}

class Sample {
	public static String foo(String str)
	{
		String result = str;

		try {
			str += "try";
		}
		finally {
			str += "finally";
		}

		return str;
	}
}

