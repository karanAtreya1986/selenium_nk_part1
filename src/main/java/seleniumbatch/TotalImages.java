package seleniumbatch;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalImages {
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		//captures all images.
		List<WebElement> imagesList = driver.findElements(By.tagName("img"));
		
		System.out.println("total images:" + imagesList.size()); //total images:67
		
//		for(WebElement e : imagesList) {
//			//web scraping
//			String altVal = e.getDomAttribute("alt");
//			String srcVal = e.getDomAttribute("src");
//			
//			System.out.println(altVal + " : " + srcVal);
//		}
		
		
	}

}
