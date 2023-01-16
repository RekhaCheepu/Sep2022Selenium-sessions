package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class SelectorsHubRelativeDataConcept {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		Thread.sleep(30000);

		WebElement ele=driver.findElement(By.linkText("Joe.Root"));
		//right of ele
				String rightIndex= driver.findElement(with(By.tagName("td")).toRightOf(ele)).getText();
				System.out.println(rightIndex);
		
	}

}
