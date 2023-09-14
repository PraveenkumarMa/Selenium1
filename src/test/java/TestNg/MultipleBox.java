package TestNg;

	import java.time.Duration;
	import java.util.List;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

	public class MultipleBox {

		public static void main(String[] args) {
			WebDriverManager.chromedriver().setup();

	        WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://testautomationpractice.blogspot.com/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)); 
			List<WebElement> checkboxes=driver.findElements(By.cssSelector("input[id$='day']"));
			 for(int i=0;i<checkboxes.size();i++) {
				   
				   WebElement day = checkboxes.get(i);
				   day.click();
			   }
			}
	}



