package selenium1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Demo {
	@Test
	
	public void test1() {
	
		WebDriver driver=new ChromeDriver(); //13 abstract methods are present  in webdriver
		//NOTE --WEBDRIVER IS INTERFACE  , CHROMEDRIVER IS CLASS
		driver.get("http://google.com");
	}

}
