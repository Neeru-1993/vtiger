package vtiger_crm;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericLibraries.BaseClass;
import genericLibraries.ExcelUtility;
@Listeners(genericLibraries.ListenersImplementation.class)
public class OrganizationWithTypeAndIndustryMultiple_Test extends BaseClass {

	@Test(dataProvider = "testdata", dataProviderClass = ExcelUtility.class)
	public void organizationcreatingTypeInustry(String data) throws InterruptedException {
		
		/*
		login.getEmailTF().sendKeys(propertyUtility.readingdataFromPropertyFile("username"));
		//assertEquals(propertyUtility.readingdataFromPropertyFile("username"), login.getEmailTF().getAttribute("value"));
		login.getPasswordTF().sendKeys(propertyUtility.readingdataFromPropertyFile("password"));
		//assertEquals(propertyUtility.readingdataFromPropertyFile("password"), login.getPasswordTF().getAttribute("value"));
		login.getLoginButton().click();
		*/
		
		home.getOrganizations().click();

		org.getCreateNewOrganization().click();

		org.getOrganisationName().sendKeys(data);

		utility.selectReference(org.getIndustryDropdown()).selectByValue("Banking");

		utility.selectReference(org.getAccountTypeDropdown()).selectByValue("Customer");

		Thread.sleep(1000);

		org.getGroupRadioButton().click();

		Thread.sleep(1000);

		utility.handlingDropDown1(org.getAssignedtoDropdon(),1);
		
		org.getSaveButton().click();	
		
		Thread.sleep(2000);
		
		if(org.getFinalConfirmationtext().getText().contains(data)) {
			System.out.println("testcase passed");
		}else {
			System.out.println("testcase failed");
		}		

		System.out.println("Org with Type & Industry -- Multi");
		/*
		utility.mouseHoverOnElement(home.getAdministrator());
		Thread.sleep(3000);
		home.getSighOut().click();
		
		*/
		
	}
}


