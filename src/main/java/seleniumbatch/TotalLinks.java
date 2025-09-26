package seleniumbatch;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalLinks {

	public static void main(String[] args) {

		// find total number of links on the page
		// print the text of each link on the console if text is not empty
		// html tag = <a>

		WebDriver driver = new ChromeDriver();
		//open amazon or flipkart.
		driver.get("https://www.amazon.com/");

		List<WebElement> linkslist = driver.findElements(By.tagName("a"));
		System.out.println("total links " +linkslist.size()); //total links 2
		//size returns int.

		//print all the link names.
		// index loop:
		//get(index) returns web element.
		//To get the value, use get text method.
		for (int i = 0; i < linkslist.size(); i++) {
			String text = linkslist.get(i).getText();
			System.out.println(text);
		}
		//		Conditions of Use
		//		Privacy Policy

		//try printing the web element.
		for (int i = 0; i < linkslist.size(); i++) {
			System.out.println(linkslist);
		}
		//[[[ChromeDriver: chrome on windows (dc8b767e1139d1b15637add700d36c95)] 
		//		-> tag name: a], [[ChromeDriver: 
		//			chrome on windows (dc8b767e1139d1b15637add700d36c95)] -> tag name: a]]
		//		[[[ChromeDriver: chrome on windows (dc8b767e1139d1b15637add700d36c95)] -> 
		//		tag name: a], [[ChromeDriver: chrome on windows 
		//		                (dc8b767e1139d1b15637add700d36c95)] -> tag name: a]]


		//print index with its value.
		//print index if the text is not empty.
		for (int i = 0; i < linkslist.size(); i++) {
			String text = linkslist.get(i).getText();
			if (text.length() != 0) {
				System.out.println(i + "=" + text);
			}
		}
		//		0=Conditions of Use
		//				1=Privacy Policy


		//print webelement using for each.
		for (WebElement e : linkslist) {
			System.out.println(e);
		}
		//		[[ChromeDriver: chrome on windows (103f4908a8889bb658dfc88d4edb2029)] -> 
		//		tag name: a]
		//				[[ChromeDriver: chrome on windows 
		//				  (103f4908a8889bb658dfc88d4edb2029)] -> tag name: a]

		//print the values using for each.
		System.out.println("-----------------");

		for (WebElement e : linkslist) {
			String text = e.getText();
			if (text.length() != 0) {
				System.out.println(text);
			}
		}

		//		-----------------
		//		Conditions of Use
		//		Privacy Policy




	}

}
