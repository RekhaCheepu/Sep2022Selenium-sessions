package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalLinks {

	public static void main(String[] args) {
	//total links
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com");
		//htmltag:<a>
	List<WebElement>linkList=	driver.findElements(By.tagName("a"));
	System.out.println("total Links:"+linkList.size());
	
//	for(int i=0;i<=linkList.size();i++) {
//	String text=linkList.get(i).getText();
//	if(!(text.length()==0)) {
//		System.out.println(i+"="+text);
//	}
//	
//
//	}
	
	//for each
//	int count=1;
//	for(WebElement e:linkList) {
//		String text=e.getText();
//		if(!(text.length()==0)) {
//			System.out.println(count+"="+text);
//			count++;
			
			for(int i=0;i<=linkList.size();i++) {
				String hrefVal=linkList.get(i).getAttribute("href");
			System.out.println(i+"="+hrefVal);
	}

}
}
