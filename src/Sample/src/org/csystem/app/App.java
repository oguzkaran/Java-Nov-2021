/*----------------------------------------------------------------------------------------------------------------------
	Java'da exception sınıfları kategori olarak iki gruba ayrılır: checked, unchecked

----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import java.util.Scanner;

class App {
	public static void main(String[] args)
	{
		try {
			LogarithmApp.run();
		}
		catch (WrapperException ex) {
			System.out.println(ex.getMessage());
		}
		finally {
			System.out.println("main: finally");
		}

		System.out.println("Tekrar yapıyor musunuz?");
	}
}

class LogarithmApp {
	public static void run()
	{
		try {
			Scanner kb = new Scanner(System.in);
			System.out.print("Bir sayı giriniz:");
			double a = Double.parseDouble(kb.nextLine());
			double result = MathUtil.log10(a);

			System.out.printf("Result:%f%n", result);
		}
		catch (NumberFormatException ex) {
			throw new WrapperException("Invalid Value");
		}
		catch (MathResultException ex) {
			throw new WrapperException("Problem occured", ex);
		}
		finally {
			System.out.println("LogarithmApp.run:: finally");
		}

		System.out.println("LogarithmApp.run ends!...");
	}
}


class WrapperException extends RuntimeException {
	public WrapperException(String message, Throwable cause)
	{
		super(message, cause);
	}

	public WrapperException(String message)
	{
		this(message, null);
	}

	public String getMessage()
	{
		Throwable cause = getCause();

		return String.format("Message:%s%s", super.getMessage(),
				cause == null ? "" : String.format(", Cause:%s, Cause Message:%s", cause.getClass().getName(), cause.getMessage()));
	}
}

class MathUtil {
	public static double log10(double a)
	{
		if (a == 0)
			throw new MathResultException("Undefined", MathStatus.NEGATIVE_INFINITY);

		if (a < 0)
			throw new MathResultException("Indeterminate", MathStatus.NAN);

		return Math.log10(a);
	}
}

enum MathStatus {NAN, POSITIVE_INFINITY, NEGATIVE_INFINITY, POSITIVE_ZERO, NEGATIVE_ZERO,}

class MathResultException extends RuntimeException {
	private final MathStatus m_mathStatus;

	public MathResultException(String message, MathStatus mathStatus)
	{
		super(message);
		m_mathStatus = mathStatus;
	}

	public MathStatus getMathStatus()
	{
		return m_mathStatus;
	}

	public String getMessage()
	{
		return String.format("Message:%s, Status:%s", super.getMessage(), m_mathStatus);
	}
}

