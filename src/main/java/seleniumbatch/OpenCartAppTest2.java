package seleniumbatch;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;

public class OpenCartAppTest2 {

	public static void main(String[] args) throws MalformedURLException  {

		BrowserUtil brUtil = new BrowserUtil();
		
		WebDriver driver = brUtil.initDriver("chrome");
		
		//launch url using url method.
		URL url;
			url = new URL("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
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

//opens the url, goes to page and does the actions mentioned.
