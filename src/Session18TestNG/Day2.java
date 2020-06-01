package Session18TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Day2 {
	
	@Test(dataProvider="DP")
	public void Day(String username,String password) {
		System.out.println("super");
		
		System.out.println(username);
		System.out.println(password);
	}
	
	
	@BeforeClass
	public void BF() {
		
		System.out.println("beforeclass");
		
	}
	
	@AfterClass
	public void Af() {
		
		System.out.println("afterclass");
	}
	
	@BeforeMethod
	public void BM() {
		
		
		System.out.println("beforemethod");
				
		
	}

	@AfterMethod
	public void AF() {
		
		System.out.println("aftermethod");
		
	}
	
	@BeforeTest
	public void BT() {
		
		System.out.println("beforetest");
		
		
	}
	
	@AfterTest
	public void AT() {
		
		
		System.out.println("aftertest");
	}
	
	
	@DataProvider
	public Object[][] DP() {
		
		// 1st combination - username password - good credit history row
		//2nd username password no credit history
		//3rd fraudelent credit history
		
		Object[][] data = new Object[3][2];
		
		//1st set
		data[0][0]="firstsetusername";
		data[0][1]="password";
		
		//2nd set
		
		data[1][0]="secondsetusername";
		data[1][1]="second password";
		
		//3rd 
		
		data[2][0]="thirdsetusername";
		data[2][1]="thirdpassword";
		
		return data;
				
		
		
		
		
		
		
		
		
		
		
		
	}
}
