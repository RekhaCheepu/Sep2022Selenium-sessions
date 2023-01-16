package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleFooterLinks {

	static WebDriver driver;
	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		By footerLink=By.xpath("//div[@class='KxwPGc AghGtd']/a");
		
		


	}
	public static void doClickOnElement(By locator, String linkText) {
		List<WebElement> footerLink = driver.findElements(locator);
		System.out.println(footerLink.size());
		System.out.println("total links : " + footerLink.size());
		for (WebElement e : footerLink) {
			String text = e.getText();
			System.out.println(text);
		

}
}
}