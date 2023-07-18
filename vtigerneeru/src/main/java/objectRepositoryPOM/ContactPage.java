package objectRepositoryPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactPage {

	public ContactPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//img[@title='Create Contact...']")
	private WebElement createNewContact;
	
	@FindBy(xpath = "//input[@name='firstname']")
	private WebElement firstName;
	
	@FindBy(xpath = "//input[@name='lastname']")
	private WebElement lastName;
	
	@FindBy(xpath = "//input[@value='U']")
	private WebElement assignedTo;
	
	@FindBy(xpath = "(//input[@title='Save [Alt+S]'])[1]")
	private WebElement saveButton;
	
	@FindBy(xpath = "//input[@id='mobile']")
	private WebElement mobile;
	
	@FindBy(xpath = "//input[@name='account_name']")
	private WebElement addOrganizationName;
	
	@FindBy(xpath = "(//img[@title='Select'])[1]")
	private WebElement addOrganizationIcon;

	
	@FindBy(xpath = "//a[text()='TY']")
	private WebElement optionsFromOrg;


	public WebElement getMobile() {
		return mobile;
	}

	public WebElement getCreateNewContact() {
		return createNewContact;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getAssignedTo() {
		return assignedTo;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}

	public WebElement getAddOrganizationIcon() {
		return addOrganizationIcon;
	}
	

	public WebElement getAddOrganizationName() {
		return addOrganizationName;
	}

	public WebElement getOptionsFromOrg() {
		return optionsFromOrg;
	}
	
	
}
