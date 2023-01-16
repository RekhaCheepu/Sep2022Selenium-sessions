package Testngsessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class OpenCartTest {
WebDriver driver;

@BeforeMethod
public void setup() {
	driver=new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
	driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
}
@Test
public void loginPageTest() {
	String title=driver.getTitle();
	System.out.println("page title:"+title);
}	
@Test
public void titleTest() {
	String title=driver.getTitle();
	System.out.println("page title:"+title);
	Assert.assertEquals(title,"Account Login");
}
@Test
public void forgotPwdLinkExistTestTest() {
	boolean flag=driver.findElement(By.cssSelector("div#logo img")).isDisplayed();
	Assert.assertEquals(flag, flag);
}

@AfterMethod
public void tearDown() {
	driver.quit();
}
}
