package seleniumbatch;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTablePagination {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");

		Thread.sleep(5000);

		// multi selection:
		while (true) {
			if (driver.findElements(By.xpath("//td[text()='Naveen']")).size() > 0) {
				System.out.println("country is found");
				selectMultipleCountry("Naveen");
			}

			// pagination logic: click next
			WebElement next = driver.findElement(By.cssSelector("button.next"));

			if (next.getDomAttribute("class").contains("disabled")) {
				System.out.println("pagination is over...");
				break;
			}

			next.click();
			Thread.sleep(1000);
		}

		// single selection:
//		while (true) {
//			if (driver.findElements(By.xpath("//td[text()='India']")).size() > 0) {
//				System.out.println("country is found");
//				selectCountry("India");
//				break;
//			} else {
//				// pagination logic:
//				// click on next
//				WebElement next = driver.findElement(By.cssSelector("button.next"));
//
//				if (next.getDomAttribute("class").contains("disabled")) {
//					System.out.println("pagination is over...country is not found...");
//					break;
//				}
//
//				next.click();
//				Thread.sleep(1000);
//			}
//
//		}

	}

	public static void selectMultipleCountry(String countryName) {
		List<WebElement> countryList = driver.findElements(
				By.xpath("//td[text()='" + countryName + "']/preceding-sibling::td/input[@type='checkbox']"));
		for (WebElement e : countryList) {
			e.click();
		}
	}

	public static void selectCountry(String countryName) {
		driver.findElement(By.xpath("//td[text()='" + countryName + "']/preceding-sibling::td/input[@type='checkbox']"))
				.click();
	}

}
