package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptTest {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		String title=js.executeScript("return document.title").toString();
//		System.out.println(title);

		JavaScriptUtil jsUtil=new JavaScriptUtil(driver);
		System.out.println(jsUtil.getTitleByJS());
		
		String pageText=jsUtil.getPageInnerText();
		System.out.println(pageText);
		
		
		

	}

}
