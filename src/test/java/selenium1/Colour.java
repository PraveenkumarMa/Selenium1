package selenium1;



	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import io.github.bonigarcia.wdm.WebDriverManager; // You need to import this for WebDriverManager

	import java.util.List;

	public class Colour {
	    public static void main(String[] args) {
	      
	        WebDriverManager.chromedriver().setup();
	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	    
	        driver.get("http://testautomationpractice.blogspot.com");
	        
	      
	        List<WebElement> colorOptions = driver.findElements(By.xpath("//*[@id='colors']/option"));
	        
	       
	        for (int i = 1; i <= colorOptions.size(); i++) {
	            WebElement colorOption = colorOptions.get(i - 1); 
	            colorOption.click();
	        }
	        
	      
	    }
	}
