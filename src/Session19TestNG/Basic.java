package Session19TestNG;

import java.io.IOException;

import org.testng.annotations.Test;


public class Basic extends TestBase {
	
	@Test
	public void normal() throws IOException {
		
		login();
		
		System.out.println("Succesfully");
		
	}

}
