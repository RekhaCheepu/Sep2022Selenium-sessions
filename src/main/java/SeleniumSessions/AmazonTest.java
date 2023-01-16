package SeleniumSessions;
public class AmazonTest {

	public static void main(String[] args) {
		String browserName="Chrome";
		BrowserUtil brUtil=new BrowserUtil();
		brUtil.launchBrowser(browserName);
		brUtil.launchUrl("https://www.amazon.com");
		
		String actTitle=brUtil.getPageTitle();
		System.out.println(actTitle);
if(actTitle.contains("Amazon")) {
	System.out.println("correct title");
}
else {
	System.out.println("incorrect title");
}
	}

}
