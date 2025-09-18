package seleniumbatch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigationmethods4 {
	
	public static void main(String[] args) {

		//refresh page.
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.google.com");

		driver.navigate().refresh();//returns void.
	}

}

//refreshes the page.
