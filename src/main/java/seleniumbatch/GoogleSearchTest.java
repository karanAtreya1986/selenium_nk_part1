package seleniumbatch;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchTest {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://www.google.com/");

		//send values inside search box.
		driver.findElement(By.name("q")).sendKeys("Selenium Automation");

		//wait for sometime for values to appear.
		Thread.sleep(3000);

		//capture all values returned.
		List<WebElement> suggList = driver.findElements(By.xpath("//div[@class='wM6W7d']/span"));

		System.out.println(suggList.size());

		for(WebElement e : suggList) {
			String text = e.getText();
			System.out.println(text);
		}

		/**
		 * 13
selenium automation
selenium automation framework
selenium automation testing
selenium automation testing interview questions
selenium automation practice websites
selenium automation interview questions
selenium automation testing jobs in pune for freshers
selenium automation testing courses
selenium automation testing jobs in pune
selenium automation testing with java
		 */
		
		System.out.println("----------------------");
		
		//click on python text
		for(WebElement e : suggList) {
			String text = e.getText();
			System.out.println(text);
			if(text.contains("testing jobs")) {
				e.click();
				break;
			}
		}

	}

}
