/*----------------------------------------------------------------------------------------------------------------------
	Engine, Driver, Pilot, Car, Plane sınıfları ve aralarındaki ilişkiler
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

class App {
	public static void main(String[] args)
	{
		Driver driver = new Driver("İbrahim");
		Car car = new Car(driver);
		Pilot [] pilots = {new Pilot("Ataberk", 1), new Pilot("Atahan", 2), new Pilot("Aykan", 3)};
		Plane plane = new Plane(pilots, 4);

		car.run();
		plane.fly();
	}
}

class Plane {
	private Pilot [] m_pilots;
	private Engine [] m_engines;

	private void startEngines()
	{
		for (Engine engine : m_engines)
			engine.startEngine();
	}

	private void accelerateEngines()
	{
		for (Engine engine : m_engines)
			engine.accelerateEngine();
	}

	private void slowEngines()
	{
		for (Engine engine : m_engines)
			engine.slowEngine();
	}

	private void stopEngines()
	{
		for (Engine engine : m_engines)
			engine.stopEngine();
	}
	public Plane(Pilot [] pilots, int engineCount/*...*/)
	{
		m_pilots = pilots;
		m_engines = new Engine[engineCount];

		for (int i = 0; i < engineCount; ++i)
			m_engines[i] = new Engine(/*...*/);
		//...
	}

	//...
	public void fly()
	{
		System.out.println("Pilots:");
		for (Pilot p : m_pilots)
			System.out.printf("%d, %s%n", p.getNo(), p.getName());

		startEngines();
		accelerateEngines();
		System.out.println("flying");
		//...

		slowEngines();
		stopEngines();
	}

	//...
}

class Car {
	private Engine m_engine;
	private Driver m_driver;
	//...

	public Car(Driver driver/*...*/)
	{
		m_engine = new Engine(/*...*/);
		m_driver = driver;
	}

	public Driver getDriver()
	{
		return m_driver;
	}

	public void setDriver(Driver driver)
	{
		m_driver = driver;
	}

	public void brake()
	{
		//...
		m_engine.slowEngine();
		//...
	}

	public void run()
	{
		System.out.printf("Driver:%s%n", m_driver.getName());
		m_engine.startEngine();
		m_engine.accelerateEngine();
		System.out.println("Running");
		//...
		brake();
		m_engine.stopEngine();
	}

	//...
}

class Pilot {
	private String m_name;
	private int m_no;
	//...


	public Pilot(String name, int no)
	{
		m_name = name;
		m_no = no;
	}

	public String getName()
	{
		return m_name;
	}

	public void setName(String name)
	{
		//...
		m_name = name;
	}

	public int getNo()
	{
		return m_no;
	}

	public void setNo(int no)
	{
		//...
		m_no = no;
	}
	//...
}

class Driver {
	private String m_name;
	//...
	public Driver(String name)
	{
		//...
		m_name = name;
	}

	public String getName()
	{
		return m_name;
	}

	public void setName(String name)
	{
		m_name = name;
	}
	//...
}

class Engine {
	//...
	public void startEngine()
	{
		System.out.println("------------------------");
		System.out.println("Start Engine");
		System.out.println("------------------------");
	}

	public void accelerateEngine()
	{
		System.out.println("------------------------");
		System.out.println("Accelerate Engine");
		System.out.println("------------------------");
	}

	public void slowEngine()
	{
		System.out.println("------------------------");
		System.out.println("Slow Engine");
		System.out.println("------------------------");
	}

	public void stopEngine()
	{
		System.out.println("------------------------");
		System.out.println("Stop Engine");
		System.out.println("------------------------");
	}

	//...
}
