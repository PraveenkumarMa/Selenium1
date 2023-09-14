package selenium1;


import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshot1 {

	public static void main(String[] args) throws Throwable {
    WebDriverManager.chromedriver().setup();
    WebDriver driver=new ChromeDriver();
    
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    TakesScreenshot ts=(TakesScreenshot)driver;
    File src=ts.getScreenshotAs(OutputType.FILE);
    File trgt=new File("./target/guru.png");
    FileUtils.copyFile(src, trgt);
	}

}
