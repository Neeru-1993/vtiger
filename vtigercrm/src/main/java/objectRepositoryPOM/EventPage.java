package objectRepositoryPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EventPage {

	public EventPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(linkText = "Organizations")
	private WebElement OrganizationsLink;

	@FindBy(id = "qccombo")
	private WebElement quickCreateDropdown;
	
	@FindBy(name = "subject")
	private WebElement SubjectTextfield;
	
	@FindBy(xpath = "//input[@id='jscal_field_date_start']")
	private WebElement datestartTF;

	@FindBy(xpath = "//input[@id='jscal_field_due_date']")
	private WebElement EndDateTF;
	
	@FindBy(xpath = "//input[@title='Save [Alt+S]']")
	private WebElement savebutton;
	
	@FindBy(xpath = "//img[@id='jscal_trigger_date_start']")
	private WebElement calenderIconToSatrtDate;
	
	@FindBy(xpath = "(//td[text()='27'])[5]")
	private WebElement satrtDate;
	
	@FindBy(xpath = "//img[@id='jscal_trigger_due_date']")
	private WebElement calenderIconToEndDate;
	
	@FindBy(xpath = "(//td[text()='29'])[6]")
	private WebElement endDate;
	
	
	public WebElement getEndDateTF() {
		return EndDateTF;
	}
	public WebElement getSavebutton() {
		return savebutton;
	}
	public WebElement getQuickCreateDropdown() {
		return quickCreateDropdown;
	}
	public WebElement getSubjectTextfield() {
		return SubjectTextfield;
	}
	public WebElement getDatestartTF() {
		return datestartTF;
	}
	public WebElement getOrganizationsLink() {
		return OrganizationsLink;
	}
	public WebElement getCalenderIconToSatrtDate() {
		return calenderIconToSatrtDate;
	}
	public WebElement getSatrtDate() {
		return satrtDate;
	}
	public WebElement getCalenderIconToEndDate() {
		return calenderIconToEndDate;
	}
	public WebElement getEndDate() {
		return endDate;
	}
	
	
	

}
