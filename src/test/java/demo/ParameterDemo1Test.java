package demo;

import org.testng.annotations.Test;

public class ParameterDemo1Test 
{
	@Test
	public void para1()
	{
		String BROWSER = System.getProperty("browser");
		System.out.println(BROWSER);
		
		String URL = System.getProperty("url");
		System.out.println(URL);
		
	}

}
