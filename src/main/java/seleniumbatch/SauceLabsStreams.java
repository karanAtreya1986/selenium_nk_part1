package seleniumbatch;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SauceLabsStreams {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/index.html");

		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();

		List<WebElement> pricesList = driver.findElements(By.cssSelector("div.inventory_item_price"));

		//        pricesList.stream().forEach(e -> System.out.println(e.getText()));

		//capture the value and ignore dollar.
		//        pricesList.stream().
		//        map(e->Double.parseDouble(e.getText().substring(1)))
		//        .forEach(e->System.out.println(e));

		//        //sort in ascending order and collect.
		//        List<Double> sorted_prices = pricesList.stream().
		//        map(e->Double.parseDouble(e.getText().substring(1)))
		//        .sorted()
		//        .collect(Collectors.toList());
		//        
		//        System.out.println(sorted_prices);

		//sort in descending order and collect.
		//        List<Double> sorted_prices = pricesList.stream().
		//        map(e->Double.parseDouble(e.getText().substring(1)))
		//        .sorted(Comparator.reverseOrder())
		//        .collect(Collectors.toList());
		//        
		//        System.out.println(sorted_prices);

		//capture the first price.
		//capital D in double or small D in double also works.
		//		Double firstPrice = pricesList.stream().
		//				map(e->Double.parseDouble(e.getText().substring(1)))
		//				.findFirst().get();
		//
		//		System.out.println(firstPrice);

		//capture last value using reduce.
		//capital D in double or small D in double also works.
		//		Double lastPrice = pricesList.stream().
		//				map(e->Double.parseDouble(e.getText().substring(1)))
		//				.reduce((first, second)->second).get();
		//		
		//		System.out.println(lastPrice);

		//get the max price.
		//		Double maxPrice = pricesList.stream().
		//		map(e->Double.parseDouble(e.getText().substring(1)))
		//		.max(Double::compareTo).get();
		//		System.out.println(maxPrice);

		//get the min price.
		Double minPrice = pricesList.stream().
				map(e->Double.parseDouble(e.getText().substring(1)))
				.min(Double::compareTo).get();
		System.out.println(minPrice);

	}
}
