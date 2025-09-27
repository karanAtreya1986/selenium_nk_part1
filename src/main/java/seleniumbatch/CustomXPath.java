package seleniumbatch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomXPath {
	
public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		
		//xpath: address of the element in html dom
		//not an attribute
		
		//1. absolute xpath: /
		// /html/body/div/div[2]/ul/li[2]/div/div/input
		
		//2. relative xpath/custom xpath: //
		
		//htmltag[@attr='value']
		//input[@name='email']
		//input[@placeholder='E-Mail Address']
		//input[@value='Login']
		
		//htmltag[@attr1='value' and @attr2='value']
		//input[@name='email' and @type='text']
		//input[@name='email' and @type='text' and @placeholder='E-Mail Address']

		//input[@name and @type and @placeholder]
		
		
		//parent to child:
		//direct: / --> only direct
		//indirect: // --> direct+indirect
		
		//form/input --> 3
		//form//input --> 5
		//div[@id='content']/h1
		//div[@id='content']/form//input[@id='input-firstname']
		
		//select[@id='Form_getForm_Country']/option
		
		//footer:
				//footer//h5
				//footer//a
		
		//text(): p, links, label, span, div, header h1 h2 h3
		//htmltag[text()='value']
		//h2[text()='New Customer']
		//h2[text()='Returning Customer']
		//a[text()='Register']
		//label[text()='E-Mail Address']
		
		//text() and attribute:
		//htmltag[@attr='value' and text()='value']
		//label[@for='input-email' and text()='E-Mail Address']
		//a[@class='list-group-item' and text()='Address Book']
		
		//htmltag[text()='value' and @attr='value']
		
		//htmltag[@attr1='value' and @attr2='value' and text()='value']

		
		//contains(): partial attribute , partial text value
		
		
		//htmltag[contains(text(),'value')]
		//h2[contains(text(),'Returning')]
		//h2[contains(text(),'New')]
		//p[contains(text(),'shop faster')]
		
		//htmltag[contains(@attr,'value')]
		//input[contains(@placeholder,'E-Mail')]
		
		//htmltag[contains(@attr,value) and contains(text(),'value')]
		//a[contains(@href,'account/order') and contains(text(),'Order')]
		
		//htmltag[contains(@attr1,'value') and @attr2='value']
		//a[contains(@href,'account/recurring') and @class='list-group-item']
		
		//htmltag[contains(@attr1,'value') and @attr2='value' and contains(text(),'value')]
		//a[contains(@href,'account/recurring') and @class='list-group-item' and contains(text(),'Recurring')]
		//a[contains(@href,'?route=account/recurring') and @class='list-group-item' and contains(text(),'Recurring')]
		

		//dynamic attributes/text:
		
//		<input id="firstname_123">
//		<input id="firstname_345">
//		<input id="firstname_567">
		
//		<input name="first678name">
//		<input name="first908name">
		
//		By.id("firstname_123"); //wont work
//		By.xpath("//input[contains(@id,'firstname_')]");
		
		//<div>your order id is 12345</div>
//		By order = By.xpath("//a[contains(text(),'your order id is')]");
		//String orderText = driver.findElement(order).getText();
		// orderText = your order id is 12345
		
		//starts-with():
		//htmltag[starts-with(@attr,'value')]
		//input[starts-with(@placeholder,'E-Mail')]
		
		//htmltag[starts-with(text(),'value')]
		//p[starts-with(text(),'By creating an account')]
		
		
		//starts-with() and contains()
		//htmltag[starts-with(text(),'value') and contains(@attr,'value')]
		//a[starts-with(text(),'Recurring') and contains(@href,'?route=account/recurring')]
		
		//ends-with(): NA in xpath:
		
		
		//index in xpath:
//		Write the xpath for forgotpassword. in naveen webpage
		// (//a[text()='Forgotten Password'])[2]
		//driver.findElement(By.xpath("(//a[text()='Forgotten Password'])[2]")).click();
		
		//naveen webpage.
		//register page.
		//capture all text box.
		// (//form//input[@class='form-control'])[1]
		// (//form//input[@class='form-control'])[position()=1]
		
		// (//form//input[@class='form-control'])[last()]
		// (//form//input[@class='form-control'])[last()-1]
		// (//form//input[@class='form-control'])[position()=last()]
		
		//capture group:
		//click help link on amazon home page footer.
		// ((//div[contains(@class,'navFooterLinkCol')])[last()]//a)[last()]
		// ((//div[contains(@class,'navFooterLinkCol')])[last()]//a)[last()-1]
		
		//Click on the first link on the last column in amazon footer.
		// ((//div[contains(@class,'navFooterLinkCol')])[last()]//a)[1]
		
		//click on the help link.
		boolean b1 = driver.findElement
				(By.xpath("((//div[contains(@class,'navFooterLinkCol')])[last()]//a)[last()]"))
					.isDisplayed();
		System.out.println(b1);
		
		//Check the right hand side link in naveen-
		//Check if first link is login and last is returns.
		// (//a[@class='list-group-item'])[last()]
		
         //Last option for country in orange hrm
		// (//select[@id='Form_getForm_Country']/option)[last()]
		
		

	}

}
