package april;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Chrome {
	

//	public static void main(String[] args) {
	
	public WebDriver driver; 

	@Test
	public void run() throws InterruptedException {
		//System.out.println("Good!");

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dream\\Downloads\\chromedriver_win32\\chromedriver.exe");
   
 //Thread.sleep(2000);
		driver = new ChromeDriver();
		driver.navigate().to("https://www.amazon.com/");
		driver.manage().window().maximize();
	//	driver.manage().deleteAllCookies();
	//	driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	// driver.get("");	
		WebElement anyname = driver.findElement(By.id("nav-link-accountlist"));
		Thread.sleep(2000);
		anyname.click();
	//	driver.findElement(By.id("#fakebox-input")).sendKeys("udemy.com");

	}
}


