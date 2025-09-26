package seleniumbatch;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalMenuLinks {

	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		//Get all links in right hand side by their class name
		List<WebElement> menuLinksList = driver.findElements(By.className("list-group-item"));
		System.out.println(menuLinksList.size());
		//
		//		Click on forgot password link.
		//after that break the code.
		for(WebElement e : menuLinksList) {
			String text = e.getText();
			System.out.println(text);
			//Click on forgot password link
			if(text.equals("Forgotten Password")) {
				e.click();
				break;
			}
		}

		//		13
		//		Login
		//		Register
		//		Forgotten Password
		//		My Account
		//		Address Book
		//		Wish List
		//		Order History
		//		Downloads
		//		Recurring payments
		//		Reward Points
		//		Returns
		//		Transactions
		//		Newsletter

		//get all the class names with the links.
		By menuLinks = By.className("list-group-item");
		//check if 13 links are on right hand side.
		if (getElementsCount(menuLinks) == 13) {
			System.out.println("menu links count is correct -- PASS");
		} else {
			System.out.println("menu links count is not correct -- FAIL");
		}

		getElements(menuLinks); //gets the locator for all the links.

		//*************************
		//validating the static method.

		//locator for all the links on right side.
		List<String> actMenuList = getElementTextList(menuLinks);

		if(actMenuList.contains("My Account")) {
			System.out.println("PASS");
		}
		if(actMenuList.contains("Reward Points")) {
			System.out.println("PASS");
		}
		
//		Login
//		Register
//		Forgotten Password
//		My Account
//		Address Book
//		Wish List
//		Order History
//		Downloads
//		Recurring payments
//		Reward Points
//		Returns
//		Transactions
//		Newsletter
//		PASS
//		PASS

	}

	
	//Util method created to capture all elements from list and store in our own array list
	public static List<String> getElementTextList(By locator) {
		List<WebElement> eleList = getElements(locator);
		//store in array list.
		List<String> eleTextList = new ArrayList<String>();// pc=0; []
		for (WebElement e : eleList) {
			String text = e.getText();
			if (text.length() != 0) {
				System.out.println(text);
				eleTextList.add(text);
			}
		}
		return eleTextList;
	}
	//Size count method
	public static int getElementsCount(By locator) {
		int eleCount = getElements(locator).size();
		System.out.println("element count ==>" + eleCount);
		return eleCount;
	}
	//
	//Generic method for find elements and iterating over them
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}


}
