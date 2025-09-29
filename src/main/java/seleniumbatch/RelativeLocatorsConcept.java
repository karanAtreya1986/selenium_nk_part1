package seleniumbatch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class RelativeLocatorsConcept {

	public static void main(String[] args) throws InterruptedException {
		//selenium 4.x: RelativeLocator : with
		
//					  above
//						|	
//			left <---   ele  ---> right
//						|
//					  below
		//near ele
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.aqi.in/dashboard/canada");
		Thread.sleep(8000);

		
		WebElement ele = driver.findElement(By.xpath("//section[contains(@class,'polluted-cities-list')]//p[text()='Hamilton']"));
		
		String leftRank = driver.findElement(with(By.tagName("p")).toLeftOf(ele)).getText();
		System.out.println(leftRank);
		
		
		String rightAQIStatus = driver.findElement(with(By.cssSelector("div.aqi-status")).toRightOf(ele)).getText();
		System.out.println(rightAQIStatus);
		
		String rightAQILevel = driver.findElement(with(By.cssSelector("div.aqi-level")).toRightOf(ele)).getText();
		System.out.println(rightAQILevel);

		
		String aboveCity = driver.findElement(with(By.tagName("p")).above(ele)).getText();
		System.out.println(aboveCity);
		
		String belowCity = driver.findElement(with(By.tagName("p")).below(ele)).getText();
		System.out.println(belowCity);


		String nearEleText = driver.findElement(with(By.tagName("div")).near(ele)).getText();
		System.out.println(nearEleText);
		
		
		
	}

}