package Test;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.FaceBook;
import pages.Google;

/**
 * Created By 
*/

public class verifyPageAccess extends BaseTest{

	
	FaceBook facebook;
	Google google;
		

		@BeforeMethod
		public void setup() {
		
		facebook = PageFactory.initElements(driver, FaceBook.class);
		google = PageFactory.initElements(driver, Google.class);
		
	    }
		
		@Test
		public void AFB() {
			initfb();
			facebook.fb();
			System.out.println("title"+driver.getTitle());
			Assert.assertTrue(driver.getTitle().contains("Log"),"User is not landing to FBPage");
			sleep(5000);
			
			
		}
		
		@Test
		public void G() {
			
			initg();
			google.g();
			System.out.println("title"+driver.getTitle());
			Assert.assertTrue(driver.getTitle().contains("Google"),"User is not landing to Gpage");
			sleep(5000);
			
			
			
		}
		
		@AfterMethod
		public void teardown() {
		sleep(3000);
		driver.close();
		driver.quit();
			
		}
}

