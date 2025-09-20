package seleniumbatch;

public class DemoTest {
	
	public static void main(String[] args) {

		BrowserUtil2 brUtil = new BrowserUtil2();
		
		//null pointer because the driver is not pointing to any browser instance.
		//no browser will be launched.
		brUtil.driver.get("https://www.google.com");		
		
		
	}

}

//Exception in thread "main" java.lang.NullPointerException: 
//	Cannot invoke "org.openqa.selenium.WebDriver.get(String)" because "brUtil.driver" is null
//at seleniumbatch.DemoTest.main(DemoTest.java:9)
