package TestNg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FlagesPri {
	WebDriver driver;
	@BeforeMethod
	public void url() {
		driver=new ChromeDriver();
	
		driver.get("http://testautomationpractice.blogspot.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	@Test
	public void name() {
		driver.findElement(By.id("name")).sendKeys("KING");
		
	}
	@Test
	public void email() {
		driver.findElement(By.id("email")).sendKeys("123@gmail.com");
	}
	@Test
	public void phone() {
		
		driver.findElement(By.id("phone")).sendKeys("0000");
	}

}
