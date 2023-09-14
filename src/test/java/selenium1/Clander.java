package selenium1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Clander {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	String Date="24";
	String Month="August";
	String Year="2024";
	driver.findElement(By.id("first_date_picker")).click();
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scroleBy(0,300)");
    while(true) {
	String date=driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
	System.out.println(date);
	String Month_Year[]=date.split(" ");
	String Month1=Month_Year[0]; // NOTE -- SUPERATE THE MOTH
	String Year1=Month_Year[1];  // NOTE -- SUPERATE THE YEAR
	if(Month1.equalsIgnoreCase(Month) &  Year1.equals(Year)){
	break;
	
	
	}
	else {
		driver.findElement(By.xpath("//a[@title='Next']")).click();
	
	}
}
    
    List<WebElement> Date1=driver.findElements(By.xpath("//td[@data-handler='selectDay']"));
    for(WebElement Days:Date1) {
    	if(Days.getText().equals(Date)) {
    		Days.click();
    		break;
    	}
    }
}
}