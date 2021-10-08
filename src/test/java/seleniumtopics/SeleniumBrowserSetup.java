package seleniumtopics;

import java.net.URLStreamHandlerFactory;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import io.github.bonigarcia.wdm.WebDriverManager;


public class SeleniumBrowserSetup  {
	
	static WebDriver browsersetup;
	

	public static void googlechromesetup() throws InterruptedException
	
	{
		
		System.out.println("On Below Line Chrome Browser Has been Set up");
		WebDriverManager.chromedriver().setup();
		
		browsersetup = new ChromeDriver();
		
		System.out.println("Google Chrome has been Launched");
		
		
		BasicBrowserOperations.basic_browser_operations();
		
		//URLOperations.url_operations();
		
		URLOperations.gmailcheckC();

		
		
	}
	
	
	public static void firefoxsetup() throws InterruptedException
	
	{
		
		System.out.println("On Below Line Firefox Browser Has been Set up");
		WebDriverManager.firefoxdriver().setup();
		
		browsersetup = new FirefoxDriver();
		
		System.out.println("Firefox has been Launched");
		
BasicBrowserOperations.basic_browser_operations();
		
	//	URLOperations.url_operations();
		
		URLOperations.gmailcheckC();

	}
	
	


public static void iebrowser_setup() throws InterruptedException
	
	{
		
		System.out.println("On Below Line InternetExplorer Browser Has been Set up");
		WebDriverManager.iedriver().setup();
		
		browsersetup = new InternetExplorerDriver();
		
		System.out.println("InternetExplorer has been Launched");
							
		
		BasicBrowserOperations.basic_browser_operations();
		
		//URLOperations.url_operations();
		
		URLOperations.gmailcheckC();

		
		
	}

public static void edgebrowser_setup() throws InterruptedException

{
	
	System.out.println("On Below Line Edge Browser Has been Set up");
	
	try {
	WebDriverManager.edgedriver().setup();
	
	browsersetup = new EdgeDriver();
	
	System.out.println("EdgeDriver has been Launched");	
	
	}	
	
	catch (NoSuchElementException e) {
		
		System.out.println("Exception Handled");
		
		browsersetup.quit();
	}
	
	BasicBrowserOperations.basic_browser_operations();
	
	//URLOperations.url_operations();
	
	
	URLOperations.gmailcheckC();

}

	
	


	
}
