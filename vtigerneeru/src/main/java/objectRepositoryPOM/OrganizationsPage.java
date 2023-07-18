package objectRepositoryPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationsPage {

	public OrganizationsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//img[@title='Create Organization...']")
	private WebElement createNewOrganization;
	
	@FindBy(xpath = "//tbody/tr[3]/td[2]/input[1]")
	private WebElement organisationName;
	
	@FindBy(xpath = "//tbody/tr[9]/td[2]/select[1]")
	private WebElement industry;
	
	@FindBy(xpath = "//tbody/tr[10]/td[2]/select[1]")
	private WebElement type;
	
	@FindBy(xpath = "//input[@value='U']")
	private WebElement assignedTo;
	
	@FindBy(xpath = "//tbody/tr[1]/td[1]/div[1]/input[1]")
	private WebElement saveButton;

	@FindBy(name = "industry")
	private WebElement IndustryDropdown;

	@FindBy(name = "accounttype")
	private WebElement accountTypeDropdown;

	@FindBy(xpath = "//input[@value='T']")
	private WebElement GroupRadioButton;


	@FindBy(name = "assigned_group_id")
	private  WebElement assignedtoDropdon;
	
	@FindBy(xpath = "//span[@class='dvHeaderText']")
	private WebElement FinalConfirmationtext;


	public WebElement getCreateNewOrganization() {
		return createNewOrganization;
	}

	public WebElement getOrganisationName() {
		return organisationName;
	}

	public WebElement getIndustry() {
		return industry;
	}

	public WebElement getType() {
		return type;
	}

	public WebElement getAssignedTo() {
		return assignedTo;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}

	public WebElement getIndustryDropdown() {
		return IndustryDropdown;
	}

	public WebElement getAccountTypeDropdown() {
		return accountTypeDropdown;
	}

	public WebElement getGroupRadioButton() {
		return GroupRadioButton;
	}

	public WebElement getAssignedtoDropdon() {
		return assignedtoDropdon;
	}

	public WebElement getFinalConfirmationtext() {
		return FinalConfirmationtext;
	}
	
	
}
