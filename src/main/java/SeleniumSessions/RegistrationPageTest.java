package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPageTest {

	public static void main(String[] args) {
		
		BrowserUtil brUtil = new BrowserUtil();
		WebDriver driver = brUtil.launchBrowser("chrome");
		
		brUtil.launchUrl("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		System.out.println(brUtil.getPageTitle());
		By firstName=By.id("input-firstname");
		By lastName=By.id("input-lastname");
		By eMail=By.id("input-email");
		By telePhone=By.id("input-telephone");
		By password=By.id("input-password");
		By ConfirmPassword=By.xpath("//*[@id=\"input-confirm\"]");
		
		ElementUtil eleUtil=new ElementUtil(driver);
		eleUtil.doSendKeys(firstName, "rekha");
		eleUtil.doSendKeys(lastName, "Cheepu");
		eleUtil.doSendKeys(eMail, "rekha123@gmail.com");
		eleUtil.doSendKeys(telePhone, "0123456789");
		eleUtil.doSendKeys(password, "rekha123");
		eleUtil.doSendKeys(ConfirmPassword, "rekha123");
		
		driver.findElement(By.name("agree")).click();

		driver.findElement(By.cssSelector("#content > form > div > div > input.btn.btn-primary")).click();
		
	
		
	}
}