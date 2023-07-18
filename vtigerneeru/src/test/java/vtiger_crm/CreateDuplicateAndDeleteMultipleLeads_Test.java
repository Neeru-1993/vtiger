package vtiger_crm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericLibraries.BaseClass;
@Listeners(genericLibraries.ListenersImplementation.class)
public class CreateDuplicateAndDeleteMultipleLeads_Test extends BaseClass{

	@Test
	public void leadDelete() throws InterruptedException
	{
		
		home.getLeads().click();
		
		lead.getCreateNewLead().click();
		
		String firstname = "Kiran";
		lead.getFirstName().sendKeys(firstname);
		
		lead.getLastName().sendKeys("NRB");
		
		lead.getCompany().sendKeys("jsp");
		
		lead.getSaveButton().click();
		
		lead.getDuplicateButton().click();
		
		lead.getSaveButton().click();
		
		lead.getDeleteBoxInLeadPage().click();
		
		driver.switchTo().alert().accept();
		
		Thread.sleep(3000);
	  
		WebElement leadname = driver.findElement(By.xpath("//a[contains(text(),'"+firstname+"')]/../..//input[@name='selected_id']"));
	 
	   Thread.sleep(6000);
	   
	   utility.scrollingAction(500, 500);
	   
	   Thread.sleep(5000);
	   
	   leadname.click();
	   
	  
	   
	   lead.getDeleteBox();
	   
	   System.out.println("Duplicate Lead Multi");
	}
}
