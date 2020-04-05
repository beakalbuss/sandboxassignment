package sandbox;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SandBoxHomeP extends Base {

	// Moodle sandbox demo
	@Test
	public void VerSandHome() {

		driver.get("https://sandbox.moodledemo.net/");
		String SandTitle = driver.getTitle();
		
		String expected_title = "Moodle sandbox demo";
		
		//Assert.assertEquals(SandTitle,expected_title);

		Assert.assertTrue(SandTitle.contains("Moodle sandbox demo"));
			System.out.println("Sand Home Verified!");	
		
	}
}
