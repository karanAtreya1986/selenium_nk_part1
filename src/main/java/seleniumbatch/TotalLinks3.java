package seleniumbatch;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalLinks3 {

	public static void main(String[] args) {

		// find total number of links on the page
		// print the text of each link on the console if text is not empty
		// html tag = <a>

		//lets test if find elements method works.

		WebDriver driver = new ChromeDriver();
		//open amazon or flipkart.
		driver.get("https://www.flipkart.com/");

		//get all links from amazon.
		By links = By.tagName("a");

		//create util object.
		ElementUtil elUtil = new ElementUtil(driver);

		//if size greater than 300 then print pass.
		if(elUtil.getElementsCount(links) > 300) {
			System.out.println("proper links are present -- PASS");
		}

		//		element count ==>428
		//				proper links are present -- PASS

		System.out.println("----------------");
		System.out.println("test other methods created");

		//check if corporate link present in footer then pass.
		List<String> linksTextList = elUtil.getElementTextList(links);
		if(linksTextList.contains("Corporate Information")) {
			System.out.println("PASS");
		}
//PASS

	}

}
