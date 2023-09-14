package selenium1;



import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Drag {
	private static int i;

	public static void main(String[] args)  {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://testautomationpractice.blogspot.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		
		JavascriptExecutor scrol=(JavascriptExecutor)driver;
		scrol.executeScript("window.scrollBy(0,500)");
		
		Actions drag=new Actions(driver);
		WebElement val=driver.findElement(By.id("draggable"));
		WebElement val1=driver.findElement(By.id("droppable"));
		
		drag.dragAndDrop(val, val1).build().perform();
		
	
		}
	}

