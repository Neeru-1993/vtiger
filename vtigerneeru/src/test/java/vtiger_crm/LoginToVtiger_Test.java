package vtiger_crm;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericLibraries.BaseClass;

@Listeners(genericLibraries.ListenersImplementation.class)
public class LoginToVtiger_Test extends BaseClass {

	@Test
	public void validateLoginPage() throws InterruptedException {

	System.out.println("Successfully Logined to app");
	}
}