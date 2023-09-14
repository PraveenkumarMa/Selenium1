package TestNg;

	import java.awt.AWTException;
	import java.awt.Robot;
	import java.awt.Toolkit;
	import java.awt.datatransfer.StringSelection;
	import java.awt.event.KeyEvent;
	import java.time.Duration;
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

	public class FileAss{

		public static void main(String[] args) throws Throwable {
			WebDriverManager.chromedriver().setup();

			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.ilovepdf.com/word_to_pdf");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			
			driver.findElement(By.xpath("//span[text()='Select WORD files']")).click();
			
			
			Robot rb = new Robot();
			rb.delay(3000);
			
			StringSelection path = new StringSelection("C:\\Users\\ADMIN\\eclipse-workspace\\selenium1\\target\\fileup ~ .pdf");
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(path, null);
			
			rb.keyPress(KeyEvent.VK_CONTROL);
			rb.keyPress(KeyEvent.VK_V);
			
			rb.keyRelease(KeyEvent.VK_CONTROL);
			rb.keyRelease(KeyEvent.VK_V);
			
			rb.keyPress(KeyEvent.VK_ENTER);
			rb.keyRelease(KeyEvent.VK_ENTER);
			
			driver.findElement(By.id("processTask")).click();
		}
	}



