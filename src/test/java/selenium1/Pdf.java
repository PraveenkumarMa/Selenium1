package selenium1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Pdf {
	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.ilovepdf.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.xpath("//a[@title='Add more files']")).click(); // this is for i love pdf app in select document xpath 
		Robot pdf=new Robot();
		pdf.delay(3000);
		StringSelection wordpath=new StringSelection("C:\\Users\\ADMIN\\Downloads\\Ankita_Task.docx");// this line for selecting the internal word documet path
		Toolkit.getDefaultToolkit().getSystemSelection().setContents(wordpath, null); // this line is used to copy the internal word path in i l love pdf app
		
		
		pdf.keyPress(KeyEvent.VK_CONTROL); //29&30 this two lines are press the internal word documents
		pdf.keyPress(KeyEvent.VK_V);
		
		
		pdf.keyRelease(KeyEvent.VK_CONTROL); //34&35 THIS TWO LINES ARE SELECT THE INTERNAL WORD DOCUMENTS
		pdf.keyRelease(KeyEvent.VK_V);
		
		pdf.keyPress(KeyEvent.VK_ENTER); // 37&38 lines are used to press open in the internal word document 
		pdf.keyRelease(KeyEvent.VK_ENTER);
		
		driver.findElement(By.id("processTask")).click();
	}

}
