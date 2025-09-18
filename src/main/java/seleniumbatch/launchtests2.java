package seleniumbatch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class launchtests2 {

	public static void main(String[] args) {

		//three browsers opened.
		WebDriver driver = new ChromeDriver();//123-sample session id
		driver = new FirefoxDriver();//345 -sample session id
		driver = new EdgeDriver();//567 -sample session id
	}

}
