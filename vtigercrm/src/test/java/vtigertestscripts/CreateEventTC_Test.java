package vtigertestscripts;

import java.io.IOException;

import org.testng.annotations.Test;

import genericLibraries.BaseClass;

public class CreateEventTC_Test extends BaseClass {
	@Test
	public void ceateEvenetTestcase() throws InterruptedException, IOException {
		
		/*
		login.getEmailTF().sendKeys(propertyUtility.readingDataFromPropertiesFile("username"));
		assertEquals(propertyUtility.readingDataFromPropertiesFile("username"), login.getEmailTF().getAttribute("value"));
		login.getPasswordTF().sendKeys(propertyUtility.readingDataFromPropertiesFile("password"));
		assertEquals(propertyUtility.readingDataFromPropertiesFile("password"),
				login.getPasswordTF().getAttribute("value"));
		login.getLoginButton().click();
		
		*/

		home.getQuickCreate();

		
		utility.handlingDropDown(home.getQuickCreate(), "Events");

		event.getSubjectTextfield().sendKeys("demo");

		//event.getDatestartTF().sendKeys("2023-07-25");
		utility.enteringDataIntoElement("2023-07-26", event.getDatestartTF());
		//event.getCalenderIconToEndDate().click();
		//event.getSatrtDate().click();
		Thread.sleep(4000);

		//event.getEndDateTF().sendKeys("2023-07-27");
		utility.enteringDataIntoElement("2023-07-27", event.getEndDateTF());
		//event.getCalenderIconToSatrtDate().click();
		//event.getEndDate().click();
		Thread.sleep(4000);

		event.getSavebutton().click();
		Thread.sleep(3000);
		/*
		utility.mouseHoverOnElement(home.getAdministrator());
		Thread.sleep(2000);
		home.getSighOut().click();
		
		*/
	}

}
