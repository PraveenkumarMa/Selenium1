package selenium1;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Waits1 {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
		driver.findElement(By.id("display-other-button")).click();
		WebDriverWait w=new WebDriverWait(driver, Duration.ofSeconds(15));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.id("hidden"))); // this conduction for hide the buttions.
		WebElement element=driver.findElement(By.id("hidden"));
		System.out.println(element.isEnabled());
		driver.findElement(By.id("enable-button")).click();
		driver.findElement(By.id("checkbox")).click();
		//  driver.findElement(By.id("alert")).click(); // this is for aleart from 29 line to 31
		// w.until(ExpectedConditions.alertIsPresent());
		// driver.switchTo().alert().accept();
	}

}
