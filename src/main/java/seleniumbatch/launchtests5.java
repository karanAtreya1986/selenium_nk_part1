package seleniumbatch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class launchtests5 {

	public static void main(String[] args) {

		//multiple quits.
		WebDriver driver = new ChromeDriver();//123-sample session id
		driver = new FirefoxDriver();//345 -sample session id
		driver = new EdgeDriver();//567 -sample session id
		driver.get("https://www.google.com");//567
		driver.quit();//567--null -- edge will be close
		driver.quit();//exception will not be thrown, sid = null
		//for me not throwing any exception.
	}

}
