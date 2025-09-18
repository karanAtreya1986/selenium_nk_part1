package seleniumbatch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class quitvsclose2 {
	
	public static void main(String[] args) {

		//To reactivate session initialise driver
		WebDriver driver = new ChromeDriver();//123

		driver.get("https://www.google.com");//123
		//get returns void.

		String title = driver.getTitle();//123
		System.out.println(title);

		String url = driver.getCurrentUrl();//123
		System.out.println(url);

		driver.quit();//123
		//returns void.
		
		driver = new ChromeDriver();//456
		driver.get("https://www.google.com");//456
		System.out.println(driver.getTitle());//456
		
		
		
	}

}

//opens google.com first.
//prints:
//Google
//https://www.google.com/
//then closes and opens google.com and prints title
//Google
