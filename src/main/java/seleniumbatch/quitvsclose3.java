package seleniumbatch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class quitvsclose3 {
	
	public static void main(String[] args) {

		//with close session id remains but becomes invalid.
		WebDriver driver = new ChromeDriver();//123

		driver.get("https://www.google.com");//123
		//get returns void.

		String title = driver.getTitle();//123
		System.out.println(title);

		String url = driver.getCurrentUrl();//123
		System.out.println(url);

		driver.close();//123
		//returns void.
		
		System.out.println(driver.getTitle());//sid=123--invalid
		
		
		
	}

}

//Google
//https://www.google.com/?zx=1758123158066&no_sw_cr=1
//Exception in thread "main" org.openqa.selenium.NoSuchSessionException: invalid session id

