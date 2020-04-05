package FireFox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import library.Utility;

public class FirefoxTest {
	
	WebDriver driver;
	
	@Test
	@Parameters({"username","password", "image"} )
	public void DropdownTest(String user, String password, String image ) {
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\dream\\Downloads\\Webdriver\\geckodriver.exe");
		
		driver = new FirefoxDriver();
		driver.get("https://sandbox.moodledemo.net/");
		driver.manage().window().maximize();
		
	//	driver.findElement(By.id("drop-down-5e893324815125e8933247f6584")).click();
		
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("username")).sendKeys(user);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("loginbtn")).click();
		
		Utility.captureScreen(driver,image);
		
		driver.findElement(By.className("media-body ")).click();
		
		
	}

}
