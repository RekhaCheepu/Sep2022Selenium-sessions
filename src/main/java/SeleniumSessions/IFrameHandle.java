package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IFrameHandle {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.formsite.com/templates/registration-form-templates/vehicle-registration-form/");//page
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//img[@title='vehicle-registration-forms-and-templates']")).click();
		
		Thread.sleep(3000);
		driver.switchTo().frame("frame-one748593425");
		driver.findElement(By.id("RESULT_TextField-7")).sendKeys("test-12345");
		
		driver.findElement(By.xpath("//input[@name='RESULT_TextField-5']")).sendKeys("Red");
		driver.findElement(By.xpath("//input[@id='RESULT_TextField-6']")).sendKeys("30000");
		
		
		WebElement state=driver.findElement(By.id("RESULT_RadioButton-12"));
		Select select=new Select(state);
		select.selectByVisibleText("New Jersey");
		
		//driver.switchTo().defaultContent();
		//driver.findElement(By.partialLinkText("Log in")).click();

	}

}
