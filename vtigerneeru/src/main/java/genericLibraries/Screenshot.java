package genericLibraries;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Screenshot extends BaseClass implements IAutoConstants {	
	public static String takingScreenShot(String screenshotName) {

		TakesScreenshot ts= (TakesScreenshot) driver;
		File photo = ts.getScreenshotAs(OutputType.FILE);
		String ldt = LocalDateTime.now().toString().replace(":", "-");
		String path=System.getProperty("user.dir")+SSPATH+screenshotName+" "+ldt+".png";
		File dest = new File(path);
		try {
			FileUtils.copyFile(photo, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return path;
	}



}
