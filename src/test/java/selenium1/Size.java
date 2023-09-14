package selenium1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Size {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://testautomationpractice.blogspot.com");
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		// Dimension dis=new Dimension(300,500);
		driver.manage().window().setSize(new Dimension(3000, 500));
		
		
		
		
		
		
		
		

	}

}
