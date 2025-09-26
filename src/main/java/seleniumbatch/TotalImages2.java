package seleniumbatch;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalImages2 {
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		
		//captures all images.
		List<WebElement> imagesList = driver.findElements(By.tagName("img"));
		
		System.out.println("total images:" + imagesList.size());
		
		for(WebElement e : imagesList) {
			//web scraping
			//Get the alt attribute and source attribute value-
			String altVal = e.getDomAttribute("alt");
			String srcVal = e.getDomAttribute("src");
			
			System.out.println(altVal + " : " + altVal);
			System.out.println(srcVal + " : " + srcVal);
			
			// : 
			//https://fls-na.amazon.com/1/oc-csi/1/OP/requestId=ARV6Q9RHMCD349MWKBRD&js=1 : 
			//https://fls-na.amazon.com/1/oc-csi/1/OP/requestId=ARV6Q9RHMCD349MWKBRD&js=1

		}
		
		
	}

}
