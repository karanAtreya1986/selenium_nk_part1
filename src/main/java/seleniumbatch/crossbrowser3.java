package seleniumbatch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class crossbrowser3 {
	
//same driver for multiple browsers.
	//added for edge.
	public static void main(String[] args) {

	    String browser = "chrome";
	    WebDriver driver = null;

	    // driver = new ChromeDriver(); // top casting
//	    driver = new FirefoxDriver();//
	    driver = new EdgeDriver();

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
