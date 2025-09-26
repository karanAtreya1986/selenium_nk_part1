package seleniumbatch;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsUseCases {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		// WebElement ele = driver.findElement(By.id("input-email11"));
		// NoSuchElementException : NSE
		// when there is find element and element not found.

		//find elements wont throw no such element when there is no element.
		//it will give zero for size and blank for list.
		//		List<WebElement> eleList = driver.findElements(By.className("test-naveen"));
		//		System.out.println(eleList);
		//		System.out.println(eleList.size());

		// []
		// 0

		//find elements can also work with one element.
		List<WebElement> eleList = driver.findElements(By.id("input-email"));
		System.out.println(eleList.size()); //1


		//lets call the util methods.
		//check if email id field is present.
		System.out.println("-----util method called----");
		 By emailId = By.id("input-email");
		
		 System.out.println(checkElementDisplayed(emailId));
//		 element : By.id: input-email is displayed on the page one time
//		 true
		 
		 System.out.println("------------------------");
		 //validate with the overloaded method.
		 //forgot password comes multiple times.
		 By forgotPwdLink = By.linkText("Forgotten Password");
		
		 if(checkElementDisplayed(forgotPwdLink, 2)) {
		 System.out.println("forgot pwd is coming 2 times on the page");
		 }
		 
		 //element : By.linkText: Forgotten Password is displayed on the page 2 times
		 //forgot pwd is coming 2 times on the page
		 
	}
		//utility method to check if exactly one element is present of that type.
		public static boolean checkElementDisplayed(By locator) {
			if(getElements(locator).size() == 1) {
				System.out.println("element : " + 
			locator + " is displayed on the page one time");
						return true;
			}
			return false;
		}
		
		//overload the above method.
		//this can help us check if the specific element will only come
		//that many number of times.
		 public static boolean checkElementDisplayed(By locator, int expElementCount)
		 {
		 if(getElements(locator).size() == expElementCount) {
		 System.out.println("element : " + locator + " is displayed on the page "+
		 expElementCount + " times");
		 return true;
		 }
		 return false;
		 }
		
		
		
		public static List<WebElement> getElements(By locator) {
			return driver.findElements(locator);
		}
	}


