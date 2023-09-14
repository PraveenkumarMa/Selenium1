package TestNg;

	import java.io.File;
	import java.io.IOException;
	import java.time.Duration;

	import org.apache.commons.io.FileUtils;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

import io.github.bonigarcia.wdm.WebDriverManager;


	public class Screenshort {


	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.meesho.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	File sourcefilFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File destFile = new File("C:\\Users\\ADMIN\\Pictures\\Screenshots/.img91.jpg");
	FileUtils.copyFile(sourcefilFile, destFile);
	}

	}


