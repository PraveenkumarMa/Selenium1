package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://poojastore.marolix.com/Authenticate/login");
		driver.findElement(By.name("emailid")).sendKeys("pooja132@gmail.com");
		driver.findElement(By.name("possward")).sendKeys("1234");
		driver.findElement(By.xpath("//div[@class='col-md-6']/button")).click();
		String title=driver.getTitle();
		String url=driver.getCurrentUrl();
		System.out.println(title);
		System.out.println(url);
		Thread.sleep(1000);
		driver.close();

	}

}
