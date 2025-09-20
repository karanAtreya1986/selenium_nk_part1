package seleniumbatch;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;

public class OpenCartAppTest3 {

	public static void main(String[] args) throws MalformedURLException  {

		BrowserUtil brUtil = new BrowserUtil();
		
		WebDriver driver = brUtil.initDriver("chrome");
		
		//remove https and url auto handles the wrong url.
		URL url;
			url = new URL("naveenautomationlabs.com/opencart/index.php?route=account/login");
			brUtil.launchURL(url);

		String actTitle = brUtil.getPageTitle();
		if(actTitle.equals("Account Login")) {
			System.out.println("title is correct -- PASS");
		}
		else {
			System.out.println("title is not correct -- FAIL");
		}
		
		String actUrl = brUtil.getPageURL();
		if(actUrl.contains("route=account/login")) {
			System.out.println("login page url is correct -- PASS");
		}
		else {
			System.out.println("login page url is correct -- FAIL");
		}
		
		brUtil.quitBrowser();
		
	}
}

//opens blank browser and throws this exception:
//browser name:chrome
//java.net.MalformedURLException: no protocol: 
//	naveenautomationlabs.com/opencart/index.php?route=account/login
//	at java.base/java.net.URL.<init>(URL.java:772)
//	at java.base/java.net.URL.<init>(URL.java:654)
//	at java.base/java.net.URL.<init>(URL.java:590)
//	at seleniumbatch.OpenCartAppTest3.main(OpenCartAppTest3.java:19)
//Exception in thread "main" seleniumbatch.BrowserException: http is mising
//	at seleniumbatch.OpenCartAppTest3.main(OpenCartAppTest3.java:25)

