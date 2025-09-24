package seleniumbatch;

import javax.management.RuntimeErrorException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementUtil {

	//Create constructor to access this class.

	private WebDriver driver;

	public ElementUtil(WebDriver driver) {
		this.driver = driver;
	}

//	public void doSendKeys(By locator, String value) {
//		//add null check.
//		if(value==null) {
//			throw new RuntimeException("==value cant be null==");
//		}
//		getElement(locator).sendKeys(value);
//	}
	
	public void doSendKeys(By locator, String value) {
		//calling inbuilt null check.
		nullCheck(value);
		getElement(locator).sendKeys(value);
	}
	
	//overloading to include buffer and builder.
//	public void doSendKeys(By locator, CharSequence... value) {
//		//add null check.
//		if(value==null) {
//			throw new RuntimeException("==value cant be null==");
//		}
//		getElement(locator).sendKeys(value);
//	}
	
	public void doSendKeys(By locator, CharSequence... value) {
		//calling in built null check
		nullCheck(value);
		getElement(locator).sendKeys(value);
	}

	public WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public void doClick(By locator) {
		getElement(locator).click();
	}
	
	public String doElementGetText(By locator) {
		String eleText = getElement(locator).getText();
		System.out.println("element text =>" + eleText);
		return eleText;
	}
	
//	public String getElementDomAttributeValue(By locator, String attrName) {
//		return getElement(locator).getDomAttribute(attrName);
//	}
//	
//	public String getElementDomPropertyValue(By locator, String propName) {
//		return getElement(locator).getDomProperty(propName);
//	}
	
	//update for null checks.
	public String getElementDomAttributeValue(By locator, String attrName) {
		nullCheck(attrName);
		return getElement(locator).getDomAttribute(attrName);
	}
	
	//update for null checks.
	public String getElementDomPropertyValue(By locator, String propName) {
		nullCheck(propName);
		return getElement(locator).getDomProperty(propName);
	}
	
	//internal private method for null check.
	private void nullCheck(CharSequence...value) {
		if(value==null) {
			throw new RuntimeException("==value cannot be null==");
		}
	}
	
	public boolean isElementDisplayed(By locator) {
		try {
			return getElement(locator).isDisplayed();
		}catch(Exception e) {
			System.out.println("element is not present on page");
			return false;
		}
	}
}
