package seleniumbatch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DirectWithDoubleSlash2 {
	
	public static void main(String[] args) {
		
		//direct and indirect parent can be accessed with double slash.
		
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/karan/Desktop/karan.html");
		
		WebElement element = driver.findElement(By.xpath("//div[@id='container']//ul//li//span//parent::li//parent::ul"));
		System.out.println(element);
		//[[ChromeDriver: chrome on windows (98a3bc07aea509a22754aed69b58d37f)] -> xpath: //div[@id='container']//ul//li//span//parent::li//parent::ul]
		String text = element.getText();
		System.out.println(text);
		//Item 1
		//Item 2
		//Item 3

	}

}
