package selenium1;

import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.implementation.bytecode.Division;

public class Testing1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://testautomationpractice.blogspot.com");
		driver.findElement(By.id("name")).sendKeys("PRAVEEN KUMAR");
		driver.findElement(By.id("email")).sendKeys("123123@gamil.com");
		driver.findElement(By.id("phone")).sendKeys("90890890");
		driver.findElement(By.id("textarea")).sendKeys("hno890,king,king");
		driver.findElement(By.id("male")).click();
		driver.findElement(By.id("country")).sendKeys("india");		
		List<WebElement> days=driver.findElements(By.cssSelector("input[id$='day'"));
		
		for(int i=1;i<6;i++)// or for(int i=1;i<days.size()-1;i++)
		{
			WebElement days1=days.get(i);
			days1.click();
			
		}

	}

}
