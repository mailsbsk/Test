
package pages;

import org.openqa.selenium.WebDriver;

import base.BasePage;

/**
 * Created By sbsk
*/

public class Google extends BasePage{
	
	
		
		public Google(WebDriver driver) {

			super(driver);
		}
		
		public void g() {
			System.out.println("Inside G");
			sleep(2000);

		}
		

}
