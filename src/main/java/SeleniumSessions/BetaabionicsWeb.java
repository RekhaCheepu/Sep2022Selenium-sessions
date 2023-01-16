package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BetaabionicsWeb {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.tika.mobi/MicroStrategy/asp/Main.aspx");
		
		By userName=By.id("Uid");
		By passWord=By.id("Pwd");
	
		driver.findElement(By.id("Uid")).sendKeys("regman");
		driver.findElement(By.id("Pwd")).sendKeys("regMan#77");
		
		driver.findElement(By.id("3054")).click();
		driver.findElement(By.xpath("(//a[@class='mstrLargeIconViewItemLink'])[5]")).click();
		driver.findElement(By.xpath("//a[@class='mstr-dskt-lnk profile']")).click();
		//driver.findElement(By.xpath("(//a[@class='mstrLargeIconViewItemLink'])[21]")).click();
		
		
		//driver.findElement(By.xpath("//a[@class='mstrLargeIconViewItemLink' and @title='Run Dossier (formerly Dashboard)']")).click();
		
		
	}

}
