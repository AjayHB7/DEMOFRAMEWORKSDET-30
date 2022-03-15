package demo;

import org.testng.annotations.Test;

public class ParmeterDemoTest
{
	@Test
	public void para()
	{
		String BROWSER = System.getProperty("browser");
		System.out.println(BROWSER);
		
		String URL = System.getProperty("url");
		System.out.println(URL);
		
	}

}
