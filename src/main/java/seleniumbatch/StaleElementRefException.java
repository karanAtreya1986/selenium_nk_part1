package seleniumbatch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementRefException {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();//browser
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");//page DOM-v1

		//DOM v1
		WebElement firstname = driver.findElement(By.id("input-firstname"));
		
		//DOM v1
		firstname.sendKeys("naveen@gmail.com");
		
		driver.navigate().refresh();
		//refresh, back and forward
		
		//DOM v2
		firstname = driver.findElement(By.id("input-firstname"));
		
		//Dom v2
		firstname.sendKeys("mohit@gmail.com");


	}

}
