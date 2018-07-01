package base;

import org.openqa.selenium.*;



/**
 * Created By sbsk
*/
public class BasePage extends AbstractClass{


	public BasePage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public void gT() {
		
		driver.getTitle();
		
	}


	
	
}
