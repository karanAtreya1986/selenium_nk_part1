package seleniumbatch;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectMultiSelectionDropDown {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://html.com/attributes/select-multiple/");
		
		WebElement dropDownEle = driver.findElement(By.xpath("//select[@multiple]"));
		
		Select select = new Select(dropDownEle);
		//multiple attr should be there
		System.out.println(select.isMultiple());//true
		
		List<WebElement> selectedOptiobsList = select.getAllSelectedOptions();
		System.out.println(selectedOptiobsList.size());	//0

		
		if(select.isMultiple()) {
			System.out.println("multi selection is possible...");
			
			select.selectByVisibleText("American flamingo");
			select.selectByVisibleText("Chilean flamingo");
			select.selectByVisibleText("Lesser flamingo");
			select.selectByVisibleText("James's flamingo");
			
			selectedOptiobsList = select.getAllSelectedOptions();
			System.out.println(selectedOptiobsList.size());	//4

		}
		
		
//		select.deselectByVisibleText("Lesser flamingo");
//		select.deselectAll();
		
		
	}

}