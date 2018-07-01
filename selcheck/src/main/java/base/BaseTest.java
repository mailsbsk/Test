package base;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;



/**
 * Created By sbsk
 */
public class BaseTest extends AbstractClass {
	
	public WebDriver initfb() {

		driver = getBrowser();
		open(fb_url);
		return driver;

	}
	
	public WebDriver initg() {

		driver = getBrowser();
		open(g_url);
		return driver;

	}
	
	
	public WebDriver getBrowser() {
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", syspath + "//drivers//chromedriver");
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--start-maximized");
			options.addArguments("--start-fullscreen");
			options.addArguments("ignore-certificate-errors");
			options.addArguments("disable-infobars");
			options.addArguments("disable-popup-blocking");
			
			driver = new ChromeDriver(options);
			
		}
		return driver;
	}	

		
	public void open(String URL) {
		
		driver.get(URL);
	}
		
	
}
