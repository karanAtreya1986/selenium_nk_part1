package seleniumbatch;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigationurl1 {

	//Navigate-to method is overloaded method but get is not -

	public static void main(String[] args) throws MalformedURLException {

		WebDriver driver = new ChromeDriver();//123


		driver.get("https://www.google.com");//string
		//		
		driver.navigate().to("https://www.amazon.com");//string
		driver.navigate().to(new URL("https://www.facebook.com"));//URL


	}

}

////first opens google
//then opens amazon
//then opens facebook
//in same window
