package seleniumbatch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysConcept {

	static WebDriver driver;

	public static void main(String[] args) {
		//webelement ---> sendKeys

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

		//get the first name locator.
		WebElement firstName = driver.findElement(By.id("input-firstname"));
		WebElement lastName = driver.findElement(By.id("input-lastname"));

		//this is the value we need to pass in first name.
		String FN = "Testing";
		firstName.sendKeys(FN);//returns void

		//send multiple values in send keys
		//Send keys accept char sequence interface which takes in array as argument.

		String LN = "Automation";
		firstName.sendKeys(FN, LN);

		//we can pass string builder and buffer also in send keys.

		StringBuilder sb = new StringBuilder("Selenium");
		StringBuffer sbf = new StringBuffer("Learning");

		//pass in first name, space, comma, no space, last name, buffer and builder.
		firstName.sendKeys(FN,",",LN,",",sb,",",sbf, " ", "");
		//TestingTestingAutomationTesting,Automation,Selenium,Learning 

		//pass null and see.
		//all lines above error run.
		//Exception in thread "main" java.lang.IllegalArgumentException: 
//		Keys to send should be a not null CharSequence
//		at org.openqa.selenium.remote.RemoteWebElement.sendKeys(RemoteWebElement.java:92)
//		at seleniumbatch.SendKeysConcept.main(SendKeysConcept.java:42)
		lastName.sendKeys(null);

	}

}
