package seleniumbatch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class launchtests {

	public static void main(String[] args) {

		//when selenium version is 4.0.0
		//then this line wont work.
		//gives illegal state exception.
		//		WebDriver driver = new ChromeDriver();

		//with older selenium we have to set browser exe like this.
		//windows:
		//System.setProperty("webdriver.chrome.driver", 
		//"c:\\Users\\naveenautomationlabs\\Documents\\mydrivers\\chromedriver.exe");

		//mac/linux:
		//System.setProperty("webdriver.chrome.driver", 
		//"/Users/naveenautomationlabs/Documents/mydrivers/chromedriver");
	}

}
