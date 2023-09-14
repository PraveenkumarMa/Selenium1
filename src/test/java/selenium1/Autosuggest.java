package selenium1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggest {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://google.com");
		driver.findElement(By.id("APjFqb")).sendKeys("ferrari");
		List<WebElement> list=driver.findElements(By.xpath("//div[@class='wM6W7d'//b"));
		System.out.println(list.size());
		//for(WebElement);
	}

}
