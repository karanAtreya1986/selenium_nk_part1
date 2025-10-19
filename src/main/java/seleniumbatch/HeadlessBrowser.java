package seleniumbatch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.safari.SafariDriver;

public class HeadlessBrowser {
	
	public static void main(String[] args) {
		
		//chrome options.
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--headless");
		co.addArguments("--incognito");
		
//		WebDriver driver = new ChromeDriver();
//		WebDriver driver = new ChromeDriver(co);
		
		//if you dont pass co here then wont open in headless mode.
		
		//firefox options
		FirefoxOptions fo = new FirefoxOptions();
		fo.addArguments("--headless");
		
//		WebDriver driver = new ChromeDriver();
		
		WebDriver driver = new FirefoxDriver(fo);
		
		//safari doesnt have chrome options
		
		SafariDriver sfo=new SafariDriver();
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.quit();
	}

}
