package vtigertestscripts;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericLibraries.BaseClass;

@Listeners(genericLibraries.ListenersImplementation.class)
public class LoginToVtiger_Test extends BaseClass {

	@Test
	public void validateLoginPage() throws IOException {

		System.out.println("Login TestCase");
		
		
		System.out.println("Login TestCase");
	}
}