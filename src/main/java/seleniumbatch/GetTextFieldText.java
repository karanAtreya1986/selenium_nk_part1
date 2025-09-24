package seleniumbatch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextFieldText {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		//find email field.
		WebElement emailIDEle = driver.findElement(By.id("input-email"));

		//enter in email box.
		emailIDEle.sendKeys("pop@selenium.com");

		//try getting what you entered.
		String text = emailIDEle.getText();
		System.out.println(text); //output is blank

		//even dom attribute doesnt work.
//		String emailID = emailIDEle.getDomAttribute("value");
//		System.out.println(emailID); //output is blank

		//get dom property works.
		String emailID = emailIDEle.getDomProperty("value");
		System.out.println(emailID); //pop@selenium.com


	}

}
