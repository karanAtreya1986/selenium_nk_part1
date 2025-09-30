package seleniumbatch;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class WebTableWithRelativeLocators {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		
		Thread.sleep(4000);

		WebElement username = driver.findElement(By.linkText("Joe.Root"));
		
		driver.findElement(with(By.id("ohrmList_chkSelectRecord_21")).toLeftOf(username)).click();
		
		List<WebElement> eleList = driver.findElements(with(By.tagName("td")).toRightOf(username));
		
		for(WebElement e : eleList) {
			String text = e.getText();
			System.out.println(text);
		}
		
		
		
	}

}
