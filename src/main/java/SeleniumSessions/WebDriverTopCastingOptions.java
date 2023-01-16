package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverTopCastingOptions {
	

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\rekha\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		//ChromeDriver driver=new ChromeDriver();
//System.setProperty("webdriver.gecko.driver","C:\\Users\\rekha\\Downloads\\geckodriver-v0.32.0-win-aarch64\\geckodriver.exe");			
		WebDriver driver=new FirefoxDriver();
		
		//System.setProperty("webdriver.edge.driver","C:\\Users\\rekha\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		//WebDriver driver=new EdgeDriver();
		
		// C:\Users\rekha\Downloads\edgedriver_win64
		
		driver.get("https://www.google.com");
		
		String title=driver.getTitle();
		System.out.println("page title:"+title);
		
		
		if(title.equals("Google")) {
			System.out.println("correct title");
			}
		else {
			System.out.println("incorrect title");
			
		}
		
		//driver.quit();
		
		String url=driver.getCurrentUrl();
			
		
		
		

	}

}

