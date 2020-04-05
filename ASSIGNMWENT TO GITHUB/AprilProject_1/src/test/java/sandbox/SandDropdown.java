package sandbox;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import library.Utility;

public class SandDropdown extends Base {

	@Test
	public void dropdown() throws InterruptedException, Exception {
		// Thread.sleep(2000);
		driver.get("https://sandbox.moodledemo.net");
		// driver.manage().window().maximize();
		Thread.sleep(2000);
		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// Utility.captureScreen(driver, "Sand");

		driver.findElement(By.linkText("log in")).click();
		driver.findElement(By.id("username")).sendKeys("student");
		driver.findElement(By.id("password")).sendKeys("sandbox");
		driver.findElement(By.id("loginbtn")).click();
		
		/*
		 * driver.switchTo().alert().accept(); driver.switchTo().defaultContent();
		 */
		//Thread.sleep(2000);
		//driver.switchTo().defaultContent().close();

		// driver.findElement(By.xpath("//input[@id=\'drop-down-5e8916e44a1915e8916e4483664\']")).click();

		// driver.findElement(By.linkText("log in")).click();

		// Utility.captureScreen(driver, "Sand");

		// driver.quit();

	}

}

// copyFile(source, new File("./ScreenShots/page.png"));

/*
 * boolean card = driver.findElement(By.className("card-title ")).isDisplayed();
 * 
 * Assert.assertTrue(condition);
 */

/*
 * //
 * driver.findElement(By.id("drop-down-5e878a841358e5e878a840f1e34")).click();
 * 
 * // Select sel = new Select(element); //sel.selectByIndex(5); //
 * System.out.println(sel); // viewed.click();
 * 
 * // System.out.println("viewd");
 * 
 * // driver.findElement(By.id("page-site-index")).click();
 * 
 * 
 * // WebElement dropdown =
 * driver.findElement(By.id("drop-down-5e852a1222cf95e852a12187284"));
 * 
 * //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
 * //dropdown.click();
 */
