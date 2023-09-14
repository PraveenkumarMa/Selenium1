package selenium1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alerts {

	public static void main(String[] args) throws Throwable{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://testautomationpractice.blogspot.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.cssSelector("[onclick='myFunctionAlert()']")).click();
		Alert d=driver.switchTo().alert();
		Thread.sleep(3000);
		d.accept();
	}

}
