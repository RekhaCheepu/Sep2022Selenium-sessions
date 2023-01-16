package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FacebookLoginPageTest {

	public static void main(String[] args) {
		BrowserUtil brUtil = new BrowserUtil();
		WebDriver driver = brUtil.launchBrowser("chrome");
		
		brUtil.launchUrl("https://www.facebook.com");
		
		System.out.println(brUtil.getPageTitle());
		By emailId=By.id("email");
		By password=By.id("pass");

		ElementUtil eleUtil=new ElementUtil(driver);
		eleUtil.doSendKeys(emailId, "rekha.cheepu");
		eleUtil.doSendKeys(password, "T!me2Think");
		//driver.findElement((By.xpath("//*[@id=\"u_0_5_tz\"]")
	}

}
