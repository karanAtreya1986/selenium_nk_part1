package seleniumbatch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class quitvsclose1 {
	
	public static void main(String[] args) {

		//line 25 will give no such session as driver quit.
		//session id gone.
		WebDriver driver = new ChromeDriver();//123

		driver.get("https://www.google.com");//123
		//get returns void.

		String title = driver.getTitle();//123
		System.out.println(title);

		String url = driver.getCurrentUrl();//123
		System.out.println(url);

		driver.quit();//123
		//returns void.
		
		System.out.println(driver.getTitle());//sid=123--invalid
		
		
		
	}

}

//Google
//https://www.google.com/
//Exception in thread "main" org.openqa.selenium.NoSuchSessionException: 
//	Session ID is null. Using WebDriver after calling quit()?
//Build info: version: '4.35.0', revision: '1c58e5028b'
//System info: os.name: 'Windows 11', os.arch: 'amd64', os.version: '10.0', java.version: '23.0.2'
//Driver info: org.openqa.selenium.chrome.ChromeDriver
//Command: [null, getTitle {}]
//}
