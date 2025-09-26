package seleniumbatch;

import java.util.ArrayList;
import java.util.List;

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

	//************ find element utils****************//
	//Util method created to capture all elements from list and store in our own array list
	public List<String> getElementTextList(By locator) {
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
	public int getElementsCount(By locator) {
		int eleCount = getElements(locator).size();
		System.out.println("element count ==>" + eleCount);
		return eleCount;
	}
	//
	//Generic method for find elements and iterating over them
	public List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}

	//utility method to check if exactly one element is present of that type.
	public boolean checkElementDisplayed(By locator) {
		if(getElements(locator).size() == 1) {
			System.out.println("element : " + 
					locator + " is displayed on the page one time");
			return true;
		}
		return false;
	}

	//this can help us check if the specific element will only come
	//that many number of times.
	public boolean checkElementDisplayed(By locator, int expElementCount)
	{
		if(getElements(locator).size() == expElementCount) {
			System.out.println("element : " + locator + " is displayed on the page "+
					expElementCount + " times");
			return true;
		}
		return false;
	}
	
	public void clickElement(By locator, String value) {
		List<WebElement> eleList = driver.findElements(locator);
		System.out.println("total number of elements: " + eleList.size());
		for (WebElement e : eleList) {
			String text = e.getText();
			System.out.println(text);
			if (text.contains(value)) {
				e.click();
				break;
			}
		}
	}
}
