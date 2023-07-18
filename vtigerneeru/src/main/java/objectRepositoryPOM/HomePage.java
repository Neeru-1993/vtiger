package objectRepositoryPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public HomePage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//td[@class='tabUnSelected']/a[text()='Leads']")
	private WebElement leads;
	
	@FindBy(xpath = "(//a[text()='Organizations'])[1]")
	private WebElement organizations;
	
	@FindBy(xpath = "//td[@class='tabUnSelected']/a[text()='Contacts']")
	private WebElement contacts;
	
	@FindBy(id = "qccombo")
	private WebElement quickCreate;
	
	@FindBy(xpath = "//img[@src='themes/softed/images/user.PNG']")
	private WebElement administrator;
	
	@FindBy(xpath = "//a[contains(text(),'Sign Out')]")
	private WebElement sighOut;
	
	
	public WebElement getLeads() {
		return leads;
	}

	public WebElement getOrganizations() {
		return organizations;
	}

	public WebElement getAdministrator() {
		return administrator;
	}

	public WebElement getSighOut() {
		return sighOut;
	}

	public WebElement getContacts() {
		return contacts;
	}

	public WebElement getQuickCreate() {
		return quickCreate;
	}

}
