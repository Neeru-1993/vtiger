package genericLibraries;

import static org.testng.Assert.assertEquals;

import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(genericLibraries.ListenersImplementation.class)
public class ExtentImplementation extends BaseClass {
	@Test
	public void validatePassedTest() {
		System.out.println("PASSED TC");
	}
	
	@Test
	public void validateFailedTest() {
		System.out.println("FAILED TC");
		assertEquals(false, true);
	}
	
	@Test
	public void validateSkippedTest() {
		System.out.println("SKIPPED TC");
		throw new SkipException("Tc is Skipped");
	}
}
