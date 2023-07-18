package genericLibraries;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtility extends BaseClass implements IAutoConstants {

	/*
	 * this is method is used for drang and drop purpose
	 * 
	 * @param src
	 * 
	 * @param destination
	 */
	public void dragAndDropp(WebElement src, WebElement destination) {
		Actions action = new Actions(driver);
		action.dragAndDrop(src, destination).perform();
	}

	public void rightClick() {
		Actions action = new Actions(driver);
		/*
		 * this method is used to perform right click action
		 */
		action.contextClick().perform();
	}

	public void rightClick(WebElement element) {
		Actions action = new Actions(driver);
		/*
		 * this method used for perform right click operations with parameters
		 */
		action.contextClick(element).perform();
	}

	public void doubleclick() {
		Actions action = new Actions(driver);
		/*
		 * this method is used to perform doublick click on element
		 */
		action.doubleClick().perform();
	}

	public void doubleclick(WebElement element) {
		Actions action = new Actions(driver);
		/*
		 * this method is used to double click with parameters
		 */
		action.doubleClick(element).perform();
	}

	public void mouseHoverOnElement(WebElement element) {
		Actions action = new Actions(driver);
		/*
		 * this method is used for mouse Hover
		 */
		action.moveToElement(element).perform();
	}

	public Select selectReference(WebElement dropdown) {
		/*
		 * retrun the dropdown value
		 */
		Select select = new Select(dropdown);
		return select;
	}

	public void handlingDropDown(WebElement dropdown, String value) {
		/*
		 * This method is used to handaling the dropdown mainly for selectbyVisableText
		 * method & SelectByValue method
		 */
		Select select = new Select(dropdown);
		try {
			select.selectByVisibleText(value);
		} catch (Exception e) {
			select.selectByValue(value);
		}

	}

	public void handlingDropDown1(WebElement dropdown, int index) {
		/*
		 * This method is used to handaling the dropdwon which is having index value in
		 * dropdown
		 */
		Select select = new Select(dropdown);
		select.selectByIndex(index);
	}

	public void scrollingAction(int x, int y) {
		/*
		 * scroll the webpage by using scrollBy
		 */
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(" + x + "," + y + ")");
	}

	public void enteringDataIntoElement(String data, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='" + data + "'", element);
	}
	
	public void clearingDataFromElement1(WebElement element) {
		JavascriptExecutor js =(JavascriptExecutor) driver;
		js.executeScript("arguments[0].value=' '", element);
	}

	public void switchingToFrame(int index) {
		/*
		 * It's used to Switch control into frame by using integer
		 */
		driver.switchTo().frame(index);
	}

	public void switchingToFrame(WebElement element) {
		/*
		 * It's used to Switch control into frame by using element
		 */
		driver.switchTo().frame(element);
	}

	public void switchingToFrame(String data) {
		/*
		 * It's used to Switch control into frame by using string
		 */
		driver.switchTo().frame(data);
	}

	public void switchingBackToMain() {
		/*
		 * It's used to Switch control to back to webpage (default page)
		 */
		driver.switchTo().defaultContent();
	}
	
	public void switchingBackToMain(String WindowID) {
		/*
		 * It's used to Switch control to back to webpage (default page)
		 */
		driver.switchTo().window(WindowID);
	}

	public Alert switchToAlert() {
		/*
		 * Switch the control into AlertPopup & Return the alert
		 */
		Alert alert = driver.switchTo().alert();
		return alert;
	}

	public WebDriverWait explicitWaitingStatement(int longTime) {
		WebDriverWait wait = new WebDriverWait(driver, longTime);
		return wait;
	}

	public void switchToWindow(Set<String> allWindowID, String targetWindowTitile) {
		/*
		 * its used to change mouse control into newpage or newtab
		 */
		for (String idd : allWindowID) {
			driver.switchTo().window(idd);
			if (targetWindowTitile.equalsIgnoreCase(driver.getTitle())) {
				break;
			} else {
				driver.close();
			}
		}
	}

	// For VTIGER
	public void switchingtargetPage(Set<String> allWindowId, String parentId) {
		allWindowId.remove(parentId);
		for (String id : allWindowId) {
			driver.switchTo().window(id);
			
			}
		}
	
	/*
	 * public static String takingScreenShot(String screenshotName) {
	 * 
	 * TakesScreenshot ts= (TakesScreenshot) driver; File photo =
	 * ts.getScreenshotAs(OutputType.FILE); String ldt =
	 * LocalDateTime.now().toString().replace(":", "-"); String
	 * path=System.getProperty("user.dir")+SSPATH+screenshotName+" "+ldt+".png";//It
	 * is not hard coded path, it is from BaseClass and IAutoConstants. File dest =
	 * new File(path); try { FileUtils.copyFile(photo, dest); } catch (IOException
	 * e) { // TODO Auto-generated catch block e.printStackTrace(); } return
	 * path;//every time change the ScreenshotName and time, So we return it. }
	 * 
	 */
}
