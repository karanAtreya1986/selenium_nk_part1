package seleniumbatch;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class ClassicCRMStream {
	
	static WebDriver driver;

	public static void main(String[] args) {

		driver=new ChromeDriver();
		driver.get("https://classic.crmpro.com/");

		List<WebElement> paragraphs = driver.findElements(By.cssSelector("section#details p"));

		String allPara = paragraphs.stream().
				map(e->e.getText())
				.collect(Collectors.joining("\n"));

		//		System.out.println(allPara);

		//capture all headers only.

//		List<WebElement> headers = driver.findElements(By.cssSelector("section#details h3"));

		//		String allHeaders = headers.stream().
		//				map(e->e.getText())
		//				.collect(Collectors.joining("\n"));

		//change joining to pipe.
		//		String allHeaders = headers.stream().
		//				map(e->e.getText())
		//				.collect(Collectors.joining("||"));
		//		
		//		System.out.println(allHeaders);

		//get header name and tag name
		//get tag name returns string.
		//get text returns string.

//		headers.stream()
//		.forEach(e->System.out.println(e.getText()+ " -- " +e.getTagName()));
		
		//get headers and tag name without using variables.
//		driver.findElements(By.cssSelector("section#details h3"))
//		.stream()
//		.forEach(e->System.out.println(e.getText()+"----"+e.getTagName()));
		
		//call static generic methods.
		By headers=By.cssSelector("section#details h3");
		
		//further manipulation once we get the values.
		if(getHeadersList(headers).contains("Import & Export")) {
			System.out.println("Pass"); //Pass
		}
		else {
			System.out.println("Fail");
		}

	}
	
	//static method to get all headers.
	public static void printHeaders(By locator) {
		driver.findElements(locator)
		.stream()
		.forEach(e->System.out.println(e.getText()));
	}
	
	//get all headers generic method.
	public static List<String> getHeadersList(By locator) {
		return driver.findElements(locator)
				.stream()
				.map(e->e.getText())
				.collect(Collectors.toList());
	}

}
