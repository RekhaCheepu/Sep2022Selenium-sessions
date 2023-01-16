package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorConcept {
	static WebDriver driver;
	public static void main(String[] args) {
		driver=new ChromeDriver();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		ElementUtil elUtil=new ElementUtil(driver);
		//1 Id unique attribute
		
		//2 name can be duplicate
//		driver.findElement(By.name("email")).sendKeys("test@gmail.com");
//		By emailId=By.name("email");
//		elUtil.doSendKeys(emailId, "test@gmail.com");
		//3 class name can be duplicate
		//driver.findElement(By.className("form-control")).sendKeys("naveen");
		
		//4 xpath not an attribute...address of the webelement in HTML DOM
//		driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("test@gmail.com");
//		driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("test@123");
//		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).click();
//		
		//
//		By emailId=By.xpath("//*[@id=\"input-email\"]");
//		By password=By.xpath("//*[@id=\"input-password\"]");
//		By loginButton=By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input");
//		
//     elUtil.doSendKeys(emailId, "test@gmail.com");
//     elUtil.doSendKeys(password, "test@123");
//     elUtil.doClick(loginButton);
//     
//     //5 css(cascaded style sheet)not an attribute
//     
//     driver.findElement(By.cssSelector("#input-email")).sendKeys("testing@gmail.com");
//     driver.findElement(By.cssSelector("#input-password"));
//     driver.findElement(By.cssSelector("#content > div > div:nth-child(2) > div > form > input")).click();
     
     //6.linkText:only for link:can be duplicate
		
		//driver.findElement(By.linkText("Register")).click();
		//By registerLink=By.linkText("Register");
		//elUtil.doClick(registerLink);
		
		//7 Partial link text:only for links:can be duplicate
		//fogotten password
		//forgotten userId
		//driver.findElement(By.partialLinkText("Forgotten")).click();
		
		//8 tagName:HTML tag:can be duplicate
		//String header=driver.findElement(By.tagName("h2")).getText();
		//System.out.println(header);
		
		By header=By.tagName("h2");
		String h2=elUtil.doGetElementText(header);
		System.out.println(h2);
     
     
     
	}

	
	
public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
		
		public static void doSendKeys(By locator,String value) {
		getElement(locator).sendKeys(value);
		}
		public static void doClick(By locator) {
			getElement(locator).click();
		}
		public static String doGetElementText(By locator) {
			return getElement(locator).getText();
		}
		
}
