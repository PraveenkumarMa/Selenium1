package selenium1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frames {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebElement trm=driver.findElement(By.xpath("//iframe[@id='frml']"));
		driver.switchTo().frame(trm);
		WebElement drop=driver.findElement(By.id("selectnavl"));
		Select sel=new Select(drop);
		sel.selectByVisibleText("- Testing");
	}

}
