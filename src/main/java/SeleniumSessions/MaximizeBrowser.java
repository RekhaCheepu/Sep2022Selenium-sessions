package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaximizeBrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rekha\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().window().fullscreen();
		driver.manage().window().minimize();
	}

}
