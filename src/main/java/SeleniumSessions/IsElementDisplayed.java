package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsElementDisplayed {
	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/");
//		boolean flag=driver.findElement(By.name("search")).isDisplayed();
//		if(flag) {
//			System.out.println("ele is displayed");
//		}
//		else {
//			System.out.println("ele is not displayed");
//		}
	By search=	By.name("search");
	By logo=By.xpath("//img[@title='naveenopencart']");
	if(doIsDisplayed(search)) {System.out.println("pass");
	if(doIsDisplayed(logo)) { System.out.println("pass");
	
	}
	
	}
	}
	
	public static WebElement getElement(By locator){
		return driver.findElement(locator);
	}	
		public static boolean doIsDisplayed(By locator) {
			return getElement(locator).isDisplayed();
		}
		
	}


