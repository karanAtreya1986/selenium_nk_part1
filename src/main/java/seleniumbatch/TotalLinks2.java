package seleniumbatch;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalLinks2 {

	public static void main(String[] args) {

		// find total number of links on the page
		// print the text of each link on the console if text is not empty
		// html tag = <a>

		//lets test if find elements method works.

		WebDriver driver = new ChromeDriver();
		//open amazon or flipkart.
		driver.get("https://www.amazon.com/");

		//get all links from amazon.
		By links = By.tagName("a");

		//create util object.
		ElementUtil elUtil = new ElementUtil(driver);

		//if size greater than 300 then print pass.
		if(elUtil.getElementsCount(links) > 300) {
			System.out.println("proper links are present -- PASS");
		}

//element count ==>2


	}

}
