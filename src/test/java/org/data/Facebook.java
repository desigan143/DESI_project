package org.data;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class Facebook extends Baseclass   {
	@Parameters({"browserName"})
	@BeforeClass
	private void Beforeclass(String browser) {
		if (browser.equals("Chrome")) {
			launchBrowser(browser);
		}
		else if (browser.equals("Firefox")) {
			launchBrowser(browser);
		}
		else if (browser.equals("Edge")) {
			launchBrowser(browser);
			
		}
		else {
			System.out.println("Invalid Browser Name");
		}
		
	}
	@AfterClass
	private void Afterclass() {
		System.out.println("Afterclass");
	}
	@BeforeMethod
	private void BeforeMethod() {
		System.out.println("Beforemethod");

	}
	@AfterMethod
	private void AfterMethod() {
	
     System.out.println("Aftermethod");
	}
	
	
	@Test
	private void Test1() {
		launchUrl("https://www.facebook.com/");
		LoginpageTest l=new LoginpageTest();
		fillTextBox(l.getTxtusername().get(0), "Desigan");
		fillTextBox(l.getTxtpassword(), "786765");
		btnClick(l.getBtnlogin());
		System.out.println("Test1");

	}
	
		
		
	@Test
	private void Test2() {
		System.out.println("Test2");

	}

}
