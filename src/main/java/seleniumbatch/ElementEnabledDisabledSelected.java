package seleniumbatch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementEnabledDisabledSelected {

	static WebDriver driver;

	public static void main(String[] args)  {

		driver = new ChromeDriver();
		driver.get("https://seleniumpractise.blogspot.com/2016/09/how-to-work-with-disable-textbox-or.html");
		
		//get the password field.
		WebElement password = driver.findElement(By.id("pass"));
		
		boolean f1 = password.isDisplayed(); //returns boolean
		System.out.println(f1);//true
		
		boolean f2 = password.isEnabled(); //returns boolean
		System.out.println(f2);//false
		
		//navigate to another url.
		driver.navigate().to("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		//locator for privacy checkbox.
		WebElement privacyCheckBox = driver.findElement(By.name("agree"));
		
		//isselected returns boolean
		System.out.println(privacyCheckBox.isSelected()); //false

		privacyCheckBox.click();
		
		System.out.println(privacyCheckBox.isSelected()); //true

	}
	

}
