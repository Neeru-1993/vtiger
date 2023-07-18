package objectRepositoryPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeadPage {

	public LeadPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//img[@title='Create Lead...']")
	private WebElement createNewLead;
	
	@FindBy(xpath = "//input[@name='firstname']")
	private WebElement firstName;
	
	@FindBy(xpath = "//input[@name='lastname']")
	private WebElement lastName;
	
	@FindBy(xpath = "//input[@name='company']")
	private WebElement company;
	
	@FindBy(xpath = "//input[@value='U']")
	private WebElement assignedTo;
	
	@FindBy(xpath = "//tbody/tr[1]/td[1]/div[1]/input[1]")
	private WebElement saveButton;

	@FindBy(xpath = "//input[@name='selectall']")
	private WebElement selectBox;
	
	@FindBy(xpath = "//table[@class='small']/descendant::input[@value='Delete']")
	private WebElement deleteBox;
	
	@FindBy(xpath = "(//input[@name='Duplicate'])[1]")
	private WebElement duplicateButton;
	
	@FindBy(xpath = "//input[@name='Delete']")
	private WebElement deleteBoxInLeadPage;

	public WebElement getCreateNewLead() {
		return createNewLead;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getCompany() {
		return company;
	}

	public WebElement getAssignedTo() {
		return assignedTo;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}
	
	public WebElement getSelectBox() {
		return selectBox;
	}

	public WebElement getDeleteBox() {
		return deleteBox;
	}

	public WebElement getDuplicateButton() {
		return duplicateButton;
	}

	public WebElement getDeleteBoxInLeadPage() {
		return deleteBoxInLeadPage;
	}
	
	
}
