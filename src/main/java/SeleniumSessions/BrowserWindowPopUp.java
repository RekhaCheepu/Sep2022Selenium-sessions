package SeleniumSessions;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowPopUp {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		Thread.sleep(3000);
		
		WebElement LnkdEle=driver.findElement(By.xpath("//a[contains(@href,'linkedin')]"));
		
	Set<String>handles=	driver.getWindowHandles();
	
Iterator<String>it=handles.iterator();


String ParentWindoId=it.next();
System.out.println("parent window id:"+ParentWindoId);

String ChildWindowId=it.next();
System.out.println("child window id:"+ ChildWindowId);
		
	}

}
