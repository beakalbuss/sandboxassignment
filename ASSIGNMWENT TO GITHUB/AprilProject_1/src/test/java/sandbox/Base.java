package sandbox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Base {

	WebDriver driver;

	@Test
	public void SandboxNav() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\dream\\Downloads\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();

		Thread.sleep(2000);
	//	driver.get("https://sandbox.moodledemo.net/");

	}

	/*
	 * @AfterMethod public void closeSandbox() throws InterruptedException {
	 * 
	 * Thread.sleep(4000); driver.quit();
	 * 
	 * }
	 */

}
