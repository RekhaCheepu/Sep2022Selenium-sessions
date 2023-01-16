package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
		
		
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\rekha\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		String title=driver.getTitle();
		System.out.println("page title:"+title);
		
		
		if(title.equals("Google")) {
			System.out.println("correct title");
			}
		else {
			System.out.println("incorrect title");
			
		}
		

		String url=driver.getCurrentUrl();
		
		System.out.println(url);
		
		String pgSrc=driver.getPageSource();
		System.out.println(pgSrc);
		if(pgSrc.contains("Copyright the closure library Authors")) {
			System.out.println("this info is present");
		}
		
		driver.quit();
			
		
		
		
	}

}



