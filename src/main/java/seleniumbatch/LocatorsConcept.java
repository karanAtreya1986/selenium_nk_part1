package seleniumbatch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsConcept {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

		//1. id: unique attribute: - I
		driver.findElement(By.id("input-firstname")).sendKeys("Java");

		//2. name: attribute: can be duplicate - II
		driver.findElement(By.name("lastname")).sendKeys("testing");

		//3. class name: attribute: can be duplicate (most of the time) -- III (should be unique)
		//driver.findElement(By.className("form-control")).sendKeys("java@gmail.com");
		//img-responsive --> 1 of 1 --> we should get this in console for unique locators.
		//form-control: 1 of 7 : 

		//		Click on image in the webpage-
		//driver.findElement(By.className("img-responsive")).click();

		//Enter email and phone using xpath
		//4. xpath: is not attribute. address of the element in the DOM
		//dynamic elements handling
		driver.findElement(By.xpath("//*[@id=\"input-telephone\"]")).sendKeys("98765432123");
		driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("test@gmail.com");

		//		Enter password using css selector
		//		Enter confirm password using css selector
		//5. cssSelector: is not attribute.
		//dynamic elements handling
		driver.findElement(By.cssSelector("#input-password")).sendKeys("test@123");
		driver.findElement(By.cssSelector("#input-confirm")).sendKeys("test@123");

		//		Link text
		//		Click delivery information in footer
		//6. linkText: only for links:
		//htmltag: <a>
		driver.findElement(By.linkText("Deliver Information")).click();

		//Click login and forgot password
		//When you see <a> tag then we can use link text else no.
		driver.findElement(By.linkText("Login")).click();
		//driver.findElement(By.linkText("Forgotten Password")).click();

		//		Partial link text
		//		Only for links
		//		With <a> tag
		//		Forgot password element

		//7. partialLinkText: only for links:
		//driver.findElement(By.partialLinkText("Forgotten")).click();

		//		Tagname-
		//		Pass html tag
		//		New customer element
		//		Capture text using get text method
		//		Returns string
		//8. tagName:
		//		String header = driver.findElement(By.tagName("h2")).getText();
		//		System.out.println(header);

		//Call generic method within same class
		By header = By.tagName("h2");

		String actHeader = doElementGetText(header);
		if(actHeader.equals("New Customer")) {
			System.out.println("header is correct -- PASS");
		}

	}

	//try for generic get text method.
	public static String doElementGetText(By locator) {
		String eleText = getElement(locator).getText();
		System.out.println("element text =>" + eleText);
		return eleText;
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);	
	}

}
