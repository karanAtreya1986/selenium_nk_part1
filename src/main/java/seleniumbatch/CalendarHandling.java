package seleniumbatch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarHandling {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");

		Thread.sleep(2000);

		driver.findElement(By.id("datepicker")).click();
		
		futureDate("April 2025", "23");

//		driver.findElement(By.linkText("25")).click();

	}
	
	
	/**
	 * 
	 * @param expMonthYear
	 * @param day
	 */
	public static void futureDate(String expMonthYear, String day) {
		
		if(expMonthYear.contains("February") && Integer.parseInt(day)>29) {
			System.out.println("wrong day is passed for February, please pass the day range between 1 to 29");
			return;
		}
		
		
		if(Integer.parseInt(day)>31) {
			System.out.println("wrong day is passed, please pass the day range between 1 to 31");
			return;
		}
		
		if(Integer.parseInt(day)<=0) {
			System.out.println("wrong day is passed, please pass the day range between 1 to 31");
			return;
		}
		
		
		
		String actMonthYear = driver.findElement(By.className("ui-datepicker-title")).getText();
		System.out.println(actMonthYear);//April 2025
		
		while(!actMonthYear.equalsIgnoreCase(expMonthYear)) {//July 2025 == July 2025
			//click on next icon:
			driver.findElement(By.xpath("//span[text()='Next']")).click();
			actMonthYear = driver.findElement(By.className("ui-datepicker-title")).getText();//July 2025
			System.out.println(actMonthYear);

		}
		
		driver.findElement(By.linkText(day)).click();
		
	}
	
	
	
	
	
	

}




