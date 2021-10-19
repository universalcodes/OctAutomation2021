package seleniumtopics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass extends SeleniumBrowserSetup{
	
	
	
	public static void actionCalls () throws InterruptedException
	{
	String  amazonURL = "https://www.amazon.in/";
	browsersetup.get(amazonURL);

	
	Thread.sleep(20000);

	
	
	WebElement amazonhiddenelement_click = browsersetup.findElement(By.xpath("(//span[contains(text(),'All')])[2]"));

	Actions hideclick = new Actions(browsersetup);
	hideclick.moveToElement(amazonhiddenelement_click).click();
	
	Thread.sleep(10000);
	
	System.out.println("Actions Perfromed");
	
	
	}
	
	
	//span[text()= 'All']
	
	
	//(span[text()='All'])[2]
	
	
//	(//span[contains(text(),'All')])[2]
	
//(span[contains(text(),'All')])[2]

}
