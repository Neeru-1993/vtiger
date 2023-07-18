package genericLibraries;


import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;
import objectRepositoryPOM.ContactPage;
import objectRepositoryPOM.EventPage;
import objectRepositoryPOM.HomePage;
import objectRepositoryPOM.LeadPage;
import objectRepositoryPOM.LoginPage;
import objectRepositoryPOM.OrganizationsPage;

public class BaseClass {
	public static WebDriver driver;
	public LoginPage login;
	public HomePage home;
	public OrganizationsPage org;
	public LeadPage lead;
	public ContactPage contact;
	public WebDriverUtility utility;
	public PropertiesUtility propertyUtility;
	public EventPage event;

	@BeforeClass(alwaysRun = true)
	public void LaunchingBrowser() throws IOException{
		
			propertyUtility = new PropertiesUtility();
			utility = new WebDriverUtility();

			if (propertyUtility.readingdataFromPropertyFile("browser").equals("chrome")) {
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();

			} else {
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
			}
			driver.manage().window().maximize();

			driver.get(propertyUtility.readingdataFromPropertyFile("URL"));

			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			
			login = new LoginPage(driver);
			utility = new WebDriverUtility();
			home=new HomePage(driver);
			org=new OrganizationsPage(driver);
			event = new EventPage(driver);
			contact=new ContactPage(driver);
			lead = new LeadPage(driver);
			
			login.getEmailTF().sendKeys(propertyUtility.readingdataFromPropertyFile("username"));
			login.getPasswordTF().sendKeys(propertyUtility.readingdataFromPropertyFile("password"));
			login.getLoginButton().click();

			
		
	}
	
	@BeforeMethod(alwaysRun = true)
	public void navigateToApp() throws IOException {	
		home=new HomePage(driver);
		org=new OrganizationsPage(driver);
		System.out.println("BeforeMethod");
		
	}

	
	@AfterMethod(alwaysRun = true)
	public void checkTheTestResult(ITestResult result) {
		
		
		}
	
	@AfterClass(alwaysRun = true)
	public void teardownThheBrowser() throws InterruptedException {
		
		utility.mouseHoverOnElement(home.getAdministrator());
		Thread.sleep(3000);
		home.getSighOut().click();
		driver.quit();
	}

}
