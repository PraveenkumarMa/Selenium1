package selenium1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsonRightclick {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("http://testautomationpractice.blogspot.com");
	
	WebElement ele=driver.findElement(By.xpath("//button[@ondblclick='myFunction1()']"));
	Actions ac=new Actions(driver);
	ac.contextClick(ele).perform(); //NOTE-- CONNTEXTCLICK (ACTIONS) THIS IS FOR MOUSE RIGHT CLICK.
}
}
