package seleniumbatch;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class launchbrowser4 {

	public static void main(String[] args) {

		//launch browser: chrome
		//blank chrome opened.
//		ChromeDriver driver = new ChromeDriver();
		//to launch ff
		FirefoxDriver driver = new FirefoxDriver();
		//to launch edge.
		EdgeDriver driver1=new EdgeDriver();

		//enter the url:
		//without www it works fine.
		//www is not mandatory.
		driver.get("https://google.com");

		//get the title of the page:
		String actTitle = driver.getTitle();
		System.out.println("page title: "+ actTitle);

		//checkpoint/validation point/assertion: act vs exp result:
		if(actTitle.equals("Google")) {
			System.out.println("title is correct: PASS");
		}
		else {
			System.out.println("title is not correct: FAIL");
		}

		//Automation steps + Checkpoint ==> Automation Testing

		//close the browser:
		driver.quit();

	}

}
