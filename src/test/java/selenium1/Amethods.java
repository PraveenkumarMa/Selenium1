package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amethods {

	public static void main(String[] args) throws Throwable{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// driver.get("http://skype.com");
				// System.out.println(driver.getCurrentUrl()); NOTE--AFTER OPENING THE WEB PAGE
				// THEN GET URL
				// System.out.println(driver.getPageSource()); NOTE --IT IS USED FOR OPENING THE
				// WEB PAGE AFTER PAGE DETAILS WILL BE SHOWING
				// System.out.println(driver.findElement(null)); NOTE -- IT IS USED FOR FINDING ELEMENT
				// String id=driver.getWindowHandle();
				// System.out.println(id);NOTE -- GETWINDOWHANDLE() METHOD IS USED FOR ID
				// System.out.println(driver.getTitle());
				// driver.close(); NOTE -- IT IS USED TO CLOSE THE CURRENT OPENING WINDOW
				
	}

}
