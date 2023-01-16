package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropConcept {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
	WebElement sourceEle=	driver.findElement(By.id("draggable"));
	WebElement tagetEle=	driver.findElement(By.id("droppable"));
	Actions act=new Actions(driver);
	
	//act.clickAndHold(sourceEle).moveToElement(tagetEle).release().build().perform();
		
act.dragAndDrop(sourceEle, tagetEle).build().perform();
	}

}
