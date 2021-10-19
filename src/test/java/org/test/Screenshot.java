package org.test;

import java.io.IOException;
import java.util.Date;

import org.data.Baseclass;
import org.data.LoginpageTest;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;





public class Screenshot extends Baseclass{
	@BeforeClass
	private void BeforeClass() {
		launchBrowser("Chrome");
		
		driver.manage().window().maximize();
		System.out.println("BeforeClass");

	}
          @AfterClass
          private void AfterClass() {
        	  quietBrowser();
			System.out.println("AfterClass");

		}
          @BeforeMethod
          private void BeforeMethod() throws IOException {
        	  System.out.println("-------Test Starts-------"+new Date());
			System.out.println("BeforeMethod");
			
		}
          @AfterMethod
          private void AfterMethod() throws IOException {
        	  System.out.println("--------Test Ends------"+new Date());
        	  Screenshot("facebook");
        	  
	    System.out.println("AfterMethod");
	    
          }
          @Test
          private void Test1() {
        	  launchUrl("https://www.facebook.com/");
        	  LoginpageTest l=new LoginpageTest();
        	  Assert.assertTrue(false);
        	  fillTextBox(l.getTxtusername().get(0), "Desigan");
        	  fillTextBox(l.getTxtpassword(), "898686");
        	  btnClick(l.getBtnlogin());
			System.out.println("Test1");

		}
}
