package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopup {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
//input type=file;
		
		driver.findElement(By.name("upfile")).sendKeys("C:\\Users\\rekha\\Downloads\\englishwork.zip");
		
		driver.findElement(By.xpath("/html/body/form/input[3]")).click();
	}

}
