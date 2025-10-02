package seleniumbatch;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BrowserWindowPopUpHandling {
	
	//window handler api: tab/window: browser window pop up
	//url, title, webelements

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.orangehrm.com/30-day-free-trial");//parent
		Actions act = new Actions(driver);
		act.sendKeys(Keys.PAGE_DOWN).perform();
		
		driver.findElement(By.linkText("OrangeHRM")).click();//child
		
		//1st: fetch the window IDs
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		
		String parentWindowID = it.next();
		System.out.println("parent window id: "+ parentWindowID);
		
		String childWindowID = it.next();
		System.out.println("child window id: "+ childWindowID);
		
		
		//2nd: switching work:
		driver.switchTo().window(childWindowID);	
		System.out.println("child window title : "+ driver.getTitle());
		
		Thread.sleep(4000);
		//close the child window:
		driver.close();
		
		//driver is lost:
		
		//switch back to parent window:
		driver.switchTo().window(parentWindowID);
		System.out.println("parent window title : "+ driver.getTitle());

		//driver.quit();
		
		
		
	}

}
