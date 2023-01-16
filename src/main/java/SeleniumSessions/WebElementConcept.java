package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementConcept {
static WebDriver driver;
	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\rekha\\Downloads\\chromedriver_win32\\chromedriver.exe");
    driver=new ChromeDriver(); 
    
    driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
    
    //1
//    driver.findElement(By.id("input-email")).sendKeys("naveen@gmail.com");
//    driver.findElement(By.id("input-password")).sendKeys("naveen@123");
    //driver.findElement(By.id("input-email")).sendKeys("TOM@gmail.com");
    
   //2 
   //WebElement emailId=driver.findElement(By.id("input-email")); 
  // WebElement password=driver.findElement(By.id("input-password")); 
   
//   emailId.sendKeys("naveen@gmail.com");
//   password.sendKeys("naveen123");
//   emailId.sendKeys("TOM@gmail.com");
    
 //3 By locator approach:
//  By emailId= By.id("input-email");
//  By password=By.id("input-password"); 
//  
//  WebElement email_ele=driver.findElement(emailId);
//  WebElement pwd_ele=driver.findElement(password);
//  
//  email_ele.sendKeys("test@gmail.com");
//  pwd_ele.sendKeys("test@123");
//  
  //4 By locator+generic function-getElement()
    
//    By emailId= By.id("input-email");
//  By password=By.id("input-password");
//  
//  getElement(emailId).sendKeys("test@gmail.com");
//  getElement(password).sendKeys("test@123");
    
    //5 By locator+generic function-getElement()and action method
    
//    By emailId= By.id("input-email");
//  By password=By.id("input-password");
//  
//  getElement(emailId).sendKeys("tom@gmail.com");
//  getElement(password).sendKeys("tom@123");  
    
    //6 By locator+generic function-getElement()and action method in Util
    By emailId= By.id("input-email");
 By password=By.id("input-password");
 
 ElementUtil eleUtil=new ElementUtil(driver);
 eleUtil.doSendKeys(emailId, "naveen@gmail.com");
eleUtil.doSendKeys(password, "naveen@123");
//    
 //7 create a generic util class with main() method
    
    
    
	}
	
	 
	 
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
		
		public static void doSendKeys(By locator,String value) {
		getElement(locator).sendKeys(value);
		}
	}


