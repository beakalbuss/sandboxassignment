package sandbox;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import library.Utility;

public class Memeber extends SandDropdown {
	
	
	@Test
	public void dashboard() {
		 
//	driver.findElement(By.className("Dashboard")).click();
	driver.findElement(By.className("media-body font-weight-bold")).click();
	
		//driver.findElement(By.className("class='list-group-item list-group-item-action active'")).click();
		Utility.captureScreen(driver, "dashboard");
		
		
	}
	

}
