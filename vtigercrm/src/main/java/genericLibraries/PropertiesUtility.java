package genericLibraries;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesUtility implements IAutoConstants {
	/**
	 * This method is used to fetch the value from property file and it is returning
	 * the
	 * 
	 * @param key
	 * @return
	 * @throws IOException
	 */

	FileInputStream fis;

	public String readingdataFromPropertyFile(String key) {

		try {
			fis = new FileInputStream(PROPERTYFILE);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Properties ppt = new Properties();
		try {
			ppt.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ppt.getProperty(key);
	}
}
