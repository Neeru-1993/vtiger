package vtiger_crm;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericLibraries.BaseClass;

@Listeners(genericLibraries.ListenersImplementation.class)
public class CreateNewContact_Test extends BaseClass {

	@Test
	public void newContact() throws InterruptedException {
		
		/*
		login.getEmailTF().sendKeys(propertyUtility.readingdataFromPropertyFile("username"));
		assertEquals(propertyUtility.readingdataFromPropertyFile("username"), login.getEmailTF().getAttribute("value"));
		login.getPasswordTF().sendKeys(propertyUtility.readingdataFromPropertyFile("password"));
		assertEquals(propertyUtility.readingdataFromPropertyFile("password"),
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
		
		System.out.println("create new Contact");
		/*
		utility.mouseHoverOnElement(home.getAdministrator());
		Thread.sleep(2000);
		home.getSighOut().click();
		*/
	}
}
