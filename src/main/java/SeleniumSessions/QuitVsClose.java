package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitVsClose {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rekha\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		String title=driver.getTitle();
		System.out.println("page title:"+title);
		
String url=driver.getCurrentUrl();
		
		System.out.println(url);
		if(title.equals("Google")) {
			System.out.println("correct title");
			}
		else {
			System.out.println("incorrect title");
			
		}
		
		
		//driver.quit();
			
		driver.close();
		
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
		System.out.println();
		

	}

}
