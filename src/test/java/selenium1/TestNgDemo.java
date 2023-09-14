package selenium1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNgDemo {
@Test(priority = 2)
public void demotest() {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("http://meesho.com");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
}

@Test(priority = 1,description = "this is for chrome")  // NOTE -- HERE  IN THE DESCRIPTION WHAT EVER DATA YOU ARE GIVEN THAT IS PRIENTED 
public void demotest1() {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("http://google.com");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	
}

}
