package Session18TestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day3 {
	
	
	@Parameters({"URL"})
	@Test
	public void Weblogincarloan(String urlname) {
		
		//selenium 
		
		System.out.println("weblogincarloan");
		System.out.println(urlname);
	
		
	}
		
	@Parameters({"URL"})
	@Test(groups= {"smoke"})
	public void Mobilelogincarloan(String carloanurl) {
			
		//appium
		System.out.println("mobilelogincarloan");
		System.out.println(carloanurl);
	}
	
	
	@Test
	
	public void LoginAPIcarloan() {
		
		
		//Rest API automation
		System.out.println("RestAPIcarloan");
	}
}
