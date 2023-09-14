package selenium1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("http://testautomationpractice.blogspot.com");
		WebElement drop=driver.findElement(By.id("country"));
		Select sec=new Select(drop);
		// sec.selectByVisibleText("India");
		// or
		sec.selectByIndex(9);

	}

}
