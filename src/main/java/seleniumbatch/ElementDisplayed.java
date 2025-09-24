package seleniumbatch;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementDisplayed {

	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

		//locator for first name field.
		//		WebElement firstName = driver.findElement(By.id("input-firstname11"));

		//		boolean b1 = firstName.isDisplayed();	
		//		System.out.println(b1);
		//		Exception in thread "main" org.openqa.selenium.NoSuchElementException: 
		//			no such element: Unable to locate element: 
		//			{"method":"css selector","selector":"#input\-firstname11"}
		//		  (Session info: chrome=140.0.7339.186)

		//		give wrong locator and check exception.
		//		boolean b1 = driver.findElement(By.id("input-firstname11")).isDisplayed();
		//		System.out.println(b1);

		//Exception in thread "main" org.openqa.selenium.NoSuchElementException: 
		//		no such element: Unable to locate element: 
		//		{"method":"css selector","selector":"#input\-firstname11"}
		//		  (Session info: chrome=140.0.7339.186)

		//lets tweak code and check if exception seen.
		//		boolean b1=driver.findElement(By.id("input-firstname11")).isDisplayed();
		//		System.out.println(b1);
		//		Exception in thread "main" org.openqa.selenium.NoSuchElementException: 
		//			no such element: Unable to locate element: 
		//			{"method":"css selector","selector":"#input\-firstname11"}
		//		  (Session info: chrome=140.0.7339.186)

		//pass invalid first name locator.
		//		By fn = By.id("input-firstname11");
		//		
		//		if (isElementDisplayed(fn)) {
		//			System.out.println("ele is displayed - PASS");
		//		} else {
		//			System.out.println("ele is not displayed - FAIL");
		//		}

		//because the element is not identifiable before isdisplayed is called.
		//we get no such element exception.
		//Exception in thread "main" org.openqa.selenium.NoSuchElementException: 
		//no such element: Unable to locate element: 
		//{"method":"css selector","selector":"#input\-firstname11"}
		//(Session info: chrome=140.0.7339.186)
		//Is displayed is dangerous method. We need to use exception handling. 
		//This is because if isdisplayed is false then program terminates abruptly.

		//pass right first name locator.
		//ele is displayed - PASS
		//		By fn = By.id("input-firstname");
		//
		//		if (isElementDisplayed(fn)) {
		//			System.out.println("ele is displayed - PASS");
		//		} else {
		//			System.out.println("ele is not displayed - FAIL");
		//		}

		//pass invalid method to the new try catch method.
		//we will still get error because getelement will throw the exception.
		//		Exception in thread "main" org.openqa.selenium.NoSuchElementException: 
		//			no such element: Unable to locate element: 
		//			{"method":"css selector","selector":"#input\-karan"}
		//		  (Session info: chrome=140.0.7339.186)
		//		By fn = By.id("input-karan");
		//
		//		if (isElementDisplayed(fn)) {
		//			System.out.println("ele is displayed - PASS");
		//		} else {
		//			System.out.println("ele is not displayed - FAIL");
		//		}

		//now use the two new try catch methods.
		//this also throws error.
		//Exception in thread "main" org.openqa.selenium.NoSuchElementException:
		//		no such element: Unable to locate element:
		//		{"method":"css selector","selector":"#input\-karan"}
		//		  (Session info: chrome=140.0.7339.186)

		//		Your catch (NoSuchElementException e) was too narrow. 
		//		Selenium’s findElement() sometimes throws wrapped/remote 
		//		exceptions that don’t map exactly to NoSuchElementException 
		//		until later in the stack trace. That’s why the catch never triggered.
		//		Use catch (Exception e) (or Selenium’s WebDriverException) 
		//		for more reliable handling.
		//		By fn = By.id("input-karan");
		//
		//		if (isElementDisplayed(fn)) {
		//			System.out.println("ele is displayed - PASS");
		//		} else {
		//			System.out.println("ele is not displayed - FAIL");
		//		}

		//update method for more broader exception type.
		//used exception class.
		//		element is not present on page
		//		element is not present on page
		//		ele is not displayed - FAIL
		//		By fn = By.id("input-karan");
		//
		//		if (isElementDisplayed(fn)) {
		//			System.out.println("ele is displayed - PASS");
		//		} else {
		//			System.out.println("ele is not displayed - FAIL");
		//		}


		//update method for more broader exception type.
		//used exception class.
		//pass right locator.
		//ele is displayed - PASS
		By fn = By.id("input-firstname");

		if (isElementDisplayed(fn)) {
			System.out.println("ele is displayed - PASS");
		} else {
			System.out.println("ele is not displayed - FAIL");
		}


		//check if logo is displayed on home page.
		By logo = By.className("img-responsive");
		System.out.println(isElementDisplayed(logo)); //true

	}

	//	public static boolean isElementDisplayed(By locator) {
	//		return getElement(locator).isDisplayed();
	//	}

	//changed the displayed method to handle exceptions nicely.
	//	public static boolean isElementDisplayed(By locator) {
	//		try {
	//			return getElement(locator).isDisplayed();
	//		}catch(NoSuchElementException e) {
	////			e.printStackTrace();//this spoils output.
	//			System.out.println("element is not present on page");
	//			return false;
	//		}
	//	}

	//handle any exception.
	public static boolean isElementDisplayed(By locator) {
		try {
			return getElement(locator).isDisplayed();
		}catch(Exception e) {
			//			e.printStackTrace();//this spoils output.
			System.out.println("element is not present on page");
			return false;
		}
	}

	//	public static WebElement getElement(By locator) {
	//		return driver.findElement(locator);
	//	}

	//getelement also has to handle no such element exception.
	//	public static WebElement getElement(By locator) {
	//		try {
	//			return driver.findElement(locator);
	//		}catch(NoSuchElementException e) {
	////			e.printStackTrace();//this spoils output.
	//			System.out.println("element is not present on page");
	//			return null;
	//		}
	//		
	//	}

	//handle any exception.
	public static WebElement getElement(By locator) {
		try {
			return driver.findElement(locator);
		}catch(Exception e) {
			//			e.printStackTrace();//this spoils output.
			System.out.println("element is not present on page");
			return null;
		}

	}

}

