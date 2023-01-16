package SeleniumSessions;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class IncognitoMode {

	public static void main(String[] args) {
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--incognito");
		co.setHeadless(true);
		
		RemoteWebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.quit();

	}

}
