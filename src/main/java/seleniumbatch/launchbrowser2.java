package seleniumbatch;

import org.openqa.selenium.chrome.ChromeDriver;

public class launchbrowser2 {

	public static void main(String[] args) {

		//launch browser: chrome
		//blank chrome opened.
		ChromeDriver driver = new ChromeDriver();

		//enter the url:
//		without https we get error as invalid argument exception
		driver.get("www.google.com");

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
