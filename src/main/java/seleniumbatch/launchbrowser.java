package seleniumbatch;

import org.openqa.selenium.chrome.ChromeDriver;

public class launchbrowser {

	public static void main(String[] args) {

		//launch browser: chrome
		//blank chrome opened.
		ChromeDriver driver = new ChromeDriver();

		//enter the url:
		driver.get("https://www.google.com");

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
