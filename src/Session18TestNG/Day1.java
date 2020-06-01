package Session18TestNG;

import java.io.IOException;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Session19TestNG.TestBase;

public class Day1 {
	
	@Parameters({"URL","Username"})
	@Test(groups= {"smoke"})
	public void Demo(String personalurl,String name) throws IOException 
	{
	
		
		System.out.println("Helloworld");
		System.out.println(personalurl);
		System.out.println(name);
		
	}
	
	
	@Test
	
	public void second() {
		
		System.out.println("Byeee");
	}

}
