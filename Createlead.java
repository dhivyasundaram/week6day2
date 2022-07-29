package testcase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Createlead extends Baseclass {

	@Test
		public void runcreatelead()  {
			
			driver.findElement(By.linkText("Create Lead")).click();
			driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
			driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Dhivya");
			driver.findElement(By.id("createLeadForm_lastName")).sendKeys("S");
			driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("96");
			driver.findElement(By.name("submitButton")).click();
			
	}
}









