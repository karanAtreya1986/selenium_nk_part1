package seleniumbatch;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionsRegisrtationFormFillWithTabSequence {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		
		WebElement firstName = driver.findElement(By.id("input-firstname"));
		
		Actions act = new Actions(driver);
		
		Action regFormAction = act.sendKeys(firstName, "Vishal")
			.pause(500)
			.sendKeys(Keys.TAB)
			.sendKeys("Mehta")
			.pause(500)
			.sendKeys(Keys.TAB)
			.sendKeys("vishal@gmail.com")
			.pause(500)
			.sendKeys(Keys.TAB)
			.sendKeys("8765432123")
			.pause(500)
			.sendKeys(Keys.TAB)
			.sendKeys("Mehta@123")
			.pause(500)
			.sendKeys(Keys.TAB)
			.sendKeys("Mehta@123")
			.pause(500)
			.sendKeys(Keys.TAB)
			.pause(500)
			.sendKeys(Keys.TAB)
			.pause(500)
			.sendKeys(Keys.TAB)
			.pause(500)
			.sendKeys(Keys.SPACE)
			.pause(500)
			.sendKeys(Keys.TAB)
			.pause(500)
			.sendKeys(Keys.ENTER)
			.pause(500)
				.build();
					
		//regFormAction.perform();
		
		performAction(regFormAction);
		
	}
	
	
	public static void performAction(Action action) {
		action.perform();
	}
	

}
