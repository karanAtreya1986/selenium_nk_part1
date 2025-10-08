package seleniumbatch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalLinks1 {
	
	static WebDriver driver;
	
	public static void main(String[] args) {
		driver=new ChromeDriver();
//		driver.get("https://classic.crmpro.com/");
		driver.get("https://www.freshworks.com/");
		
//		driver.findElements(By.tagName("a"))
//		.stream()
//		.filter(e->!e.getText().isEmpty())
//		.forEach(e->System.out.println(e.getText()));
		
		//parallel streams for faster processing.
//		driver.findElements(By.tagName("a"))
//		.parallelStream()
//		.filter(e->!e.getText().isEmpty())
//		.forEach(e->System.out.println(e.getText()));
		
		//Create list and store data using streams-
		//Introducing list collection in between streams.

		List<String> linksList=new ArrayList<String>();
		
//		driver.findElements(By.tagName("a"))
//		.stream().filter(e->!e.getText().isEmpty())
//		.map(e->linksList.add(e.getText()));
		
		//remove filter and just do basic extraction if it works.
		//still we get []
//		driver.findElements(By.tagName("a"))
//		.stream()
//		.map(e->linksList.add(e.getText()));
//		
//		System.out.println(linksList); //[] 
		
		//lets collect it in list.
		List<WebElement> linksAllList = driver.findElements(By.tagName("a"))
		.stream().filter(e->!e.getText().isEmpty())
		.collect(Collectors.toList());
		//then add to our list.
		linksAllList.forEach(e->linksList.add(e.getText()));
		//print our list
		System.out.println(linksList); //gives all link names
		
	}

}
