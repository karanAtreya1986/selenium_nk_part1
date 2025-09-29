package seleniumbatch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DirectWithDoubleSlash {
	
	public static void main(String[] args) {
		
		//direct and indirect child can be accessed with double slash.
		
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/karan/Desktop/karan.html");
		
		WebElement element = driver.findElement(By.xpath("//div[@id='container']//ul//li"));
		System.out.println(element);
		//[[ChromeDriver: chrome on windows (a8990a96c1f7211e0c1eb7949bc50feb)] 
		//-> xpath: //div[@id='container']//ul//li]
		String text = element.getText();
		System.out.println(text);//Item 1

	}

}
