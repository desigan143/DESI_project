package org.data;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.handler.ImplicitlyWait;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginpageTest extends Baseclass {
	 public  LoginpageTest() {
		 PageFactory.initElements(driver, this);
	 }         
	
	 @FindBy(id="email")
	 private  List<WebElement> txtusername;
	 
		
	
	 @FindBy(id="pass")
	private   WebElement txtpassword;
	 @FindBy(name="login")
       private  WebElement btnlogin;
	  
	  public List<WebElement> getTxtusername() {
		return txtusername;
	}
	  public WebElement getTxtpassword() {
		return txtpassword;
	}
	  public WebElement getTxtConfirmPassword() {
		return getTxtConfirmPassword();
		
		
	}
	  public WebElement getBtnlogin() {
		return btnlogin;
	}
	  public WebElement getTxtFullName() {
		return getTxtFullName();
		
		  
	  }
	 
	  
  
  public WebElement getTxTemail() {
		return getTxTemail();
		
  }

 
    



		public void login(String user,String pass) {
	    	fillTextBox(getTxtusername().get(0),user);
	    	fillTextBox(getTxtpassword(), pass);
	    	fillTextBox(getTxtConfirmPassword(), pass);
	         btnClick(getBtnlogin());
	    	
			

		

}
		
			
		
		
			
}

		
			
		


