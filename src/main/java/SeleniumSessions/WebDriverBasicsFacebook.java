package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasicsFacebook {

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\rekha\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		String title=driver.getTitle()
;
		System.out.println("page title:"+ title);
		
		if(title.equals("Facebook")) {
			System.out.println("Correct title");
		}
			else {
			System.out.println("incorrect title");
			
		}
		

		String url=driver.getCurrentUrl();
		
		System.out.println(url);
		
		//driver.quit();
		
		

	}

}
