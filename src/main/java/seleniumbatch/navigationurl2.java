package seleniumbatch;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigationurl2 {

	// Launch flipkart using url-

	public static void main(String[] args) throws MalformedURLException {

		WebDriver driver = new ChromeDriver();// 123

		URL baseUrl = new URL("https://www.flipkart.com");
		driver.navigate().to(baseUrl);

	}

}

//launches flipkart.