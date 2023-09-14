package selenium1;

import static org.testng.Assert.assertEquals;

import java.io.FileInputStream;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


	public class TaskTestNg {

	    @Test
	    public void table() {
	    	
	    	
	    	
	    	WebDriverManager.chromedriver().setup();
	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("http://poojastore.marolix.com/Authenticate/Login");
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));

	        driver.findElement(By.name("emailid")).sendKeys(praveen27.marolix@gmail.com);
	        driver.findElement(By.name("pword")).sendKeys(Praveen27);
	        
	    }}