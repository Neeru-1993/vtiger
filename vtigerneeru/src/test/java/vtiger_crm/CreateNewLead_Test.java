package vtiger_crm;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericLibraries.BaseClass;

@Listeners(genericLibraries.ListenersImplementation.class)
public class CreateNewLead_Test extends BaseClass {

	@Test
	public void newLead() throws InterruptedException {
		
		/*
		login.getEmailTF().sendKeys(propertyUtility.readingdataFromPropertyFile("username"));
		assertEquals(propertyUtility.readingdataFromPropertyFile("username"), login.getEmailTF().getAttribute("value"));
		login.getPasswordTF().sendKeys(propertyUtility.readingdataFromPropertyFile("password"));
		assertEquals(propertyUtility.readingdataFromPropertyFile("password"),
				login.getPasswordTF().getAttribute("value"));
		login.getLoginButton().click();

		*/
		
		home.getLeads().click();
		lead.getCreateNewLead().click();

		lead.getFirstName().sendKeys(propertyUtility.readingdataFromPropertyFile("firstname"));
		assertEquals(propertyUtility.readingdataFromPropertyFile("firstname"),
				lead.getFirstName().getAttribute("value"));

		lead.getLastName().sendKeys(propertyUtility.readingdataFromPropertyFile("lastname"));
		assertEquals(propertyUtility.readingdataFromPropertyFile("lastname"), lead.getLastName().getAttribute("value"));

		lead.getCompany().sendKeys(propertyUtility.readingdataFromPropertyFile("company"));
		assertEquals(propertyUtility.readingdataFromPropertyFile("company"), lead.getCompany().getAttribute("value"));

		lead.getAssignedTo().click();
		
		Thread.sleep(3000);

		lead.getSaveButton().click();
		
		
		System.out.println("create new Lead");
		/*
		utility.mouseHoverOnElement(home.getAdministrator());
		Thread.sleep(2000);
		home.getSighOut().click();
		*/
	}
}
