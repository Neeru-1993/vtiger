package objectRepositoryPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@name='user_name']")
	private WebElement username;
	
	@FindBy(xpath = "//input[@name='user_password']")
	private WebElement PasswordTF;
	
	@FindBy(id = "submitButton")
	private WebElement LoginButton;

	public WebElement getEmailTF() {
		return username;
	}

	public WebElement getPasswordTF() {
		return PasswordTF;
	}

	public WebElement getLoginButton() {
		return LoginButton;
	}
}
