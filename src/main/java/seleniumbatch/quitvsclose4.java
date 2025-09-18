package seleniumbatch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class quitvsclose4 {
	
	public static void main(String[] args) {

		//Reinitialise the driver.
		//solve the issue.
		WebDriver driver = new ChromeDriver();//123

		driver.get("https://www.google.com");//123
		//get returns void.

		String title = driver.getTitle();//123
		System.out.println(title);

		String url = driver.getCurrentUrl();//123
		System.out.println(url);

		driver.close();//123
		//returns void.
		
		driver = new ChromeDriver();//456
		driver.get("https://www.google.com");//456
		System.out.println(driver.getTitle());//456
		
		
		
	}

}

//first browser opens and prints this.
//Google
//https://www.google.com/
//second browser opens and prints this.
//Google

