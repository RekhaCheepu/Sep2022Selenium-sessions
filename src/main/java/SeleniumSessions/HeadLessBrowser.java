package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadLessBrowser {

	public static void main(String[] args) {
		ChromeOptions co =new ChromeOptions();
		co.setHeadless(true);
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.quit();
		
		

	}

}
