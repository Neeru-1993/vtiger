package vtiger_crm;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericLibraries.BaseClass;
@Listeners(genericLibraries.ListenersImplementation.class)
public class CreateEventTC_Test extends BaseClass {
	@Test
	public void ceateEvenetTestcase() throws InterruptedException {

		/*
		login.getEmailTF().sendKeys(propertyUtility.readingdataFromPropertyFile("username"));
		assertEquals(propertyUtility.readingdataFromPropertyFile("username"), login.getEmailTF().getAttribute("value"));
		login.getPasswordTF().sendKeys(propertyUtility.readingdataFromPropertyFile("password"));
		assertEquals(propertyUtility.readingdataFromPropertyFile("password"),
				login.getPasswordTF().getAttribute("value"));
		login.getLoginButton().click();

		*/
		
		home.getQuickCreate();

		utility.handlingDropDown(home.getQuickCreate(), "Events");

		event.getSubjectTextfield().sendKeys("demo");

		//event.getDatestartTF().sendKeys("2023-07-25");
		utility.enteringDataIntoElement("2023-07-28", event.getDatestartTF());
		//event.getCalenderIconToEndDate().click();
		//event.getSatrtDate().click();
		Thread.sleep(4000);

		//event.getEndDateTF().sendKeys("2023-07-27");
		utility.enteringDataIntoElement("2023-07-29", event.getEndDateTF());
		//event.getCalenderIconToSatrtDate().click();
		//event.getEndDate().click();
		Thread.sleep(4000);

		event.getSavebutton().click();
		System.out.println("Create Event");
		/*
		utility.mouseHoverOnElement(home.getAdministrator());
		Thread.sleep(2000);
		home.getSighOut().click();
		*/
		
	}

}
