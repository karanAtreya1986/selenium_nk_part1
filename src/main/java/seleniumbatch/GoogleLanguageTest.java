package seleniumbatch;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleLanguageTest {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://www.google.com/");

		//get list of all languages shown.
		List<WebElement> langLinkList = driver.findElements(By.xpath("//div[@id='SIvCob']/a"));
		System.out.println(langLinkList.size()); //9
		//size returns int.

		//grab all the text of link and print it.
		for (WebElement e : langLinkList) {
			String text = e.getText();
			System.out.println(text);
		}


		//		हिन्दी
		//		বাংলা
		//		తెలుగు
		//		मराठी
		//		தமிழ்
		//		ગુજરાતી
		//		ಕನ್ನಡ
		//		മലയാളം
		//		ਪੰਜਾਬੀ


		System.out.println("-------------------");

		//click on the required text and break.
		//when marathi comes click on it and break.
		for (WebElement e : langLinkList) {
			String text = e.getText();
			System.out.println(text);
			if (text.equals("मराठी")) {
				e.click();
				break;
			}
		}

		//		हिन्दी
		//		বাংলা
		//		తెలుగు
		//		मराठी

		System.out.println("-----------------");
		//call the static method
		//when marathi comes click and exit.
		By langLocator = By.xpath("//div[@id='SIvCob']/a");
		clickElement(langLocator, "मराठी");
		
//		total number of elements: 9
//		English
//		हिन्दी
//		বাংলা
//		తెలుగు
//		தமிழ்
//		ગુજરાતી
//		ಕನ್ನಡ
//		മലയാളം
//		ਪੰਜਾਬੀ
	}
		//create utility and call it.
		public static void clickElement(By locator, String value) {
			List<WebElement> eleList = driver.findElements(locator);
			System.out.println("total number of elements: " + eleList.size());
			for (WebElement e : eleList) {
				String text = e.getText();
				System.out.println(text);
				if (text.equals(value)) {
					e.click();
					break;
				}
			}
		}
	
}
