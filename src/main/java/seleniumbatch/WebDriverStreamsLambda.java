package seleniumbatch;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverStreamsLambda {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");

		List<WebElement> allLinks = driver.findElements(By.tagName("a"));

		//prints all internal ids of webelements.
		//		allLinks.stream().forEach(e->System.out.println(e));

		//		allLinks.stream().forEach(e->System.out.println(e.getText()));

		//ignore empty links and print only valid ones.
		//		allLinks.stream()
		//		.filter(e->!e.getText().isEmpty())
		//		.forEach(e->System.out.println(e.getText()));

		//apply as many filters as you want.
		//word starts with flipkart.
		//		allLinks.stream()
		//		.filter(e->!e.getText().isEmpty())
		//		.filter(e->e.getText().startsWith("Flipkart"))
		//		.forEach(e->System.out.println(e.getText()));

		//collect in list.
		List<WebElement> flpkartLinks = allLinks
				.stream()
				.filter(e -> !e.getText().isEmpty())
				.filter(e -> e.getText().startsWith("Flipkart"))
				.collect(Collectors.toList());

		//If we try to print the list of webelement- we get the internal webelement id and the locator-
		//		System.out.println(flpkartLinks);

		List<String> flpkartLinksText = flpkartLinks.stream()
				.map(e -> e.getText())
				.collect(Collectors.toList());

		System.out.println(flpkartLinksText);
		System.out.println(flpkartLinksText.size());




	}
}
