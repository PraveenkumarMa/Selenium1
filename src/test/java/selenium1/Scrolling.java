package selenium1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.graphbuilder.curve.Point;

public class Scrolling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://testautomationpractice.blogspot.com");
		//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		WebElement element=driver.findElement(By.xpath("//a[text())='open cart']"));
		Point loc=(Point) element.getLocation();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy"+loc);


	}

}
