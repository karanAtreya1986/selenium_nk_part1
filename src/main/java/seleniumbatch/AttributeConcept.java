package seleniumbatch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AttributeConcept {
	
	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		//locator for first name field.
		WebElement firstName = driver.findElement(By.id("input-firstname"));
		
		//get the value present in placeholder attribute.
//		String placeholderVal = firstName.getAttribute("placeholder");//deprecated
//		System.out.println(placeholderVal); //First Name

		
		//new method in market to get the attribute value.
		String placeholderVal = firstName.getDomAttribute("placeholder");
		System.out.println(placeholderVal); //First Name
	
		//get the tagname for the firstname field.
		String tagName = firstName.getDomProperty("tagName");
		System.out.println(tagName); //INPUT
		
		//tried to get values from styles section inside dom.
		String height = firstName.getDomProperty("font-size");
		System.out.println(height); //null
	
		//check if continue button is disabled or not.
		String isDisabled = driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[2]")).getDomProperty("disabled");
		System.out.println(isDisabled); //false
		
		//get one more property called default value for continue button.
		String defaultValue = driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[2]")).getDomProperty("defaultValue");
		System.out.println(defaultValue); //Continue

//		//webelement: 
//		//1. DOM attribute
//		//2. property:
//		
	}

		//utility checks.
	public static String getElementDomAttributeValue(By locator, String attrName) {
		return getElement(locator).getDomAttribute(attrName);
	}
	
	public static String getElementDomPropertyValue(By locator, String propName) {
		return getElement(locator).getDomProperty(propName);
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);	
	
	}
}
