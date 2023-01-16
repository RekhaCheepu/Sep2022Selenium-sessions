package SeleniumSessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitConcept {
	static WebDriver driver;
	public static void main(String[] args) {
		driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		By macBook=By.linkText("MacBook");
		
		By emailId=By.id("input-email");
		By passWord=By.id("input-password");
By loginBtn=By.xpath("//input[@class='btn btn-primary']");

waitForElementPresence(emailId,10).sendKeys("naveen@gmail.com");
getElement(passWord).sendKeys("test@123");
getElement(loginBtn).click();	}
	//An expectation for checking that an element is present on the DOM of a page.
	//This does notnecessarily mean that the element is visible.
	public static WebElement waitForElementPresence(By locator,int timeOut) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
		
		
		public static WebElement waitForElementVisible(By locator,int timeOut) {
			WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeOut));
			return (WebElement) wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
		}
		public static WebElement getElement(By locator) {
		return driver.findElement(locator);	
	}

}
