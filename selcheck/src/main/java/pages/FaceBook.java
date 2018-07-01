
package pages;

import org.openqa.selenium.WebDriver;

import base.BasePage;

/**
 * Created By sbsk
 */

public class FaceBook extends BasePage {

	public FaceBook(WebDriver driver) {

		super(driver);
	}

	public void fb() {
		System.out.println("Inside FB");
		sleep(2000);

	}

}
