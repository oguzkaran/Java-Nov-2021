/*----------------------------------------------------------------------------------------------------------------------
	Aşağıdaki örneği inceleyiniz
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Random;

class App {
	public static void main(String[] args)
	{
		Connection con = new Connection("postgresql:jdbc://localhost:5432/weatherinfodb");
		Image image = new Image("marmaris.png");
		Util.doWork(con, image);
	}
}

class Util {
	public static void doWork(Connection con, Image image)
	{
		try (con; image) { // Since Java 9
			con.doWork();
			image.doFilter();
		}
		catch (Throwable ex) {
			System.out.printf("Message:%s%n", ex.getMessage());
		}
	}
}

class Connection implements Closeable {
	private final String m_url;

	public Connection(String url)
	{
		//...
		m_url = url;
		System.out.printf("Connected to:%s%n", m_url);
	}

	public void doWork()
	{
		Random r = new Random();

		//...

		if (r.nextBoolean())
			throw new IllegalStateException("Illegal state");

		System.out.printf("Working on connection at '%s'%n", m_url);
	}

	public void close() throws IOException
	{
		System.out.println("Disconnected");
	}
}


class Image implements Closeable {
	private final String m_filename;

	public Image(String filename)
	{
		//...
		m_filename = filename;
	}

	public void doFilter()
	{
		Random r = new Random();

		//...

		if (r.nextBoolean())
			throw new ArithmeticException("Invalid operation for pixel");

		System.out.printf("Working on image '%s'%n", m_filename);
	}
	public void close()
	{
		System.out.println("Image released");
	}
}
