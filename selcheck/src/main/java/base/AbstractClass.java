
package base;

import java.util.Properties;


import org.openqa.selenium.WebDriver;
import utility.PR;



/**
 * Created By sbsk  
 */

public class AbstractClass{

	public WebDriver driver;

	public Properties config = PR.getProperties("Config.properties");
	
 
	
	public String browser = config.getProperty("browser");
	
	public String syspath = System.getProperty("user.dir");
	
	public String g_url = config.getProperty("g_url");
	public String fb_url = config.getProperty("fb_url");
	
	
	public void sleep(long millis) {
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
			e.getMessage();
		}
	}
	

	public void insideabs() {
		
		System.out.println("ABS class"+g_url+fb_url);
	}
		

}
