package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewWindowConcept {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.orangehrm.com/");
		String ParentWId=driver.getWindowHandle();
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.navigate().to("https://www.google.com/");
		
		Thread.sleep(5000);

		System.out.println(driver.getTitle());
		
		driver.close();
		
		driver.switchTo().window(ParentWId);
		System.out.println(driver.getTitle());
	}

}
