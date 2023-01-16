package SeleniumSessions;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateConcept {

	public static void main(String[] args) throws MalformedURLException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rekha\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//driver.navigate().to("https://www,gogle.com");
		driver.navigate().to(new URL("https://www.google.com"));
		
		
		//driver.get("https://www.google.com");
		
		String title=driver.getTitle();
		System.out.println("page title:"+title);
		
	
		if(title.equals("Google")) {
			System.out.println("correct title");
			}
		else {
			System.out.println("incorrect title");
			
		}
		driver.quit();

	}

}
