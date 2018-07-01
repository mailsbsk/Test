
package utility;



import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


public class PR {
	public static  String syspath = System.getProperty("user.dir") +  "/configuration/";
	static Properties property = new Properties();
    static FileInputStream fis;

	

	public static Properties getProperties(String filename) {
		
		try {
			fis = new FileInputStream(syspath+filename);
			System.out.println("syspath"+syspath);
		}
		catch(FileNotFoundException e) {
			System.out.println("File exception"+e);
		}
		try {
			property.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return property;
		
	}
	
	
}
