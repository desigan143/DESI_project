package org.data;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	public static WebDriver driver;
	public static  WebDriver launchBrowser(String browserName) {
		switch (browserName) {
		case "Chrome":
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			break;
		case "Firefox":
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			break;
			case "Edge":
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			break;
			
			
			default:
			System.err.println("Invalid Browser name"); 
			break;
			
			 
		}
		return driver;
	}
		public static void launchUrl(String Url) {
			driver.get(Url);
		}
		
		
		public static void fillTextBox(WebElement e,String value) {
			e.sendKeys(value);
			
		}
		public static void btnClick(WebElement e) {
			e.click();
			}
		public static void quietBrowser() {
	driver.quit();
      }
		public static String getCurrentURL() {
			String Url=driver.getCurrentUrl();
			return Url;
			}
		public static String getAttribute(WebElement e) {
			return  e.getAttribute("value");
			
			}
		public static String getText(WebElement e) {
			return e.getText();
			
			}
		public static void moveToElement(WebElement e) {
			Actions a= new Actions(driver);
			a.moveToElement(e).perform();
			
         }
		public static void DragAndDrop(WebElement src,WebElement des) {
			Actions a=new Actions(driver);
			a.dragAndDrop(src, des).perform();
			
			}
		public static void SelectByIndex(WebElement element,int index) {
			Select s=new Select(element);
			s.selectByIndex(index);
			
	}
		public static WebElement findElement( String locatename,String locator) {
			WebElement e= null;
			if (locatename.equals("id")) {
				e=driver.findElement(By.id(locator));
				
			}
			else if (locatename.equals("name")) {
				e=driver.findElement(By.name(locator));
				}
			else if (locatename.equals("Xapth")) {
				e=driver.findElement(By.xpath(locator));
				
			}
			return e;
				
		}
		public static WebElement JavaScript(String locaterName,String locator) {
			JavascriptExecutor JS= (JavascriptExecutor)driver;
			return JavaScript("id", "value");
		
			}
		public static void Screenshot(String imagename) throws IOException{
			TakesScreenshot Tk=(TakesScreenshot)driver;
			File src=Tk.getScreenshotAs(OutputType.FILE);
			File des=new File("C:\\Users\\Desigan D\\eclipse-workspace\\Testng\\Facebook\\"+imagename+"png");
			FileUtils.copyFile(src, des);
			
			

		}
		public static WebElement WindowaHandling(String locatername,String locator) {
			Set<String> parentId=driver.getWindowHandles();
			return WindowaHandling("id", "value");
			

		
		}
		

		
		
		}
		
			
			


