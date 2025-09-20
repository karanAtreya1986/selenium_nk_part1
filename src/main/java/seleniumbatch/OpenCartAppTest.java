package seleniumbatch;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;

public class OpenCartAppTest {

	public static void main(String[] args)  {

		BrowserUtil brUtil = new BrowserUtil();
		
		WebDriver driver = brUtil.initDriver("chrome");
		
		//launch url using string.
		brUtil.launchURL
		("https://naveenautomationlabs.com/opencart/index.php?route=account/login");		

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

//opens chrome.
//go to url.
//and validate.
//browser name:chrome
//page title is: Account Login
//title is correct -- PASS
//page URL is: https://naveenautomationlabs.com/opencart/index.php?route=account/login
//login page url is correct -- PASS
//browser is closed
