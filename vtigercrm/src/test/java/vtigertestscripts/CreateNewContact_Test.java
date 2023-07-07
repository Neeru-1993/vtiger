package vtigertestscripts;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericLibraries.BaseClass;

@Listeners(genericLibraries.ListenersImplementation.class)
public class CreateNewContact_Test extends BaseClass {

	@Test
	public void newContact() throws InterruptedException, IOException {
		
		/*
		login.getEmailTF().sendKeys(propertyUtility.readingDataFromPropertiesFile("username"));
		assertEquals(propertyUtility.readingDataFromPropertiesFile("username"), login.getEmailTF().getAttribute("value"));
		login.getPasswordTF().sendKeys(propertyUtility.readingDataFromPropertiesFile("password"));
		assertEquals(propertyUtility.readingDataFromPropertiesFile("password"),
				login.getPasswordTF().getAttribute("value"));
		login.getLoginButton().click();
		
		*/
		home.getContacts().click();
		contact.getCreateNewContact().click();

		contact.getFirstName().sendKeys(propertyUtility.readingdataFromPropertyFile("firstname"));
		assertEquals(propertyUtility.readingdataFromPropertyFile("firstname"),
				contact.getFirstName().getAttribute("value"));

		contact.getLastName().sendKeys(propertyUtility.readingdataFromPropertyFile("lastname"));
		assertEquals(propertyUtility.readingdataFromPropertyFile("lastname"),
				contact.getLastName().getAttribute("value"));

		contact.getMobile().sendKeys(propertyUtility.readingdataFromPropertyFile("phone"));
		assertEquals(propertyUtility.readingdataFromPropertyFile("phone"), contact.getMobile().getAttribute("value"));

		
		contact.getAssignedTo().click();
		contact.getSaveButton().click();
		/*
		utility.mouseHoverOnElement(home.getAdministrator());
		Thread.sleep(2000);
		home.getSighOut().click();
		
		*/
	}
}
