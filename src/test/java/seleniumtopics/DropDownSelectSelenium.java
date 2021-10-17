package seleniumtopics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DropDownSelectSelenium extends SeleniumBrowserSetup{
	
	
	
	public static void dropdowntest() throws InterruptedException
	{
	
	String urll = "https://qainfotech.com/";
	
	browsersetup.get(urll);
	
	browsersetup.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
	
	WebDriverWait wait = new WebDriverWait(browsersetup, 30);
	
	browsersetup.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);

	
	
	WebElement selectdrop_down = browsersetup.findElement(By.name("location"));
	
	Select dropdown_data = new Select(selectdrop_down);
	
	Thread.sleep(20000);

	/*
	 * dropdown_data.selectByIndex(4);
	 */	
	/*
	 * dropdown_data.selectByValue("Asia");
	 */
	
	dropdown_data.selectByVisibleText("South America");
	
	
	

	
	System.out.println("South America is Selected");
	
	
	dropdown_data.deselectAll();
	
	System.out.println("Deleselected values");
	
	
	
	
	
	}
}
	
