package seleniumbatch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class launchtests4 {

	public static void main(String[] args) {

		//only edge browser is closed.
		WebDriver driver = new ChromeDriver();//123-sample session id
		driver = new FirefoxDriver();//345 -sample session id
		driver = new EdgeDriver();//567 -sample session id
		driver.get("https://www.google.com");//567
		driver.quit();//returns void
	}

}
