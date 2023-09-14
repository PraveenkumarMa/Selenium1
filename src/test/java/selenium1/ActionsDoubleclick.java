package selenium1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsDoubleclick {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://testautomationpractice.blogspot.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		// driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click(); NOTE--  THIS IS FOR NEW BROWSER  WINNDOW CLICK PURPOSE
		WebElement ele=driver.findElement(By.xpath("//button[@ondblclick='myFunction1()']"));
		Actions ac=new Actions(driver);
		ac.doubleClick(ele).perform();
	}

}
