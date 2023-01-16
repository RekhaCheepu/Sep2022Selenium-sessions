package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderHandling {
static WebDriver driver;
	public static void main(String[] args) {
		driver=new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		driver.findElement(By.id("datepicker")).click();
	
		String actMonthYear=driver.findElement(By.cssSelector("div.ui-datepicker-title")).getText();
		System.out.println(actMonthYear);
		
		while(!actMonthYear.equalsIgnoreCase("march 2023")) {
			
			driver.findElement(By.xpath("//span[text()='Next']")).click();
			actMonthYear=driver.findElement(By.cssSelector("div.ui-datepicker-title")).getText();	
			System.out.println(actMonthYear);
			}
		selectDate("25");
		
		//driver.findElement(By.xpath("//a[text()='19']")).click();
		
		//selectDate("25");
		//selectCalenderDate("14");
	}
	public static void selectCalenderDate(String day) {
	List<WebElement> daysList= driver.findElements(By.cssSelector("table.ui-datepicker-calendar a"));
	System.out.println(daysList.size());
	for(WebElement e:daysList) {
		String text=e.getText();
		if(text.equals(day)) {
			e.click();
			break;
		}
		
	}
	}
	
	
	
	public static void selectDate(String day) {
		driver.findElement(By.xpath("//atext()='"+day+"']")).click();
		
		
	}

}

//32.38