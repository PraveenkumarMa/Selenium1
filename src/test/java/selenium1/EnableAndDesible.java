package selenium1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EnableAndDesible {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("http://selectorshub.com/xpath-practice-page/");
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("document.querySelector(//input[@placeholder='Enter Last name'])\").disabled=false"); // this is for last name disable purpose
	driver.findElement(By.xpath("//input[@placeholder='Enter Last name']")).sendKeys("123456");
}
}
