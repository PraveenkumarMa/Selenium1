package TestNg;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Annonations {
	WebDriver driver;
	@BeforeMethod
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://poojastore.marolix.com/Authenticate/Login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	@Test(description = "login functionality in validaction mode")
		public void login() {
		driver.findElement(By.name("emailid")).sendKeys("praveen27.marolix@gmail.com");
		driver.findElement(By.name("pword")).sendKeys("Praveen27");
		driver.findElement(By.xpath("//div[@class='col-md-6']/button")).click();
	}
	@Test(description = "url test functionality")
	public void urltest() {
		String url=driver.getCurrentUrl();
		Assert.assertEquals("http://poojastore.marolix.com/Authenticate/Register", url);
	}
	@AfterMethod
	public void end() {
		driver.close();
	}
	
	}


