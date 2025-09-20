package seleniumbatch;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;

public class OpenCartAppTest4 {

	public static void main(String[] args)  {

		BrowserUtil brUtil = new BrowserUtil();
		
		WebDriver driver = brUtil.initDriver("chrome");
		
		//remove https and url auto handles the wrong url.
		//we try to handle it using our try catch.
		URL url;
		try {
			url = new URL("naveenautomationlabs.com/opencart/index.php?route=account/login");
			brUtil.launchURL(url);

		} catch (MalformedURLException e) {
			System.out.println("https is missing");
			e.printStackTrace();
		}	

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

//opens blank browser and then continues run.
//then closes.
//https is missing
//java.net.MalformedURLException: no protocol: 
//	naveenautomationlabs.com/opencart/index.php?route=account/login
//	at java.base/java.net.URL.<init>(URL.java:772)
//	at java.base/java.net.URL.<init>(URL.java:654)
//	at java.base/java.net.URL.<init>(URL.java:590)
//	at seleniumbatch.OpenCartAppTest4.main(OpenCartAppTest4.java:20)
//page title is: 
//title is not correct -- FAIL
//page URL is: data:,
//login page url is correct -- FAIL
//browser is closed

