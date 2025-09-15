package seleniumbatch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class crossbrowser5 {
	
	//best code for cross browser.
	//just change browser name in one line and we are done.
	//pass right browser and it works.

	static WebDriver driver; // null

	public static void main(String[] args) {

		String browser = "chrome";

		switch (browser.trim().toLowerCase()) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;
		case "safari":
			driver = new SafariDriver();
			break;
		default:
			System.out.println("plz pass the right browser ..." + browser);
			throw new RuntimeException("Invalid Browser");
		}

		driver.get("https://www.google.com");

		// get the title of the page:
		String actTitle = driver.getTitle();
		System.out.println("page title: " + actTitle);

		// checkpoint/validation point/assertion: act vs exp result:
		if (actTitle.equals("Google")) {
			System.out.println("title is correct: PASS");
		} else {
			System.out.println("title is not correct: FAIL");
		}

		// Automation steps + Checkpoint ==> Automation Testing

		// close the browser:
		driver.quit();
	}

}
