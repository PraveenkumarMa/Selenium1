package selenium1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Meesho {
	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://ww.meesho.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement search=driver.findElement(By.xpath("//input[@placeholder='Try Saree, Kurti or Search by Product Code']"));
		search.click();
		search.sendKeys("shirts");
		List<WebElement> shirtsoptions=driver.findElements(By.xpath(("//p[@class='sc-eDvSVe hpsLdS sc-AHaJN puxZX sc-AHaJN puxZX']")));
		for(WebElement options:shirtsoptions) {
			System.out.println(options.getText());
			if(options.getText().equalsIgnoreCase("shirts for men")) {
				options.click();
				break;
				
			}
		}
		Thread.sleep(8000);
		driver.close();
	}

}
