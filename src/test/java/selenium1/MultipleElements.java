package selenium1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://testautomationpractice.blogspot.com");
		List<WebElement> days=driver.findElements(By.cssSelector("input[id$='day']"));
		for (WebElement day:days) {
			day.click();
		}
	}

}
