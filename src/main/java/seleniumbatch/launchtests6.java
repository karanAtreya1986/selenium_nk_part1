package seleniumbatch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class launchtests6 {

	public static void main(String[] args) {

		//using objects also we can launch.
		//not good practice.
		//Eligible for garbage collector.

		new ChromeDriver();
		new ChromeDriver().get("https://www.google.com");
	}

}

//one blank browser.
//one browser with google.com
