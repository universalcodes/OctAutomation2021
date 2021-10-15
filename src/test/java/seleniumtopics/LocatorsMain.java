package seleniumtopics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.swing.text.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.InvalidSelectorException;
import org.openqa.selenium.WebElement;

public class LocatorsMain extends SeleniumBrowserSetup {

	public static void all_locators_name() {

		String letscode = "https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&";
		browsersetup.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);

		browsersetup.get(letscode);

		WebElement locate_email_by_name = browsersetup.findElement(By.name("email"));
		locate_email_by_name.click();

		locate_email_by_name.sendKeys("yogeshkamra25@gmail.com");
		locate_email_by_name.click();

		System.out.println("Clicking on Button by id");

		WebElement locate_email_by_id = browsersetup.findElement(By.id("continue"));
		locate_email_by_id.click();

		System.out.println("Clicked on button through id");

		WebElement locate_password_by_passwword = browsersetup.findElement(By.name("password"));
		locate_password_by_passwword.sendKeys("Yogesh@2021");

		try {

			WebElement locate_signin_by_id = browsersetup.findElement(By.id("signInSubmit"));
			locate_signin_by_id.click();

		}

		catch (ElementNotVisibleException e) {
			// TODO: handle exception
		}

	}

	public static void all_locators_xpathcontains() throws InterruptedException {
		/*
		 * browsersetup.get("	https://qainfotech.com");
		 * browsersetup.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS); //
		 * Xpath with Contains
		 * 
		 * 
		 * //or use text
		 * 
		 * Thread.sleep(20000);
		 * 
		 * 
		 * WebElement readmore_click1 =
		 * browsersetup.findElement(By.xpath("//span[contains(text(),'Read More')]"));
		 * readmore_click1.click();
		 * 
		 */

		
		
		String amazonURL = "https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&";

		browsersetup.get(amazonURL);

		browsersetup.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		
		/*
		 * WebElement xpath_email =
		 * browsersetup.findElement(By.xpath("//input[@id = 'ap_email']"));
		 * xpath_email.sendKeys("yogeshkamra25@gmail.com");
		 */

		/*
		 * WebElement button_xpath =
		 * browsersetup.findElement(By.xpath("//input[contains, (text(), 'Continue')]"))
		 * ; button_xpath.click();	
		 */
		
		/*
		 * WebElement create_account =
		 * browsersetup.findElement(By.xpath("//a[contains, (text(), 'Create')]"));
		 * create_account.click();
		 */
		
		/*
		 * WebElement help_click = browsersetup.findElement(By.cssSelector(".San"));
		 * help_click.click();
		 */
		
	/*	WebElement help_click = browsersetup.findElement(By.cssSelector("input[name = 'email']"));
		help_click.click();*/
		
		
		
		try {
		WebElement createclick = browsersetup.findElement(By.xpath("a[contains, (text(), 'Create your amazon Account')]"));
		createclick.click();
		}
		
		catch (InvalidSelectorException e) {
			// TODO: handle exception
		}
		
		
		
		
		System.out.println("help_click");
		
		
		//a[contains, (text(), 'Create')]

	}

	public static void all_locators_cssselector() {

		// CSS: input[name='login'][type='submit']

	}
}
