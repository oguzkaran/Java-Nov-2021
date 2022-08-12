/*----------------------------------------------------------------------------------------------------------------------
	checked exception sınıfı türünden parametreli bir catch bloğunun ait olduğu try bloğunda o checked exception türüne
	ilişkin nesneyi fırlatabilecek bir akış bulunmalıdır. Aksi durumda error oluşur
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import org.csystem.util.console.Console;

class App {
	public static void main(String[] args)
	{

	}
}

class LogarithmApp {
	public static void run() throws UndefinedException, IndeterminateException
	{
		try {
			double a = Console.readDouble("Bir sayı giriniz:", "Hatalı giril yapıldı!...");
			double result = MathUtil.log10(a);

			System.out.printf("Result:%f%n", result);
		}
		finally {
			System.out.println("LogarithmApp.run:: finally");
		}

		System.out.println("LogarithmApp.run ends!...");
	}
}

class MathUtil {
	public static double log10(double a) throws UndefinedException, IndeterminateException
	{
		if (a == 0)
			throw new UndefinedException("Undefined");

		if (a < 0)
			throw new IndeterminateException("Indeterminate");

		return Math.log10(a);
	}
}

enum MathStatus {NAN, POSITIVE_INFINITY, NEGATIVE_INFINITY, POSITIVE_ZERO, NEGATIVE_ZERO,}

class UndefinedException extends MathResultException {
	public UndefinedException(String message)
	{
		super(message, MathStatus.NEGATIVE_ZERO);
	}
}

class IndeterminateException extends MathResultException {
	public IndeterminateException(String message)
	{
		super(message, MathStatus.NAN);
	}
}

class MathResultException extends Exception {
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
