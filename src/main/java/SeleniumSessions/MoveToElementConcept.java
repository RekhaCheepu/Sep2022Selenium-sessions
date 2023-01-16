package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElementConcept {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		WebElement addons=driver.findElement(By.xpath("//div[text()='Add-ons']"));
		Actions act=new Actions(driver);
		act.moveToElement(addons).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Student Discount']")).click();
		
		

	}

}
