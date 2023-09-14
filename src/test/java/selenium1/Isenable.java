package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Isenable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://testautomectionpractice.blogspot.com/");
		WebElement radiobuttons=driver.findElement(By.xpath("/input[@id='mail']"));
		radiobuttons.click();
		System.out.println(radiobuttons.isSelected());
		driver.close();
		String Titil=driver.findElement(By.xpath("//div[@class'titlewrapper']")).getText();
		System.out.println(Titil);
		driver.close();
		

	}

}
